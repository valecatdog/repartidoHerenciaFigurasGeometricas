package practicoHerenciaUsuario;

public class UsuarioBasico extends Usuario{
    private boolean publicidadActiva;
    private int diasDePrueba;

    public UsuarioBasico(String nombre, String email) {
        super(nombre, email, 50);
        this.publicidadActiva = true;
        this.diasDePrueba = 30;
    }

    public void ampliarCapacidad(){
        super.ampliarCapacidad(10);
    }
    
    @Override
    public String toString() {
        return "UsuarioBasico: "+super.toString() + ", publicidadActiva=" + publicidadActiva + ", diasDePrueba=" + diasDePrueba;
    }
}
