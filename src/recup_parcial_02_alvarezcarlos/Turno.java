/*
Clase Turno 
 */
package recup_parcial_02_alvarezcarlos;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Turno {
    int nro;
    Date fecha;
    Paciente paciente;
    Empleado responsable;
    
    public Turno() {
        this.setNro(0);
        this.setFecha(null);
        this.setPaciente(new Paciente());
        this.setResponsable(new Empleado());
    }

    public Turno(int nro, Date fecha, Paciente paciente, Empleado responsable) {
        this.setNro(nro);
        this.setFecha(fecha);
        this.setPaciente(paciente);
        this.setResponsable(responsable);
    }

     
    
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }
    
    
    
}
