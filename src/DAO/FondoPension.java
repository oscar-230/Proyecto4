/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import java.util.List;


public interface FondoPension {
    void agregarFondoPension(FondoPension fondoPension);
    void eliminarFondoPension(FondoPension fondoPension);
    List<FondoPension> obtenerFondosPension();
    FondoPension buscarFondoPensionPorCodigo(int codigo);
    void actualizarFondoPensionPorCodigo(int codigo, FondoPension fondoPension);

}
