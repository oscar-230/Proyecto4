/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.FondoPensionDAO;
import Model.FondoPension;
import java.util.List;


public class FondoPensionController {
    private FondoPensionDAO fondoPensionDAO;

    public FondoPensionController(FondoPensionDAO fondoPensionDAO) {
        this.fondoPensionDAO = fondoPensionDAO;
    }

    public void agregarFondoPension(FondoPension fondoPension) {
        fondoPensionDAO.agregarFondoPension(fondoPension);
    }

    public void eliminarFondoPension(FondoPension fondoPension) {
        fondoPensionDAO.eliminarFondoPension(fondoPension);
    }

    public List<FondoPension> obtenerFondosPension() {
        return fondoPensionDAO.obtenerFondosPension();
    }

    public FondoPension buscarFondoPensionPorCodigo(int codigo) {
        return fondoPensionDAO.buscarFondoPensionPorCodigo(codigo);
    }

    public void actualizarFondoPensionPorCodigo(int codigo, FondoPension fondoPension) {
        fondoPensionDAO.actualizarFondoPensionPorCodigo(codigo, fondoPension);
    }
    
}
