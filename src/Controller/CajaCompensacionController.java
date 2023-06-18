/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.CajaCompensacionDAO;
import Model.CajaCompensacion;
import java.util.List;


public class CajaCompensacionController {
    private CajaCompensacionDAO cajaCompensacionDAO;

    public CajaCompensacionController(CajaCompensacionDAO cajaCompensacionDAO) {
        this.cajaCompensacionDAO = cajaCompensacionDAO;
    }

    public void guardarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        cajaCompensacionDAO.guardarCajaCompensacion(cajaCompensacion);
    }

    public CajaCompensacion buscarCajaCompensacionPorCodigo(int codigo) {
        return cajaCompensacionDAO.buscarCajaCompensacionPorCodigo(codigo);
    }

    public List<CajaCompensacion> obtenerTodasCajasCompensacion() {
        return cajaCompensacionDAO.obtenerTodasCajasCompensacion();
    }

    public void actualizarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        cajaCompensacionDAO.actualizarCajaCompensacion(cajaCompensacion);
    }

    public void eliminarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        cajaCompensacionDAO.eliminarCajaCompensacion(cajaCompensacion);
    }
    
}
