package proyecto;
import java.util.Comparator;

public class Graficadora implements Comparable<Graficadora>{
    private String nombre;
    private String chipset;
    private int memoria;
    private int frecuencia_basica_reloj;
    private int frecuencia_maxima_reloj;
    private String color;
    private double longitud;
    private int calificacion;
    private double precio;
    
    public Graficadora(String _nombre,String _chipset,int _memoria,int _frecuencia_basica_reloj,int _frecuencia_maxima_reloj,String _color,double _longitud,int _calificacion,double _precio) {
        
        this.nombre = _nombre;
        this.chipset = _chipset;
        this.memoria = _memoria;
        this.frecuencia_basica_reloj = _frecuencia_basica_reloj;
        this.frecuencia_maxima_reloj = _frecuencia_maxima_reloj;
        this.color = _color;
        this.longitud = _longitud;
        this.calificacion = _calificacion;
        this.precio = _precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getFrecuencia_basica_reloj() {
        return frecuencia_basica_reloj;
    }

    public void setFrecuencia_basica_reloj(int frecuencia_basica_reloj) {
        this.frecuencia_basica_reloj = frecuencia_basica_reloj;
    }

    public int getFrecuencia_maxima_reloj() {
        return frecuencia_maxima_reloj;
    }

    public void setFrecuencia_maxima_reloj(int frecuencia_maxima_reloj) {
        this.frecuencia_maxima_reloj = frecuencia_maxima_reloj;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
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

    public int compareTo(Graficadora gf) {
        int result;
        if(precio < gf.getPrecio())
            result = -1;
        else
            if(precio > gf.getPrecio())
                result = 1;
            else
                result = 0;
        return result;
    }
    public boolean equals(Object tm) {
        Graficadora gfO = (Graficadora)tm;
        return (frecuencia_maxima_reloj == gfO.frecuencia_maxima_reloj);
    } 
    public String toString() {
        return (nombre+", "+"precio: "+precio+" "+", "+"frecuencia_maxima_reloj: "+frecuencia_maxima_reloj);
    }

    
}
