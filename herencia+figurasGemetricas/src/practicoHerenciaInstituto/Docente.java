package practicoHerenciaInstituto;

public class Docente extends Persona{
    private int cantHoras;
    private String calidad;

    public Docente(String nom, String ape, int ced, String fNac, int cantHoras, String calidad) {
        super(nom, ape, ced, fNac);
        this.cantHoras = cantHoras;
        this.calidad = calidad;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public String getCalidad() {
        return calidad;
    }
    
    
}
