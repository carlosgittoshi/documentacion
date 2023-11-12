/*
Clase recurso
 */
package recup_parcial_02_alvarezcarlos;

/**
 *
 * @author Alumno
 */
public class Recurso {
    int id;
    String nombre;
    String tipoRecurso;
    String descripcion;    
    

    public Recurso(){
    this.setId(0);
    this.setNombre("");
    this.setTipoRecurso("");
    this.setDescripcion("");
    }

    public Recurso(int id, String nombre, String tipoRecurso, String descripcion) {
        this.setId(id);
        this.setNombre(nombre);
        this.setTipoRecurso(tipoRecurso);
        this.setDescripcion(descripcion);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
