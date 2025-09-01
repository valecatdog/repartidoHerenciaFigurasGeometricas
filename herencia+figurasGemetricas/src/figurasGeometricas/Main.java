package figurasGeometricas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double altura;
        double lado1;
        double lado2;
        double lado3;
        Figura[] figuras = new Figura[5];
        
        for(int i = 0; i < 2; i++){
            System.out.print("ingrese base: ");
            base = scan.nextDouble();
            System.out.print("ingrese altura: ");
            altura = scan.nextDouble();
            System.out.print("ingrese lado 1: ");
            lado1 = scan.nextDouble();
            System.out.print("ingrese lado 2: ");
            lado2 = scan.nextDouble();
            System.out.print("ingrese lado 3: ");
            lado3 = scan.nextDouble();
            
            Triangulo t = new Triangulo(base, altura, lado1, lado2, lado3);
            figuras[i] = t;
        }
        
        for(int i = 2; i < 5; i++){
            System.out.print("ingrese base: ");
            base = scan.nextDouble();
            System.out.print("ingrese altura: ");
            altura = scan.nextDouble();
            
            Rectangulo r = new Rectangulo(base, altura);
            figuras[i] = r;
        }
        
        for (int i = 0; i < 5; i++){
            System.out.println("area de figura "+(i+1)+":");
            System.out.println(figuras[i].calcularArea());
            System.out.println("perimetro de figura "+(i+1)+":");
            System.out.println(figuras[i].calcularPerimetro());
        }
    }
}
