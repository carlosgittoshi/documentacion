/*
SubClase Empleado donde se cargan los trabajadores que no son médicos
 */
package recup_parcial_02_alvarezcarlos;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Empleado extends Persona {
    String cargo;

    public Empleado() {
    }
    
    
    public Empleado(String cargo, int id, String nombre, String apellido, Date fec_nac) {
        super(id, nombre, apellido, fec_nac);
        this.cargo = cargo;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
