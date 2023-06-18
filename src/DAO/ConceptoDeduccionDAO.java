/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConceptoDeduccion;
import java.util.List;


public interface ConceptoDeduccionDAO {
    void guardarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion);
    ConceptoDeduccion buscarConceptoDeduccionPorCodigo(int codigo);
    List<ConceptoDeduccion> obtenerTodosConceptosDeduccion();
    void actualizarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion);
    void eliminarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion);

}
