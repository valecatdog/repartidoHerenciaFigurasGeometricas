package practicoHerenciaInstitutoLogica;

public class Administrativo extends Persona{
    private String turno;

    public Administrativo( String nom, String ape, int ced, String fNac, String turno) {
        super(nom, ape, ced, fNac);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
