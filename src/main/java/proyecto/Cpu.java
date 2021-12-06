package proyecto;

import java.util.Comparator;

public class Cpu implements Comparable<Cpu>{
      
    
    private String nombre;
    private String graficos_integrados;
    private boolean multihilos_simultaneos;
    private int nucleos;
    private double frecuencia_basica;
    private double frecuencia_max;
    private int potencia_termina;
    private int calificacion;
    private double precio;
    
    public Cpu(String _nombre,int _nucleos,double _frecuencia_basica,double _frecuencia_max,int _potencia_termina,String _graficos_integrados,boolean _multihilos_simultaneos,int _calificacion,double _precio) {
        
        this.nombre = _nombre;
        this.nucleos = _nucleos;
        this.frecuencia_basica = _frecuencia_basica;
        this.frecuencia_max = _frecuencia_max;
        this.potencia_termina = _potencia_termina;
        this.graficos_integrados = _graficos_integrados;
        this.multihilos_simultaneos = _multihilos_simultaneos;
        this.calificacion = _calificacion;
        this.precio = _precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGraficos_integrados() {
        return graficos_integrados;
    }

    public void setGraficos_integrados(String graficos_integrados) {
        this.graficos_integrados = graficos_integrados;
    }

    public boolean isMultihilos_simultaneos() {
        return multihilos_simultaneos;
    }

    public void setMultihilos_simultaneos(boolean multihilos_simultaneos) {
        this.multihilos_simultaneos = multihilos_simultaneos;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    
    public int getPotencia_termina() {
        return potencia_termina;
    }

    public void setPotencia_termina(int potencia_termina) {
        this.potencia_termina = potencia_termina;
    }
    
    public double getFrecuencia_basica() {
        return frecuencia_basica;
    }

    public void setFrecuencia_basica(double frecuencia_basica) {
        this.frecuencia_basica = frecuencia_basica;
    }

    public double getFrecuencia_max() {
        return frecuencia_max;
    }

    public void setFrecuencia_max(int frecuencia_max) {
        this.frecuencia_max = frecuencia_max;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int compareTo(Cpu cpu) {
        int result;
        if(getPrecio() < cpu.getPrecio())
            result = -1;
        else
            if(getPrecio() > cpu.getPrecio())
                result = 1;
            else
                result = 0;
        return result;
    }
    public boolean equals(Object cpu) {
        Cpu cpuO = (Cpu)cpu;
        return (nucleos == cpuO.nucleos);
    } 
    public String toString() {
        return (getNombre()+", "+"precio: "+getPrecio()+", "+" "+"numero nucleos: "+nucleos);
    } 

    
}
