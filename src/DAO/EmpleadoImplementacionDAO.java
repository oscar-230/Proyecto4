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
    import java.util.List;
import javax.swing.JOptionPane;


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
        public void eliminarEmpleado(int identificacion) throws EmpleadoNotFoundException {
            Empleado empleado = buscarEmpleadoPorIdentificacion(identificacion);
            if (empleado != null) {
                empleados.remove(empleado);
            } else {
                throw new EmpleadoNotFoundException("Empleado no encontrado");
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
    }
