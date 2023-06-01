
package eva3_codigo;

import java.io.Serializable;


public class Vehiculo implements Serializable {
    private String Marca;
    private String Modelo;
    private int Año;
    private int Kilometraje;
    private String Uso;

    public Vehiculo() {
        this.Marca = "";
        this.Modelo = "";
        this.Año = 0;
        this.Kilometraje = 0;
        this.Uso = "";
    }
    
    

    public Vehiculo(String Marca, String Modelo, int Año, int Kilometraje, String Uso) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Kilometraje = Kilometraje;
        this.Uso = Uso;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }
    
    
    
    
    
}
