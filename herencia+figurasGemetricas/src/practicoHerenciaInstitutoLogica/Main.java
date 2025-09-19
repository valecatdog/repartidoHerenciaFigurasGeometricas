package practicoHerenciaInstitutoLogica;

public class Main {
    public static void main(String[] args) {
        
        Instituto esiBuceo = new Instituto("esiBuceo");
        
    
        Estudiante estudiantel = new Estudiante("Juan", "Lopez", 48461226, "30/05/2000", true);
        esiBuceo.agregar(estudiantel);
        Estudiante estudiante2 = new Estudiante ("Marcela", "Kloosterboer", 59382385, "27/09/2001", false);
        esiBuceo.agregar(estudiante2);
        Estudiante estudiante3 = new Estudiante("Genaro", "Rodriguez", 55981772, "05/02/2000", true);
        esiBuceo.agregar(estudiante3);

        Docente docentel = new Docente("Elbio", "Lento", 37865125,"30/05/2000", 35, "Efectivo");
        esiBuceo.agregar(docentel);
        Docente docente2 = new Docente("Toribio", "González", 25678490, "30/05/2000", 20, "Interino");
        esiBuceo.agregar(docente2);
        Docente docente3 = new Docente("Ema", "Toma", 41892741, "30/05/2000", 14, "Interino");
        esiBuceo.agregar(docente3);
        
        Administrativo admin1 =new   Administrativo("Maria", "Hermida", 36728916,"30/05/2000", "Matutino");
        esiBuceo.agregar(admin1);
        Administrativo admin2 =new  Administrativo ("Clara", "Dehuevo", 18938734, "30/05/2000", "Nocturno");
        esiBuceo.agregar(admin2);
        
        System.out.println(esiBuceo.cierreNocturno());
    }
    
    /*
    me falta agregar al listado (e)
    la h
    e interfaz grafica
    */
}

