/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;

import DAO.ConfiguracionEmpresaDAO;
import Model.ConfiguracionEmpresa;


public class ConfiguracionEmpresaController {
    private ConfiguracionEmpresaDAO configuracionEmpresaDAO;

    public ConfiguracionEmpresaController(ConfiguracionEmpresaDAO configuracionEmpresaDAO) {
        this.configuracionEmpresaDAO = configuracionEmpresaDAO;
    }

    public void guardarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa) {
        configuracionEmpresaDAO.guardarConfiguracionEmpresa(configuracionEmpresa);
    }

    public ConfiguracionEmpresa obtenerConfiguracionEmpresa() {
        return configuracionEmpresaDAO.obtenerConfiguracionEmpresa();
    }

    public void actualizarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa) {
        configuracionEmpresaDAO.actualizarConfiguracionEmpresa(configuracionEmpresa);
    }
}
