package figurasGeometricas;

public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double calcularArea() {
        return base*altura;
    }

    @Override
    double calcularPerimetro() {
        return base*2+altura*2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
