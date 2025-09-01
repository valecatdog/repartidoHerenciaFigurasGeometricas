package practicoHerenciaInstituto;

public class Estudiante extends Persona{
    private boolean habilitado; 

    public Estudiante(String nom, String ape, int ced, String fNac ,boolean habilitado) {
        super(nom, ape, ced, fNac);
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
    
    
    
    
}
