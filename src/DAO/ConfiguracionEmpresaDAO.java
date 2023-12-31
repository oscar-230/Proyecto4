/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConfiguracionEmpresa;


public interface ConfiguracionEmpresaDAO {
    void guardarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa);
    ConfiguracionEmpresa obtenerConfiguracionEmpresa();
    void actualizarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa);

    
}
