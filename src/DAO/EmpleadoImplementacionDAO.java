/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.Empleado;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoImplementacionDAO implements EmpleadoDAO{
    
    private List<Empleado> empleados;

    public EmpleadoImplementacionDAO() {
        empleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    @Override
    public Empleado buscarEmpleadoPorIdentificacion(int identificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion() == identificacion) {
                return empleado;
            }
        }
        return null;
    }

    @Override
    public void actualizarEmpleadoPorIdentificacion(int identificacion, Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            if (emp.getIdentificacion() == identificacion) {
                empleados.set(i, empleado);
                break;
            }
        }
    }
    
}
