
package Controladora;

import ejerbiblioteca.Alumno;
import ejerbiblioteca.Personal;
import ejerbiblioteca.Libro;
import ejerbiblioteca.Ejemplar;
import java.util.ArrayList;
import java.util.Objects;


public class Controladora {
    ArrayList <Alumno> alumno = new ArrayList();
    ArrayList <Personal> personal = new ArrayList();
    ArrayList <Libro> libro = new ArrayList();
    ArrayList <Ejemplar> ejemplar = new ArrayList();

public void agregarAlumno(Integer mat,Integer dni, String nom, String apel, String fecnac){
  Alumno alu = new Alumno(mat,dni,nom,apel,fecnac);
  if(validarAlumno(alu)){
  alumno.add(new Alumno(mat,dni,nom,apel,fecnac));
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

public void agregarPersonal(String leg,String feching, Integer dni, String nom, String ape, String fechanac){
  Personal pers = new Personal(leg,feching,dni,nom,ape,fechanac);
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
  
  
  
public void agregarLibro(Integer cod,String titulo,Integer edic){
 Libro lib= new Libro(cod,titulo,edic);
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
public void agregarEjemplar(Integer nroEjemplar, String signatura, Integer canDiasPrestamo, boolean estado){
 Ejemplar ejem= new Ejemplar(nroEjemplar,signatura,canDiasPrestamo,estado);
  if(validarEjemplar(ejem)){
      
  ejemplar.add(ejem); 
  System.out.println(ejemplar);
 }
}
 public boolean validarEjemplar(Ejemplar ejem){ 
    
    for(Ejemplar e:ejemplar){
       
      if(Objects.equals(e.getNroEjemplar(), ejem.getNroEjemplar())){
      
         System.out.println("Ya se ha registrado");
         
       return false;
     
     }
     
  }
    return true;
 }
}
   








