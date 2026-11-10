package Punto3;

public class Punto3 {
    public static Cola<Solicitud> seleccionarSolicitudes(Cola<Solicitud> pendientes, int minutos){
        Cola<Solicitud> seleccionadas = new Cola<>();

        if(minutos <= 0) return seleccionadas;

        int restante = minutos;
        for(Solicitud.Prioridad prioridad: Solicitud.Prioridad.values()){
            int cantidad = pendientes.size();
            for(int i = 0; i < cantidad; i++){
                Solicitud s = pendientes.desencolar();
                if(s.getPrioridad() == prioridad && s.getDuracion() <= restante){
                    seleccionadas.encolar(s);
                    restante -= s.getDuracion();
                }else{
                    pendientes.encolar(s);
                }
            }
        }
        return seleccionadas;
    }

}
