/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Model;


public class ConceptoDevengo {
    private int codigo;
    private String nombre;
    private boolean hacenBase;

    // Constructor
    public ConceptoDevengo(int codigo, String nombre, boolean hacenBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.hacenBase = hacenBase;
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

    public boolean isHacenBase() {
        return hacenBase;
    }

    public void setHacenBase(boolean hacenBase) {
        this.hacenBase = hacenBase;
    }
}

