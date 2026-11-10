package Punto3;

public class Solicitud {
    public enum Prioridad{ ALTA, NORMAL}
    
    private String codigo;
    private Prioridad prioridad;
    private int duracion;

    public String getCodigo() {
        return codigo;
    }
    public Prioridad getPrioridad() {
        return prioridad;
    }
    public int getDuracion() {
        return duracion;
    }
    public Solicitud(String codigo, Prioridad prioridad, int duracion){
        this.codigo=codigo;
        this.prioridad=prioridad;
        this.duracion= duracion;
    }
    @Override  
    public String toString() {
        return codigo + "( Prioridad: " + prioridad + "duracion: " + duracion + ")" ;
    }
}
