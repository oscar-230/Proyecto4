/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EPS_DAO;
import Model.EPS;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class EPSController {
    private EPS_DAO epsDAO;

    public EPSController(EPS_DAO epsDAO) {
        this.epsDAO = epsDAO;
    }

    public void agregarEPS(EPS eps) {
        epsDAO.agregarEPS(eps);
    }

    public void eliminarEPS(EPS eps) {
        epsDAO.eliminarEPS(eps);
    }

    public List<EPS> obtenerEPS() {
        return epsDAO.obtenerEPS();
    }

    public EPS buscarEPSPorCodigo(int codigo) {
        return epsDAO.buscarEPSPorCodigo(codigo);
    }

    public void actualizarEPSPorCodigo(int codigo, EPS eps) {
        epsDAO.actualizarEPSPorCodigo(codigo, eps);
    }
}
