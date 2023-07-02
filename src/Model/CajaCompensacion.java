/**
 * @author Oscar David Cuaical 
 * @author Espinosa Ossa Diego Armando
 * @author Pitto Calambas Johan David
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Model;


public class CajaCompensacion {
    private int codigo;
    private String nombre;

    // Constructor
    public CajaCompensacion(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Métodos getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
