
package appdocente;

public class Docente {
    
    private String nombre;
    private String documento;
    private int    categoria;
    private int    horasTrabajas;
    private double salario;
    
    public Docente(){
    
    }

    public Docente(String nombre, String documento, int categoria, int horasTrabajas) {
        this.nombre = nombre;
        this.documento = documento;
        this.categoria = categoria;
        this.horasTrabajas = horasTrabajas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getHorasTrabajas() {
        return horasTrabajas;
    }

    public void setHorasTrabajas(int horasTrabajas) {
        this.horasTrabajas = horasTrabajas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
         this.salario=this.horasTrabajas*Categoria.getValorPorCategoria(this.categoria);
    }
    
    
    
}
