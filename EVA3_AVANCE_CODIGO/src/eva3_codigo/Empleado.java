
package eva3_codigo;

import java.io.Serializable;


public class Empleado extends Persona implements Serializable, Datos{
    private String CodigoEmpleado;
    private int Antiguedad;

    public Empleado() {
        super();
        this.CodigoEmpleado = "";
        this.Antiguedad = 0;
    }

    public Empleado(String CodigoEmpleado, int Antiguedad, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.CodigoEmpleado = CodigoEmpleado;
        this.Antiguedad = Antiguedad;
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + this.getNombre() + " "+ this.getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Antiguedad en la empresa: " + this.getAntiguedad());
        System.out.println("Codigo de empleado: "+ this.getCodigoEmpleado());
    }

    
}
