/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.EPS;
import java.util.ArrayList;
import java.util.List;


public class EPSImplementacionDAO implements EPS_DAO{
    private List<EPS> epsList;

    public EPSImplementacionDAO() {
        epsList = new ArrayList<>();
    }

    @Override
    public void agregarEPS(EPS eps) {
        epsList.add(eps);
    }

    @Override
    public void eliminarEPS(EPS eps) {
        epsList.remove(eps);
    }

    @Override
    public List<EPS> obtenerEPS() {
        return epsList;
    }

    @Override
    public EPS buscarEPSPorCodigo(int codigo) {
        for (EPS eps : epsList) {
            if (eps.getCodigo() == codigo) {
                return eps;
            }
        }
        return null;
    }

    @Override
    public void actualizarEPSPorCodigo(int codigo, EPS eps) {
        for (int i = 0; i < epsList.size(); i++) {
            EPS epsTemp = epsList.get(i);
            if (epsTemp.getCodigo() == codigo) {
                epsList.set(i, eps);
                break;
            }
        }
    }
}
