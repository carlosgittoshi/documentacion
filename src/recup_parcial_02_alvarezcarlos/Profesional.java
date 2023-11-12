/*
Profecional SubClase de persona 
 */
package recup_parcial_02_alvarezcarlos;

import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author Alumno
 */
public class Profesional extends Persona{
    int nroMatriculo;
    TreeMap<Integer, Especialidad> listaEsp;

    public Profesional(int id, String nombre, String apellido, Date fec_nac, int nroMatriculo, TreeMap<Integer, Especialidad> listaEsp) {
        super(id, nombre, apellido, fec_nac);
        this.setNroMatriculo(nroMatriculo);
        this.setListaEsp(listaEsp);
    }
    
    

    public int getNroMatriculo() {
        return nroMatriculo;
    }

    public void setNroMatriculo(int nroMatriculo) {
        this.nroMatriculo = nroMatriculo;
    }

    public TreeMap<Integer, Especialidad> getListaEsp() {
        return listaEsp;
    }

    public void setListaEsp(TreeMap<Integer, Especialidad> listaEsp) {
        this.listaEsp = listaEsp;
    }


    public void agendarTurno(Especialidad esp, Turno t){
        
        if(getListaEsp()==null){
            setListaEsp(new TreeMap<Integer, Especialidad>());
        }
        
        if(getListaEsp().containsKey(esp.getId())){ 
            Especialidad espProfesional = getListaEsp().get(esp.getId());
            int nroOrdenSiguiente = espProfesional.getListaTurnos().size() + 1;
                 
            t.setNro(nroOrdenSiguiente);
            espProfesional.getListaTurnos().add(t);
        }else{
            getListaEsp().put(esp.getId(), esp);
            
            Especialidad espProfesional = getListaEsp().get(esp.getId());
            int nroOrdenSiguiente = espProfesional.getListaTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);
            espProfesional.getListaTurnos().add(t);
        }
    }
    
    public void listarTurnosPorEspecialidad(){
        System.out.println("\nProfesional:" + toString());
        System.out.println("--------------------------------------");
        for(Especialidad espList:getListaEsp().values()){
            System.out.println("Especialidad:" + espList.getNombreEsp().trim());
            System.out.println("--------------------------------------");
            for(int indexTurno=0;indexTurno<espList.getListaTurnos().size();indexTurno++){
                Turno t = espList.getListaTurnos().get(indexTurno);
                System.out.println("Turno Nro:" + t.getNro() + " Para: " + t.getPaciente().toString());
            }
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("");
        }
    }
}
