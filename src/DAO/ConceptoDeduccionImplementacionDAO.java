/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConceptoDeduccion;
import java.util.ArrayList;
import java.util.List;


public class ConceptoDeduccionImplementacionDAO implements ConceptoDeduccionDAO{
    private List<ConceptoDeduccion> conceptoDeduccionList;

    public ConceptoDeduccionImplementacionDAO() {
        conceptoDeduccionList = new ArrayList<>();
    }

    @Override
    public void guardarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        conceptoDeduccionList.add(conceptoDeduccion);
    }

    @Override
    public ConceptoDeduccion buscarConceptoDeduccionPorCodigo(int codigo) {
        for (ConceptoDeduccion conceptoDeduccion : conceptoDeduccionList) {
            if (conceptoDeduccion.getCodigo() == codigo) {
                return conceptoDeduccion;
            }
        }
        return null;
    }

    @Override
    public List<ConceptoDeduccion> obtenerTodosConceptosDeduccion() {
        return conceptoDeduccionList;
    }

    @Override
    public void actualizarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        int index = conceptoDeduccionList.indexOf(conceptoDeduccion);
        if (index != -1) {
            conceptoDeduccionList.set(index, conceptoDeduccion);
        }
    }

    @Override
    public void eliminarConceptoDeduccion(ConceptoDeduccion conceptoDeduccion) {
        conceptoDeduccionList.remove(conceptoDeduccion);
    }
}
