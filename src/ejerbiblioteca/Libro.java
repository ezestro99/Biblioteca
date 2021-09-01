
package ejerbiblioteca;


public class Libro {
    private Integer codigo;
    private String titulo;
    private Integer edicion;

    public Libro(Integer codigo, String titulo, Integer edicion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", edicion=" + edicion + '}';
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
    
}
