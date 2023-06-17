/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package DAO;

import Model.Empleado;
import java.util.List;


public interface EmpleadoDAO {
    void agregarEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
    List<Empleado> obtenerEmpleados();
    Empleado buscarEmpleadoPorIdentificacion(int identificacion);
    void actualizarEmpleadoPorIdentificacion(int identificacion, Empleado empleado);

    
}
