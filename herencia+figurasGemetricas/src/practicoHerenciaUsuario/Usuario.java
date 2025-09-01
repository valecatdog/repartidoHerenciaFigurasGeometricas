package practicoHerenciaUsuario;


public abstract class Usuario {
    private String nombre;
    private String email;
    private int espacioDisponible;

    public Usuario(String nombre, String email, int espacioDisponible) {
        this.nombre = nombre;
        this.email = email;
        this.espacioDisponible = espacioDisponible;
    }

    public void ampliarCapacidad(int cantidad){
        this.espacioDisponible += cantidad;
    }
    
    //getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(int espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    //toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", email=" + email + ", espacioDisponible=" + espacioDisponible;
    }

   
    
    
    
    
}
