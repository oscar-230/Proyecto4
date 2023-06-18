/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConceptoDevengo;
import java.util.List;


public interface ConceptoDevengoDAO {
    void guardarConceptoDevengo(ConceptoDevengo conceptoDevengo);
    ConceptoDevengo buscarConceptoDevengoPorCodigo(int codigo);
    List<ConceptoDevengo> obtenerTodosConceptosDevengo();
    void actualizarConceptoDevengo(ConceptoDevengo conceptoDevengo);
    void eliminarConceptoDevengo(ConceptoDevengo conceptoDevengo);

}
