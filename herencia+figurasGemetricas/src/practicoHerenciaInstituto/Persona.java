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
}
