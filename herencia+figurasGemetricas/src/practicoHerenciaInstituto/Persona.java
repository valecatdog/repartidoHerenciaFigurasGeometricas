package practicoHerenciaInstituto;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private String fNac;
    
    public Persona(String nom, String ape, int ced, String fNac){
        this.nombre = nom;
        this.apellido = ape;
        this.cedula = ced;
        this.fNac = fNac;
    }
    
    /*
    A)-Esta clase se crea ya que las que pide la letra comparten los mismos atributos. En estos casos
    es lo mas óptimo es hacer una clase que les herede
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }
}
