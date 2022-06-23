
package Controlador;

import Modelo.Auto;
import Modelo.Matricula;
import Modelo.Propietario;
import Servicio.AutoServicio;
import Servicio.MatriculaServicio;
import Servicio.PropietarioServicio;
import java.util.List;

/**
 *
 * @author USER
 */
public class MatriculaControl {

    private MatriculaServicio matriculaServicio = new MatriculaServicio();
    private AutoServicio autoServicio = new AutoServicio();
    private PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Matricula crearMatricula(String [] args){
        Auto auto = this.autoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Propietario propietario = this.propietarioServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Matricula matricula = new Matricula(Integer.valueOf(args[0]), Integer.valueOf(args [1]), Integer.valueOf(args[2]), args[3],auto, propietario);
        this.matriculaServicio.crear(matricula);
        return matricula;
        
    }
    
    public Matricula buscarMatricula(String arg){
        return this.matriculaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Matricula eliminar(String arg){
        return this.matriculaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Matricula modificar(String [] args){
        Auto auto = this.autoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Propietario propietario = this.propietarioServicio.buscarPorCodigo(Integer.valueOf(args[5]));
            Matricula matriculaNuevo = new Matricula(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2]), args[3], auto, propietario);
            this.matriculaServicio.modificar(Integer.valueOf(args[0]), matriculaNuevo);
           return matriculaNuevo;
}
    
    public List<Matricula> listar(){
        return this.matriculaServicio.listar();
                
    }
}
