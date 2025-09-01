package practicoHerenciaInstituto;

public class Administrativo extends Persona{
    private String turno;

    public Administrativo( String nom, String ape, int ced, String fNac, String turno) {
        super(nom, ape, ced, fNac);
        this.turno = turno;
    }
}
