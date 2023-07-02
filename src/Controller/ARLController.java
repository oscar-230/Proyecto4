/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.ARL_DAO;
import Model.ARL;
import java.util.List;


public class ARLController {
    private ARL_DAO arlDAO;

    public ARLController(ARL_DAO arlDAO) {
        this.arlDAO = arlDAO;
    }

    public void guardarARL(ARL arl) {
        arlDAO.guardarARL(arl);
    }

    public ARL buscarARLPorCodigo(int codigo) {
        return arlDAO.buscarARLPorCodigo(codigo);
    }

    public List<ARL> obtenerTodasARL() {
        return arlDAO.obtenerTodasARL();
    }

    public void actualizarARL(ARL arl) {
        arlDAO.actualizarARL(arl);
    }

    public void eliminarARL(ARL arl) {
        arlDAO.eliminarARL(arl);
    }
    
}
