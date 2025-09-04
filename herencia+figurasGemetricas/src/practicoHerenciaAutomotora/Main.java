package practicoHerenciaAutomotora;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 50000, "ABC123", "Rojo", 2023, 4, true);
        Auto auto2 = new Auto("Ford", "Fiesta", 20000, "XYZ789", "Azul", 2021, 5, false);
        Auto auto3 = new Auto("Honda", "Civic", 14000, "LMN456", "Negro", 2020, 4, true);
        
        Moto moto1 = new Moto("Yamaha", "MT-07", 6000, "AAA111", "Negro", 2022, 689.0, false);
        Moto moto2 = new Moto("Xiaomi", "Mi Scooter Pro", 2000, "BBB222", "Blanco", 2023, 0.0, true);
        
        System.out.println(auto1.devolverGama());
        System.out.println(auto2.devolverGama());
        System.out.println(auto3.devolverGama());
        System.out.println(moto1.devolverGama());
        System.out.println(moto2.devolverGama());  
        
        Camion camion1 = new Camion("Scania", "R500", 300000, "CCC333", "Blanco", 2021);
        Camion camion2 = new Camion("Mercedes-Benz", "Atego", 20000, "DDD444", "Azul", 2015);
        
        System.out.println(camion1.devolverGama());
        System.out.println(camion2.devolverGama()); 
    }
}
