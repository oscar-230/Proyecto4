/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller; 


import DAO.EmpleadoDAO;
import Model.Empleado;
import java.util.List;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoController(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.agregarEmpleado(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleadoDAO.eliminarEmpleado(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleadoDAO.obtenerEmpleados();
    }

    public Empleado buscarEmpleadoPorIdentificacion(int identificacion) {
        return empleadoDAO.buscarEmpleadoPorIdentificacion(identificacion);
    }

    public void actualizarEmpleadoPorIdentificacion(int identificacion, Empleado empleado) {
        empleadoDAO.actualizarEmpleadoPorIdentificacion(identificacion, empleado);
    }

}
