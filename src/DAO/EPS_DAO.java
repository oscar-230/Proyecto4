/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.EPS;
import java.util.List;


public interface EPS_DAO {
    void agregarEPS(EPS eps);
    void eliminarEPS(EPS eps);
    List<EPS> obtenerEPS();
    EPS buscarEPSPorCodigo(int codigo);
    void actualizarEPSPorCodigo(int codigo, EPS eps);
}
