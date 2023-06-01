
package eva3_codigo;

import java.io.Serializable;


public class Ejecutivo extends Empleado implements Datos, Vacaciones, Salario, Serializable{
    private String puesto;
    private String seccion;

    public Ejecutivo() {
        super();
        this.puesto = "";
        this.seccion = "";
    }

    public Ejecutivo(String puesto, String seccion, String CodigoEmpleado, int Antiguedad, String Nombre, String Apellido, int edad) {
        super(CodigoEmpleado, Antiguedad, Nombre, Apellido, edad);
        this.puesto = puesto;
        this.seccion = seccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nDatos Ejecutivo: ");
        System.out.println("Nombre: " + this.getNombre() + " "+ this.getApellido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Antiguedad en la empresa: " + this.getAntiguedad());
        System.out.println("Codigo de empleado: "+ this.getCodigoEmpleado());
        System.out.println("Puesto: "+puesto);
        System.out.println("Seccion: "+seccion);
    }
    
    @Override
    public void calcularVacaciones() {
        int vacaciones = 0;        
        
        int R = getAntiguedad() / 5; 
        if ((R % 1) != 0){
            R = R - (R%1);
        }        
        
        if(getAntiguedad() > 0){
            vacaciones = 6;           
            if(getAntiguedad() > 0 && getAntiguedad() < 5){
               vacaciones = 6 + ((2 * getAntiguedad())-2);
            }if(getAntiguedad() >= 5){
                vacaciones = 6 + ((2 * getAntiguedad())-2) + (2 * R);
            }  
        }
        
        System.out.println("Dias de vacaciones: "+vacaciones);
    }

    @Override
    public void calcularSalario() {
        int salario = 2500;
        if(getAntiguedad()>0){
            salario += 1000;
        }else if(getAntiguedad()>10)
            salario += 1500;
        
        System.out.println("Salario: "+salario);
    
    }

    
    
}
