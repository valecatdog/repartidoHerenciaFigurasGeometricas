package practicoHerenciaInstituto;

import java.util.ArrayList;

public class Instituto {
    private ArrayList <Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList <Docente> listaDocentes = new ArrayList<>();
    private ArrayList <Administrativo> listaAdministrativos = new ArrayList<>();

    public Instituto() {
        
    }
    
    public void agregar(Estudiante est){
       listaEstudiantes.add(est); 
    }
    
    public void agregar(Docente doc){
       listaDocentes.add(doc); 
    }
    
    public void agregar(Administrativo admin){
       listaAdministrativos.add(admin); 
    }
    
    public ArrayList<Estudiante> alumnosHabilitados(){
        ArrayList <Estudiante> estudiantesHabilitados = new ArrayList<>();
        for (Estudiante e : listaEstudiantes){
            if(e.isHabilitado()){
                estudiantesHabilitados.add(e);
            }
        }
        
        return estudiantesHabilitados;
    }
    
    public ArrayList<Docente> docentesAltaDedicacion(){
        ArrayList <Docente> dedicados = new ArrayList<>();
        for (Docente d : listaDocentes){
            if(d.getCantHoras() > 15){
                dedicados.add(d);
            }
        }
        
        return dedicados;
    }
    
    public boolean cierreNocturno(){
        ArrayList<Administrativo> noCierreNocturno = new ArrayList<>();
        boolean noCierreNocturnoBoolean;
        
        for (Administrativo a : listaAdministrativos){
            if(!a.getTurno().equalsIgnoreCase("nocturno")){
                noCierreNocturno.add(a);
            }
        }
        noCierreNocturnoBoolean = !noCierreNocturno.isEmpty();
        
        return noCierreNocturnoBoolean;
    }
    
    
}
