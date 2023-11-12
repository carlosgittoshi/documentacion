/*
SuperClase Persona
 */
package recup_parcial_02_alvarezcarlos;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Persona {
    int id;
    String nombre;
    String apellido;
    Date fec_nac;

    public Persona() {
        this.setId(0);
        this.setNombre("");
        this.setApellido("");
        this.setFec_nac(null);
    }
    
    
    public Persona(int id, String nombre, String apellido, Date fec_nac) {
        this.setId(id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFec_nac(fec_nac);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }
    
    @Override
    public String toString() {
        return getApellido()+" "+getNombre();
    }
    
    
}
