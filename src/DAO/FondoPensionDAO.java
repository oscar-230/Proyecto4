/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.FondoPension;
import java.util.List;


public interface FondoPensionDAO {
    void agregarFondoPension(FondoPension fondoPension);
    void eliminarFondoPension(FondoPension fondoPension);
    List<FondoPension> obtenerFondosPension();
    FondoPension buscarFondoPensionPorCodigo(int codigo);
    void actualizarFondoPensionPorCodigo(int codigo, FondoPension fondoPension);

}
