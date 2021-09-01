
package ejerbiblioteca;

import java.util.ArrayList;


public class Prestamo {
    private String fechaPrestamo;
    private String fechaVencimiento;
    private String fechaDevolucion;
    ArrayList <Ejemplar> ejemplar;

    public Prestamo(String fechaPrestamo, String fechaVencimiento, String fechaDevolucion, ArrayList<Ejemplar> ejemplar) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaDevolucion = fechaDevolucion;
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaPrestamo=" + fechaPrestamo + ", fechaVencimiento=" + fechaVencimiento + ", fechaDevolucion=" + fechaDevolucion + ", ejemplar=" + ejemplar + '}';
    }

    public ArrayList<Ejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(ArrayList<Ejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

   

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
}
