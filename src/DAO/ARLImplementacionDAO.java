/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ARL;
import java.util.ArrayList;
import java.util.List;


public class ARLImplementacionDAO implements ARL_DAO{
    
    private List<ARL> arlList;

    public ARLImplementacionDAO() {
        arlList = new ArrayList<>();
    }

    @Override
    public void guardarARL(ARL arl) {
        arlList.add(arl);
    }

    @Override
    public ARL buscarARLPorCodigo(int codigo) {
        for (ARL arl : arlList) {
            if (arl.getCodigo() == codigo) {
                return arl;
            }
        }
        return null;
    }

    @Override
    public List<ARL> obtenerTodasARL() {
        return arlList;
    }

    @Override
    public void actualizarARL(ARL arl) {
        int index = arlList.indexOf(arl);
        if (index != -1) {
            arlList.set(index, arl);
        }
    }

    @Override
    public void eliminarARL(ARL arl) {
        arlList.remove(arl);
    }
    
}
