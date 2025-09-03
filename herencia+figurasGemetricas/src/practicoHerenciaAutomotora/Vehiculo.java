package practicoHerenciaAutomotora;

public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private int anio;
    
    public Vehiculo(String marca, String modelo, String matricula, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.anio = anio;
    }

    public String devolverGama(){
        
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", color=" + color + ", anio=" + anio + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
            
            
            
            
            
}
