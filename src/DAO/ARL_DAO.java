/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ARL;
import java.util.List;


public interface ARL_DAO {
    void guardarARL(ARL arl);
    ARL buscarARLPorCodigo(int codigo);
    List<ARL> obtenerTodasARL();
    void actualizarARL(ARL arl);
    void eliminarARL(ARL arl);
    
}
