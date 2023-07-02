/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.ConceptoDevengoDAO;
import Model.ConceptoDevengo;
import java.util.List;


public class ConceptoDevengoController {
    private ConceptoDevengoDAO conceptoDevengoDAO;

    public ConceptoDevengoController(ConceptoDevengoDAO conceptoDevengoDAO) {
        this.conceptoDevengoDAO = conceptoDevengoDAO;
    }

    public void guardarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        conceptoDevengoDAO.guardarConceptoDevengo(conceptoDevengo);
    }

    public ConceptoDevengo buscarConceptoDevengoPorCodigo(int codigo) {
        return conceptoDevengoDAO.buscarConceptoDevengoPorCodigo(codigo);
    }

    public List<ConceptoDevengo> obtenerTodosConceptosDevengo() {
        return conceptoDevengoDAO.obtenerTodosConceptosDevengo();
    }

    public void actualizarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        conceptoDevengoDAO.actualizarConceptoDevengo(conceptoDevengo);
    }

    public void eliminarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        conceptoDevengoDAO.eliminarConceptoDevengo(conceptoDevengo);
    }
}
