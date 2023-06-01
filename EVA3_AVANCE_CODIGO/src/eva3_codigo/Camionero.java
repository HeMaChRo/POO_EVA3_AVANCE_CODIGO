
package eva3_codigo;

import java.io.Serializable;


public class Camionero extends Empleado implements Datos, Salario, Vacaciones, Serializable{
    private int expPrevia;
    private int expAdquirida;

    public Camionero() {
        super();
        this.expPrevia = 0;
        this.expAdquirida = 0;
    }

    public Camionero(int expPrevia, int expAdquirida, String CodigoEmpleado, int Antiguedad, String Nombre, String Apellido, int edad) {
        super(CodigoEmpleado, Antiguedad, Nombre, Apellido, edad);
        this.expPrevia = expPrevia;
        this.expAdquirida = expAdquirida;
    }

    

    public int getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(int expPrevia) {
        this.expPrevia = expPrevia;
    }

    public int getExpAdquirida() {
        return expAdquirida;
    }

    public void setExpAdquirida(int expAdquirida) {
        this.expAdquirida = expAdquirida;
    }
    
    public int getExperiencia(){
        int exp = getExpPrevia() + getExpAdquirida();
        return exp;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nDatos Camionero: ");
        System.out.println("Nombre: " + this.getNombre() + " "+ this.getApellido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Antiguedad en la empresa: " + this.getAntiguedad());
        System.out.println("Codigo de empleado: "+ this.getCodigoEmpleado());
        System.out.println("Experiencia : "+ this.getExperiencia());
    }

    @Override
    public void calcularSalario() {
        int salario = 2500;
        if(getAntiguedad()>0){
            salario += 500;
        }else if(getAntiguedad()>10)
            salario += 1500;
        
        System.out.println("Salario: "+salario);
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
    
    
    
    
}
