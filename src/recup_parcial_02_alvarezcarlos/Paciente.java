/*
SubClase Pacientehereda de persona
 */
package recup_parcial_02_alvarezcarlos;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Paciente extends Persona{
    int dni;
    String tel;
    String domicilio;

    public Paciente(){
        this.setId(0);
        this.setNombre("");
        this.setApellido("");
        this.setFec_nac(null);
        this.setDni(0);
        this.setTel("");
        this.setDomicilio("");
    }
    
    public Paciente(int id, String nombre, String apellido, Date fec_nac, int dni, String tel, String domicilio) {
        super(id, nombre, apellido, fec_nac);
        this.setDni(dni);
        this.setTel(tel);
        this.setDomicilio(domicilio);
    }
    
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
}
