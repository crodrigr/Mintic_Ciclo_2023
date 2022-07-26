package trabajoenclase;


public class Carro {
    
    //Caracteriscas o atributos
    private int modelo;
    private String marca;
    private String color;
    
    //Acciones o métodos

    public Carro(int modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
