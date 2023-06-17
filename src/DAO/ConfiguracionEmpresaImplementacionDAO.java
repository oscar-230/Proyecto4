/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.ConfiguracionEmpresa;


public class ConfiguracionEmpresaImplementacionDAO implements ConfiguracionEmpresaDAO{
    private ConfiguracionEmpresa configuracionEmpresa;

    @Override
    public void guardarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa) {
        this.configuracionEmpresa = configuracionEmpresa;
    }

    @Override
    public ConfiguracionEmpresa obtenerConfiguracionEmpresa() {
        return configuracionEmpresa;
    }

    @Override
    public void actualizarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa) {
        this.configuracionEmpresa = configuracionEmpresa;
    }
}
