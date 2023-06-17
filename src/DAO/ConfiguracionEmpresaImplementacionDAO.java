/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ConfiguracionEmpresa;

/**
 *
 * @author ASUS
 */
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
