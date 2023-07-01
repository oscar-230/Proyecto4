/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */
package DAO;

import Exceptions.EmpleadoNotFoundException;
import Model.Empleado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoImplementacionDAO implements EmpleadoDAO {
    private List<Empleado> empleados;
    private List<Integer> documentosEmpleados;
    private EmpleadoDAO empleadoDAO;

    public EmpleadoImplementacionDAO(EmpleadoDAO empleadoDAO, List<Integer> documentosEmpleados) {
        this.empleadoDAO = empleadoDAO;
        this.documentosEmpleados = documentosEmpleados;
    }
    
    public boolean existeEmpleado(int identificacion) {
        return documentosEmpleados.contains(identificacion);
    }
    
    public EmpleadoImplementacionDAO() {
        empleados = new ArrayList<>();
        documentosEmpleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        documentosEmpleados.add(empleado.getIdentificacion());
    }

    @Override
    public void eliminarEmpleado(int identificacion) throws EmpleadoNotFoundException {
        boolean empleadoEncontrado = false;
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getIdentificacion() == identificacion) {
                iterator.remove();
                empleadoEncontrado = true;
                break;
            }
        }

        if (!empleadoEncontrado) {
            throw new EmpleadoNotFoundException("No se encontró ningún empleado con ese número de documento.");
        }
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
        Empleado empleadoExistente = buscarEmpleadoPorIdentificacion(identificacion);
        if (empleadoExistente != null) {
            empleadoExistente.setApellidos(empleado.getApellidos());
            empleadoExistente.setNombres(empleado.getNombres());
            empleadoExistente.setDireccion(empleado.getDireccion());
            empleadoExistente.setEpsCodigo(empleado.getEpsCodigo());
            empleadoExistente.setFppCodigo(empleado.getFppCodigo());
            empleadoExistente.setTipoTrabajador(empleado.getTipoTrabajador());
            empleadoExistente.setTipoSalario(empleado.getTipoSalario());
            empleadoExistente.setNumeroCuentaBancaria(empleado.getNumeroCuentaBancaria());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con la identificación proporcionada.", "Empleado no encontrado", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void setDocumentosEmpleados(List<Integer> documentosEmpleados) {
        this.documentosEmpleados = documentosEmpleados;
    }

    public List<Integer> getDocumentosEmpleados() {
        return documentosEmpleados;
    }
}
