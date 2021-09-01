
package ejerbiblioteca;


public class Personal extends Persona {
    private String legajo;
    private String fechaIngreso;

    public Personal(String legajo, String fechaIngreso, Integer dni, String nom, String apel, String fecnac) {
        super(dni, nom, apel, fecnac);
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
