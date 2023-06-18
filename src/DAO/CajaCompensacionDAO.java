/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.CajaCompensacion;
import java.util.List;


public interface CajaCompensacionDAO {
    void guardarCajaCompensacion(CajaCompensacion cajaCompensacion);
    CajaCompensacion buscarCajaCompensacionPorCodigo(int codigo);
    List<CajaCompensacion> obtenerTodasCajasCompensacion();
    void actualizarCajaCompensacion(CajaCompensacion cajaCompensacion);
    void eliminarCajaCompensacion(CajaCompensacion cajaCompensacion);
    
}
