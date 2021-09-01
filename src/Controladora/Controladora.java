
package Controladora;

import ejerbiblioteca.Alumno;
import ejerbiblioteca.Personal;
import ejerbiblioteca.Libro;
import ejerbiblioteca.Ejemplar;
import ejerbiblioteca.Prestamo;
import java.util.ArrayList;
import java.util.Objects;


public class Controladora {
    ArrayList <Alumno> alumno = new ArrayList();
    ArrayList <Personal> personal = new ArrayList();
    ArrayList <Libro> libro = new ArrayList();
    ArrayList <Prestamo> prestamo = new ArrayList();

public void agregarAlumno(Integer mat,Integer dni, String nom, String apel, String fecnac,ArrayList <Prestamo> prestamo){
  Alumno alu = new Alumno(mat,dni,nom,apel,fecnac,prestamo);
  if(validarAlumno(alu)){
     alumno.add(new Alumno(mat,dni,nom,apel,fecnac,prestamo));
     System.out.println(alumno);
  }
   
}
public boolean validarAlumno(Alumno alu){ 
    Alumno al;
    for(Alumno a:alumno){
        al=a;
        if(Objects.equals(al.getMatricula(), alu.getMatricula())){
         System.out.println("Ya se ha registrado");
       return false;
     }
     
  }

  return true;
    
    
    
    
}

public void agregarPersonal(String leg,String feching, Integer dni, String nom, String ape, String fechanac,ArrayList <Prestamo> prestamo){
  Personal pers = new Personal(leg,feching,dni,nom,ape,fechanac,prestamo);
  if(validarPersonal(pers)){
  personal.add(pers);
  System.out.println(personal);
  }
 
    
    
}
  public boolean validarPersonal(Personal pers){ 
    
    for(Personal p:personal){
       
      if(Objects.equals(p.getDni(), pers.getDni())){
      
         System.out.println("Ya se ha registrado");
         
       return false;
     
     }
     
  }

  return true;
  }
  
  
  
public void agregarLibro(Integer cod,String titulo,Integer edic,ArrayList <Ejemplar> ejemplar){
 Libro lib= new Libro(cod,titulo,edic,ejemplar);
  if(validarLibro(lib)){
  libro.add(lib); 
  System.out.println(libro);
 }
}
    
    

  public boolean validarLibro(Libro lib){ 

    for(Libro l:libro){
       
      if(Objects.equals(l.getCodigo(), lib.getCodigo())){
      
         System.out.println("Ya se ha registrado");
         
       return false;
     
     }
     
  }

  return true;
  }
public void agregarEjemplar(ArrayList <Ejemplar> ejemplar ,Ejemplar ejem){
  if(validarEjemplar(ejem,ejemplar)){
  ejemplar.add(ejem); 
  System.out.println(ejemplar);
 }
}
 public boolean validarEjemplar(Ejemplar ejem,ArrayList <Ejemplar> ejemplar){ 
    
        for(Ejemplar e:ejemplar){
            if(Objects.equals(e.getNroEjemplar(), ejem.getNroEjemplar())){
                System.out.println("Ya se ha registrado");
                return false;
            }  
        }
    return true;
 }
}









