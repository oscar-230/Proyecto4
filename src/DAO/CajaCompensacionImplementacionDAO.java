/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CajaCompensacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CajaCompensacionImplementacionDAO implements CajaCompensacionDAO{
    private List<CajaCompensacion> cajaCompensacionList;

    public CajaCompensacionImplementacionDAO() {
        cajaCompensacionList = new ArrayList<>();
    }

    @Override
    public void guardarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        cajaCompensacionList.add(cajaCompensacion);
    }

    @Override
    public CajaCompensacion buscarCajaCompensacionPorCodigo(int codigo) {
        for (CajaCompensacion cajaCompensacion : cajaCompensacionList) {
            if (cajaCompensacion.getCodigo() == codigo) {
                return cajaCompensacion;
            }
        }
        return null;
    }

    @Override
    public List<CajaCompensacion> obtenerTodasCajasCompensacion() {
        return cajaCompensacionList;
    }

    @Override
    public void actualizarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        int index = cajaCompensacionList.indexOf(cajaCompensacion);
        if (index != -1) {
            cajaCompensacionList.set(index, cajaCompensacion);
        }
    }

    @Override
    public void eliminarCajaCompensacion(CajaCompensacion cajaCompensacion) {
        cajaCompensacionList.remove(cajaCompensacion);
    }
}
