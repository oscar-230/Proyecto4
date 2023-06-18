/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CajaCompensacion;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface CajaCompensacionDAO {
    void guardarCajaCompensacion(CajaCompensacion cajaCompensacion);
    CajaCompensacion buscarCajaCompensacionPorCodigo(int codigo);
    List<CajaCompensacion> obtenerTodasCajasCompensacion();
    void actualizarCajaCompensacion(CajaCompensacion cajaCompensacion);
    void eliminarCajaCompensacion(CajaCompensacion cajaCompensacion);
    
}
