package Punto2;

import Punto2.Pila;

public class Punto2 {
    public static <T> Pila<T> obtenerSegmento(Pila<T> pila, int inicio, int fin){
        Pila<T> resultado = new Pila<>();
        int total = pila.size();
        if (inicio < 1 || inicio > fin || fin > total) return resultado;

        Pila<T> respaldo = new Pila<>();
        Pila<T> segmento = new Pila<>();

        for (int pos = 1; pos <= total; pos++){
            T accion = pila.pop();
            respaldo.push(accion);
            if (pos >= inicio && pos <= fin) {
                segmento.push(accion);
            }
        }
        while ((!respaldo.isEmpty())) {
            pila.push(respaldo.pop());
            
        }
        while (!segmento.isEmpty()) {
            resultado.push(segmento.pop());
            
        }
        return resultado;
      
    }

}
