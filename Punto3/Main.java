package Punto3;

public class Main {

    // imprime la cola sin dañarla, saca y vuelve a meter cada elemento

     public static void print(Cola<Solicitud> cola) {
        if (cola.isEmpty()) {
            System.out.println("  (vacía)");
            return;
        }
        int n = cola.size();
        for (int i = 0; i < n; i++) {
            Solicitud s = cola.desencolar();
            System.out.println("  " + s);
            cola.encolar(s);
        }
    }

    public static void main(String[] args) {
        Cola<Solicitud> pendientes = new Cola<>();
        pendientes.encolar(new Solicitud("S1", Solicitud.Prioridad.NORMAL, 10));
        pendientes.encolar(new Solicitud("S2", Solicitud.Prioridad.ALTA, 30));
        pendientes.encolar(new Solicitud("S3", Solicitud.Prioridad.ALTA, 15));
        pendientes.encolar(new Solicitud("S4", Solicitud.Prioridad.NORMAL, 5));

        System.out.println("Pendientes al inicio:");
        print(pendientes);

        System.out.println("\nCon 0 minutos (esperado: seleccionadas vacía y pendientes sin cambios):");
        Cola<Solicitud> sel0 = Punto3.seleccionarSolicitudes(pendientes, 0);
        System.out.println("Seleccionadas:");
        print(sel0);

        System.out.println("Pendientes:");
        print(pendientes);

        System.out.println("\nCon 25 minutos (esperado: seleccionadas S3 -> S1, pendientes S2 -> S4):");
        Cola<Solicitud> sel = Punto3.seleccionarSolicitudes(pendientes, 25);
        System.out.println("Seleccionadas:");
        print(sel);
        System.out.println("Pendientes:");
        print(pendientes);
    }
}