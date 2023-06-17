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
public interface ConfiguracionEmpresaDAO {
    void guardarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa);
    ConfiguracionEmpresa obtenerConfiguracionEmpresa();
    void actualizarConfiguracionEmpresa(ConfiguracionEmpresa configuracionEmpresa);

    
}
