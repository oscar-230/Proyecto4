/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.ConceptoDeduccionDAO;
import Model.ConceptoDeduccion;
import java.util.List;


public class ConceptoDeduccionController {
     private ConceptoDeduccionDAO conceptoDeduccionDAO;

    public ConceptoDeduccionController(ConceptoDeduccionDAO conceptoDeduccionDAO) {
        this.conceptoDeduccionDAO = conceptoDeduccionDAO;
    }

    public void guardarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        conceptoDeduccionDAO.guardarConceptoDeduccion(conceptoDeduccion);
    }

    public ConceptoDeduccion buscarConceptoDeduccionPorCodigo(int codigo) {
        return conceptoDeduccionDAO.buscarConceptoDeduccionPorCodigo(codigo);
    }

    public List<ConceptoDeduccion> obtenerTodosConceptosDeduccion() {
        return conceptoDeduccionDAO.obtenerTodosConceptosDeduccion();
    }

    public void actualizarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        conceptoDeduccionDAO.actualizarConceptoDeduccion(conceptoDeduccion);
    }

    public void eliminarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        conceptoDeduccionDAO.eliminarConceptoDeduccion(conceptoDeduccion);
    }
}
