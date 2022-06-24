
package Controlador;

import Modelo.Auto;
import Servicio.AutoServicio;
import java.util.List;

/**
 *
 * @author USER
 */
public class AutoControlador {

    private AutoServicio autoServicio = new AutoServicio();
    
    public Auto crearAuto(String [] args){
        Auto auto = new Auto(Integer.valueOf(args[0]), args [1], args[2], Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.autoServicio.crear(auto);
        return auto;
    }
        
    public Auto buscarAuto(String arg){
        return this.autoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Auto eliminar(String arg){
        return this.autoServicio.eliminar(Integer.valueOf(arg));
    }
    public Auto modificar(String []args){                                                                                                   
        Auto autoNuevo = new Auto(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.autoServicio.modificar(Integer.valueOf(args[0]), autoNuevo);
        return autoNuevo;
    }
    public List<Auto> listar(){
        return this.autoServicio.listar();
    }
    
}
