
package Controladora;

import ejerbiblioteca.Ejemplar;
import ejerbiblioteca.Prestamo;
import java.util.ArrayList;



public class Ejecucion {
    
    
    public static void main (String args[]){

    Controladora control = new Controladora();
    ArrayList <Ejemplar> ejemplar = new ArrayList();
    ArrayList <Prestamo> prestamo = null;
    Ejemplar ejem = new Ejemplar(1,"asdas",5,true);
    Ejemplar ejem1 = new Ejemplar(2,"asdas",5,true);
            
    control.agregarAlumno(213142,312312,"Jose","Lopez","asdada",prestamo);
    control.agregarAlumno(413123, 13231231, "Juan", "Rodirasdad", "hola",prestamo);
    control.agregarAlumno(123123, 1121, "jorge", "manzur", "chau",prestamo);

    control.agregarAlumno(123123, 1121, "jorge", "manzur", "chau",prestamo);

    control.agregarPersonal("queonda", "6546", 1232, "Pepe", "Pepe", "1212",prestamo);

    control.agregarPersonal("queonda", "6546", 1232, "Pepe", "Pepe", "1212",prestamo);
    
    control.agregarEjemplar(ejemplar,ejem);
    control.agregarEjemplar(ejemplar,ejem1);
    
    control.agregarLibro(12312,"asdasda", 12314,ejemplar);
    control.agregarLibro(12312,"asdasda", 12314,ejemplar);
    
   
    
    
    
    }
}
  