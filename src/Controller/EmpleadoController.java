/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Controller; 


import DAO.EmpleadoDAO;
import Exceptions.EmpleadoNotFoundException;
import Model.Empleado;
import java.util.List;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;
    
    private List<Integer> documentosEmpleados;

    public EmpleadoController(EmpleadoDAO empleadoDAO, List<Integer> documentosEmpleados) {
        this.empleadoDAO = empleadoDAO;
        this.documentosEmpleados = documentosEmpleados;
    }


    public void setDocumentosEmpleados(List<Integer> documentosEmpleados) {
        this.documentosEmpleados = documentosEmpleados;
    }
    

    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.agregarEmpleado(empleado);
    }

    public void eliminarEmpleado(int identificacion) throws EmpleadoNotFoundException {
        empleadoDAO.eliminarEmpleado(identificacion);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleadoDAO.obtenerEmpleados();
    }

    public Empleado buscarEmpleadoPorIdentificacion(int identificacion) {
        return empleadoDAO.buscarEmpleadoPorIdentificacion(identificacion);
    }

    public void actualizarEmpleadoPorIdentificacion(int identificacion, Empleado empleado) throws EmpleadoNotFoundException {
        empleadoDAO.actualizarEmpleadoPorIdentificacion(identificacion, empleado);
    }
    
}
