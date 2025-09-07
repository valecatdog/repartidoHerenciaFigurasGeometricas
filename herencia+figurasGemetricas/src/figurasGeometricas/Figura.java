package figurasGeometricas;

public abstract class Figura {
    protected double base;
    protected double altura;
    
    public Figura(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    abstract double calcularArea();
    
    abstract double calcularPerimetro();
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

 
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
