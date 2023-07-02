/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConceptoDevengo;
import java.util.ArrayList;
import java.util.List;


public class ConceptoDevengoImplementacionDAO implements ConceptoDevengoDAO{
    private List<ConceptoDevengo> conceptoDevengoList;

    public ConceptoDevengoImplementacionDAO() {
        conceptoDevengoList = new ArrayList<>();
    }

    @Override
    public void guardarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        conceptoDevengoList.add(conceptoDevengo);
    }

    @Override
    public ConceptoDevengo buscarConceptoDevengoPorCodigo(int codigo) {
        for (ConceptoDevengo conceptoDevengo : conceptoDevengoList) {
            if (conceptoDevengo.getCodigo() == codigo) {
                return conceptoDevengo;
            }
        }
        return null;
    }

    @Override
    public List<ConceptoDevengo> obtenerTodosConceptosDevengo() {
        return conceptoDevengoList;
    }

    @Override
    public void actualizarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        int index = conceptoDevengoList.indexOf(conceptoDevengo);
        if (index != -1) {
            conceptoDevengoList.set(index, conceptoDevengo);
        }
    }

    @Override
    public void eliminarConceptoDevengo(ConceptoDevengo conceptoDevengo) {
        conceptoDevengoList.remove(conceptoDevengo);
    }
    
}
