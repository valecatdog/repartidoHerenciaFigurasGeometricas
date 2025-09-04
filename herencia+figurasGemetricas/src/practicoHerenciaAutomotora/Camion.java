package practicoHerenciaAutomotora;

public class Camion extends Vehiculo{
    public Camion(String marca, String modelo, int precio, String matricula, String color, int anio) {
        super(marca, modelo, precio, matricula, color, anio);
    }
    
    @Override
    String devolverGama(){
        String gama;
        
        if(this.precio >= 30000){
            gama = "alta";
        }else{
            gama = "baja";
        }
        
        return gama;
    }
    
    
    
    
}
