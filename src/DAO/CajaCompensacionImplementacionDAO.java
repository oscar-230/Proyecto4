/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.CajaCompensacion;
import java.util.ArrayList;
import java.util.List;


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
