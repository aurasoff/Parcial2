package Punto2;

public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();
        for (int i = 1; i <= 6; i++) {
            pila.push("A" + i);         
             // A6 queda en el tope
        }

        System.out.println("Original (tope -> fondo): A6 A5 A4 A3 A2 A1");
        pila.print();

        System.out.println("\ninicio=2, fin=4");
        Punto2.obtenerSegmento(pila, 2, 4).print();

        System.out.println("\ninicio=3, fin=3:");
        Punto2.obtenerSegmento(pila, 3, 3).print();

        System.out.println("\ninicio=1, fin=6:");
        Punto2.obtenerSegmento(pila, 1, 6).print();

        System.out.println("\ninicio=0, fin=2 ");
        Punto2.obtenerSegmento(pila, 0, 2).print();

        System.out.println("\ninicio=4, fin=2 :");
        Punto2.obtenerSegmento(pila, 4, 2).print();

        System.out.println("\ninicio=5, fin=7 (fin supera el tamaño):");
        Punto2.obtenerSegmento(pila, 5, 7).print();

        System.out.println("\nOriginal despues de las pruebas");
        pila.print();

    }
}