package practicoHerenciaInstitutoLogica;

import java.util.ArrayList;

public class Instituto {
    private ArrayList <Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList <Docente> listaDocentes = new ArrayList<>();
    private ArrayList <Administrativo> listaAdministrativos = new ArrayList<>();
    private String nombre;//lo necesito para la interfaz grafica

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    public ArrayList<Administrativo> getListaAdministrativos() {
        return listaAdministrativos;
    }

    public void setListaAdministrativos(ArrayList<Administrativo> listaAdministrativos) {
        this.listaAdministrativos = listaAdministrativos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
