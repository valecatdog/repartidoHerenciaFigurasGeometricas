
package practicoHerenciaUsuario;

public class UsuarioPremium extends Usuario{
    private boolean soportePrioritario;
    private int cantDispositivos;

   
    public UsuarioPremium(String nombre, String email) {
        super(nombre, email, 500);
        this.soportePrioritario = true;
        this.cantDispositivos = 5;
        
    }
    
    public void ampliarCapacidad(){
        super.ampliarCapacidad(100);
    }

    @Override
    public String toString() {
        return "UsuarioPremium: " +super.toString()+", soportePrioritario=" + soportePrioritario + ", cantDispositivos=" + cantDispositivos + '}';
    }
    
    
    
    
    
}
