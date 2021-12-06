package proyecto;

import java.util.Comparator;


public class Tarjeta_Madre implements Comparable<Tarjeta_Madre>{
   
    
    private String nombre;
    private String socket_cpu;
    private String factor_forma;
    private int memoria_max;
    private int ranuras_memoria;
    private String color;
    private int calificacion;
    private double precio;
    
    public Tarjeta_Madre(String _nombre,String _socket_cpu,String _factor_forma,int _memoria_max,int _ranuras_memoria,String _color,int _calificacion,double _precio) {
        
        this.nombre = _nombre;
        this.socket_cpu = _socket_cpu;
        this.factor_forma = _factor_forma;
        this.memoria_max = _memoria_max;
        this.ranuras_memoria = _ranuras_memoria;
        this.color = _color;
        this.calificacion = _calificacion;
        this.precio = _precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSocket_cpu() {
        return socket_cpu;
    }

    public void setSocket_cpu(String socket_cpu) {
        this.socket_cpu = socket_cpu;
    }

    public String getFactor_forma() {
        return factor_forma;
    }

    public void setFactor_forma(String factor_forma) {
        this.factor_forma = factor_forma;
    }

    public int getMemoria_max() {
        return memoria_max;
    }

    public void setMemoria_max(int memoria_max) {
        this.memoria_max = memoria_max;
    }

    public int getRanuras_memoria() {
        return ranuras_memoria;
    }

    public void setRanuras_memoria(int ranuras_memoria) {
        this.ranuras_memoria = ranuras_memoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int compareTo(Tarjeta_Madre tm) {
        int result;
        if(precio < tm.getPrecio())
            result = -1;
        else
            if(precio > tm.getPrecio())
                result = 1;
            else
                result = 0;
        return result;
    }
    public boolean equals(Object tm) {
        Tarjeta_Madre tmO = (Tarjeta_Madre)tm;
        return (memoria_max == tmO.memoria_max);
    } 
    public String toString() {
        return (nombre+", "+"precio: "+precio+", "+" "+"memoria maxima: "+memoria_max);
    }
}
