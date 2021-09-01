
package ejerbiblioteca;

import java.util.ArrayList;


public class Persona {
    private Integer dni;
    private String nom;
    private String apel;
    private String fecnac;
    ArrayList <Prestamo> prestamo;

    public Persona(Integer dni, String nom, String apel, String fecnac, ArrayList<Prestamo> prestamo) {
        this.dni = dni;
        this.nom = nom;
        this.apel = apel;
        this.fecnac = fecnac;
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nom=" + nom + ", apel=" + apel + ", fecnac=" + fecnac + ", prestamo=" + prestamo + '}';
    }
    
    

    public ArrayList<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(ArrayList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }

    

    
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getFecnac() {
        return fecnac;
    }

    public void setFecnac(String fecnac) {
        this.fecnac = fecnac;
    }
       
  
    
}
