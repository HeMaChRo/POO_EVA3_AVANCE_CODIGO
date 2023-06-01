
package eva3_codigo;

import java.io.Serializable;



public class Persona implements Serializable{
    private String Nombre;
    private String Apellido;
    private int edad;

    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.edad = 0;
    }
    
    

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
