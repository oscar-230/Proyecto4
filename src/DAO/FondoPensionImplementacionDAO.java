/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.FondoPension;
import java.util.ArrayList;
import java.util.List;



public class FondoPensionImplementacionDAO implements FondoPensionDAO{
    private List<FondoPension> fondoPensionList;

    public FondoPensionImplementacionDAO() {
        fondoPensionList = new ArrayList<>();
    }

    @Override
    public void agregarFondoPension(FondoPension fondoPension) {
        fondoPensionList.add(fondoPension);
    }

    @Override
    public void eliminarFondoPension(FondoPension fondoPension) {
        fondoPensionList.remove(fondoPension);
    }

    @Override
    public List<FondoPension> obtenerFondosPension() {
        return fondoPensionList;
    }

    @Override
    public FondoPension buscarFondoPensionPorCodigo(int codigo) {
        for (FondoPension fondoPension : fondoPensionList) {
            if (fondoPension.getCodigo() == codigo) {
                return fondoPension;
            }
        }
        return null;
    }

    @Override
    public void actualizarFondoPensionPorCodigo(int codigo, FondoPension fondoPension) {
        for (int i = 0; i < fondoPensionList.size(); i++) {
            FondoPension fondoPensionTemp = fondoPensionList.get(i);
            if (fondoPensionTemp.getCodigo() == codigo) {
                fondoPensionList.set(i, fondoPension);
                break;
            }
        }
    }

}
