package practicoHerenciaUsuario;

public class Main {
    public static void main(String[] args){
        UsuarioBasico usuario1 = new UsuarioBasico("Ana", "ana@gmail.com");
        UsuarioPremium usuario2 = new UsuarioPremium("juan", "juan@gmail.com");
        
        System.out.println(usuario1);
        System.out.println(usuario2);
        
        usuario1.ampliarCapacidad();
        usuario2.ampliarCapacidad();
        
         System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
