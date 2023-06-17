/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Model;


public class ConfiguracionEmpresa {
    private String nit;
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String representanteLegal;
    private String correoContacto;
    private int arlCodigo;
    private int cajaCompensacionCodigo;
    private double salarioMinimo;
    private double auxilioTransporte;

    // Constructor
    public ConfiguracionEmpresa(String nit, String razonSocial, String telefono, String direccion,
                                String representanteLegal, String correoContacto, int arlCodigo,
                                int cajaCompensacionCodigo, double salarioMinimo, double auxilioTransporte) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
        this.representanteLegal = representanteLegal;
        this.correoContacto = correoContacto;
        this.arlCodigo = arlCodigo;
        this.cajaCompensacionCodigo = cajaCompensacionCodigo;
        this.salarioMinimo = salarioMinimo;
        this.auxilioTransporte = auxilioTransporte;
    }

    // Métodos getters y setters
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public int getArlCodigo() {
        return arlCodigo;
    }

    public void setArlCodigo(int arlCodigo) {
        this.arlCodigo = arlCodigo;
    }

    public int getCajaCompensacionCodigo() {
        return cajaCompensacionCodigo;
    }

    public void setCajaCompensacionCodigo(int cajaCompensacionCodigo) {
        this.cajaCompensacionCodigo = cajaCompensacionCodigo;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
}

