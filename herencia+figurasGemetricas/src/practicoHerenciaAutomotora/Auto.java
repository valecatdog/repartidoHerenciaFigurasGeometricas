package practicoHerenciaAutomotora;

public class Auto extends Vehiculo{
    
    private int cantPuertas;
    private boolean tieneAirbag;
    
    public Auto(String marca, String modelo, String matricula, String color, int anio, int cantPuertas, boolean tieneAirbag) {
        super(marca, modelo, matricula, color, anio);
        this.cantPuertas = cantPuertas;
        this.tieneAirbag = tieneAirbag;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public boolean isTieneAirbag() {
        return tieneAirbag;
    }

    public void setTieneAirbag(boolean tieneAirbag) {
        this.tieneAirbag = tieneAirbag;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto{" + "cantPuertas=" + cantPuertas + ", tieneAirbag=" + tieneAirbag + '}';
    }
    
    
}
