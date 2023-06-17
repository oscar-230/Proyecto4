/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller;


import Model.Empleado;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoController {
    private List<Empleado> empleados;

    public EmpleadoController() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public Empleado buscarEmpleadoPorIdentificacion(int identificacion) {
    for (Empleado empleado : empleados) {
        if (empleado.getIdentificacion() == identificacion) {
            return empleado;
        }
    }
    return null;
    }


    public List<Empleado> obtenerEmpleadosSocios() {
        List<Empleado> empleadosSocios = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getTipoTrabajador().equals("Socio")) {
                empleadosSocios.add(empleado);
            }
        }
        return empleadosSocios;
    }

    public List<Empleado> obtenerEmpleadosNoSocios() {
        List<Empleado> empleadosNoSocios = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getTipoTrabajador().equals("No socio")) {
                empleadosNoSocios.add(empleado);
            }
        }
        return empleadosNoSocios;
    }

}
