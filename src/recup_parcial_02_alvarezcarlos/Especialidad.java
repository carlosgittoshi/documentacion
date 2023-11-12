/*
Clase Especialidad
 */
package recup_parcial_02_alvarezcarlos;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Especialidad {
    
    int id;
    String nombreEsp;
    ArrayList<Turno> listaTurnos;
    
    public Especialidad(){
        this.setId(0);
        this.setNombreEsp("");
        this.setListaTurnos(new ArrayList<Turno>());
    }
    
    public Especialidad(int id, String nombreEsp, ArrayList<Turno> listaTurnos){
        this.setId(id);
        this.setNombreEsp(nombreEsp);
        this.setListaTurnos(listaTurnos);
    }
    
    public Especialidad(int id, String nombreEsp){
        this.setId(id);
        this.setNombreEsp(nombreEsp);

    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public void setNombreEsp(String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public ArrayList<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(ArrayList<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}
