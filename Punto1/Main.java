package Punto1;

public class Main {
    public static void main(String[] args) {
        Pila<Operacion> pila1 = new Pila<>() ;
        pila1.push(new Operacion("O1", Operacion.Estado.ANULADA));
        pila1.push(new Operacion("O2", Operacion.Estado.CONFIRMADA));
        pila1.push(new Operacion("O3", Operacion.Estado.CONFIRMADA));
        pila1.push(new Operacion("O4", Operacion.Estado.ANULADA));
        pila1.push(new Operacion("O5", Operacion.Estado.CONFIRMADA));

        System.out.println("Historial original");
        pila1.print();

        System.out.println("Ultimas dos confirmadas");
        Pila<Operacion> ultimas2= Punto1.obtenerUltimasConfirmdas(pila1, 2);
        ultimas2.print();
        System.out.println("Ultimas diez confirmadas");
        Pila<Operacion> ultimadDiez = Punto1.obtenerUltimasConfirmdas(pila1, 10);
        ultimadDiez.print();
        System.out.println("Ninguna confirmada");
        Pila<Operacion> ninguna = Punto1.obtenerUltimasConfirmdas(pila1, 0);
        ninguna.print();

        System.out.println("Historial despues de las pruebas");
        pila1.print();


    }

}
