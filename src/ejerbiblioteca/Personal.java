
package ejerbiblioteca;

import java.util.ArrayList;


public class Personal extends Persona {
    private String legajo;
    private String fechaIngreso;

    public Personal(String legajo, String fechaIngreso, Integer dni, String nom, String apel, String fecnac, ArrayList<Prestamo> prestamo) {
        super(dni, nom, apel, fecnac, prestamo);
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }

    

    @Override
    public String toString() {
        return "Personal{" + "legajo=" + legajo + ", fechaIngreso=" + fechaIngreso + '}';
    }

  

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
