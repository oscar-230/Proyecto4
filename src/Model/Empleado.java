/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package Model;


public class Empleado {
    private int identificacion;
    private int codigo;
    private String apellidos;
    private String nombres;
    private String direccion;
    private int epsCodigo;
    private int fppCodigo;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String fechaRetiro;
    private String tipoTrabajador;
    private String tipoSalario;
    private int numeroCuentaBancaria;

    
    public Empleado(int identificacion, int codigo, String apellidos, String nombres, String direccion, 
            int epsCodigo, int fppCodigo, String fechaNacimiento, String fechaIngreso, 
            String fechaRetiro, String tipoTrabajador, String tipoSalario, int numeroCuentaBancaria) {
        
        this.identificacion = identificacion;
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.epsCodigo = epsCodigo;
        this.fppCodigo = fppCodigo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoSalario = tipoSalario;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }
    
    
    @Override
    public String toString() {
        return "Identificación: " + identificacion +
                "\nCódigo: " + codigo +
                "\nApellidos: " + apellidos +
                "\nNombres: " + nombres +
                "\nDirección: " + direccion +
                "\nEPS Código: " + epsCodigo +
                "\nFPP Código: " + fppCodigo +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nFecha de Ingreso: " + fechaIngreso +
                "\nFecha de Retiro: " + fechaRetiro +
                "\nTipo de Trabajador: " + tipoTrabajador +
                "\nTipo de Salario: " + tipoSalario +
                "\nNúmero de Cuenta Bancaria: " + numeroCuentaBancaria;
    }

   
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEpsCodigo() {
        return epsCodigo;
    }

    public void setEpsCodigo(int epsCodigo) {
        this.epsCodigo = epsCodigo;
    }

    public int getFppCodigo() {
        return fppCodigo;
    }

    public void setFppCodigo(int fppCodigo) {
        this.fppCodigo = fppCodigo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

    public int getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(int numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }    
    
}
