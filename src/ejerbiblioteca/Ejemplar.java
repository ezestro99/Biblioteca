
package ejerbiblioteca;


public class Ejemplar {
    private Integer nroEjemplar;
    private String signatura;
    private Integer canDiasPrestamo;
    private boolean estado;
    
    
    @Override
    public String toString() {
        return "Ejemplar{" + "nroEjemplar=" + nroEjemplar + ", signatura=" + signatura + ", canDiasPrestamo=" + canDiasPrestamo + ", estado=" + estado + '}';
    }

    public Ejemplar(Integer nroEjemplar, String signatura, Integer canDiasPrestamo, boolean estado) {
        this.nroEjemplar = nroEjemplar;
        this.signatura = signatura;
        this.canDiasPrestamo = canDiasPrestamo;
        this.estado = estado;
    }

    public Integer getNroEjemplar() {
        return nroEjemplar;
    }

    public void setNroEjemplar(Integer nroEjemplar) {
        this.nroEjemplar = nroEjemplar;
    }

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public Integer getCanDiasPrestamo() {
        return canDiasPrestamo;
    }

    public void setCanDiasPrestamo(Integer canDiasPrestamo) {
        this.canDiasPrestamo = canDiasPrestamo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
