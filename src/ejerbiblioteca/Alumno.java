
package ejerbiblioteca;

import java.util.ArrayList;


public class Alumno extends Persona {
    private Integer matricula;

    public Alumno(Integer matricula, Integer dni, String nom, String apel, String fecnac, ArrayList<Prestamo> prestamo) {
        super(dni, nom, apel, fecnac, prestamo);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula +'}';
    }

   

   public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    



}
