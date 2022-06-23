
package Controlador;

import Modelo.Propietario;
import Servicio.PropietarioServicio;
import java.util.List;


public class PropietarioControl {
    
    private PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Propietario crearPropietario(String [] args){
        Propietario propietario = new Propietario(Integer.valueOf(args[0]), args[1], Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.propietarioServicio.crear(propietario);
        return propietario;
    }
    public Propietario buscarPropietario(String arg){
        return this.propietarioServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Propietario eliminar(String arg){
        return this.propietarioServicio.eliminar(Integer.valueOf(arg));
    }
    public Propietario modificar(String [] args){
        Propietario propietarioNuevo = new Propietario(Integer.valueOf(args[0]), args[1], Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.propietarioServicio.modificar(Integer.valueOf(args[0]), propietarioNuevo);
        return propietarioNuevo;
    }
    public List<Propietario> Listar(){
        return this.propietarioServicio.listar();
    }
}
