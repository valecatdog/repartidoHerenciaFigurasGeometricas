package practicoHerenciaAutomotora;

public class Moto extends Vehiculo{
    
    private double cilindrada;
    private boolean esElectrica;
     
    public Moto(String marca, String modelo, int precio, String matricula, String color, int anio, double cilindrada, boolean esElectrica) {
        super(marca, modelo, precio, matricula, color, anio);
        this.cilindrada = cilindrada;
        this.esElectrica = esElectrica;
    }

    @Override
    String devolverGama(){
        String gama;
        
        if(this.precio >= 3000){
            gama = "alta";
        }else{
            gama = "baja";
        }
        
        return gama;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Moto{" + "cilindrada=" + cilindrada + ", esElectrica=" + esElectrica + '}';
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }
    
}
