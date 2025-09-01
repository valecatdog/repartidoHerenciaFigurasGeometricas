/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author 57815971
 */
public abstract class Figura {

    //le pongo protected porque si le dejo private no me deja trabajar directamente con los atributos. 
    //con esto no se rompe tanto la encapsulacion como con un public y me deja acceder a base y altura sin usar getters
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
