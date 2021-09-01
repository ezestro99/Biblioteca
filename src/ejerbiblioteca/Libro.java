
package ejerbiblioteca;
import java.util.ArrayList;

public class Libro {
    private Integer codigo;
    private String titulo;
    private Integer edicion;
    ArrayList <Ejemplar> ejemplar;

    public Libro(Integer codigo, String titulo, Integer edicion, ArrayList<Ejemplar> ejemplar) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.edicion = edicion;
        this.ejemplar = ejemplar;
    }

   

   

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", edicion=" + edicion + ", ejemplar=" + ejemplar + '}';
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Ejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(ArrayList<Ejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

    
}
