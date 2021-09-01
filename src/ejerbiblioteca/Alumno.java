
package ejerbiblioteca;


public class Alumno extends Persona {
    private Integer matricula;

 


    
     public Alumno(Integer matricula, Integer dni, String nom, String apel, String fecnac) {
        super(dni, nom, apel, fecnac);
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
