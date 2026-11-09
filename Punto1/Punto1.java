package Punto1;

public class Punto1 {
    Pila<Operacion> resultado = new Pila<>();
    public static Pila<Operacion> obtenerUltimasConfirmdas(Pila<Operacion> historial, int n){
        Pila<Operacion> resultado = new Pila<>();
        if (n <= 0) return resultado;

        Pila<Operacion> respaldo = new Pila<>();
        Pila<Operacion> elegidas = new Pila<>();
        int contador = 0;
        
        while (!historial.isEmpty()){
            Operacion op = historial.pop();
            respaldo.push(op);
            if (contador < n && op.getEstado() == Operacion.Estado.CONFIRMADA) {
                elegidas.push(op);
                contador++;
            }
        }
        while (!respaldo.isEmpty()) {
            historial.push(respaldo.pop());
        }
        while (!elegidas.isEmpty()) {
            resultado.push(elegidas.pop());
        }
        return resultado;
    }
}
