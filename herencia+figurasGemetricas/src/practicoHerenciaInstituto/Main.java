package practicoHerenciaInstituto;

public class Main {
    public static void main(String[] args) {
        
        Instituto esiBuceo = new Instituto();
        
    
        Estudiante estudiantel = new Estudiante("Juan", "Lopez", 48461226, "30/05/2000", true);
        esiBuceo.agregar(estudiante1);
        Estudiante estudiante2 = new Estudiante ("Marcela", "Kloosterboer", 59382385, "27/09/2001", false);
        Estudiante estudiante = new Estudiante("Genaro", "Rodriguez", 55981772, "05/02/2000", true);

        Docente docentel = new Docente("Elbio", "Lento", 37865125,"30/05/2000", 35, "Efectivo");
        Docente docente2 = new Docente("Toribio", "González", 25678490, "30/05/2000", 20, "Interino");
        Docente docente3 = new Docente("Ema", "Toma", 41892741, "30/05/2000", 14, "Interino");

        Administrativo admin1 =new   Administrativo("Maria", "Hermida", 36728916,"30/05/2000", "Matutino");
        Administrativo admin2 =new  Administrativo ("Clara", "Dehuevo", 18938734, "30/05/2000", "Nocturno");
        
    }
    
    /*
    me falta agregar al listado (e)
    la h
    e interfaz grafica
    */
}

