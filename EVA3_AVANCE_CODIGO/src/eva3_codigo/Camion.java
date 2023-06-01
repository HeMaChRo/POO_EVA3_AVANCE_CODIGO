
package eva3_codigo;

import java.io.Serializable;


public class Camion extends Vehiculo implements Datos{
    private int CapacidadCarga;
    private int remolques;

    public Camion() {
        super();
        this.CapacidadCarga = 0;
        this.remolques = 0;
    }

    public Camion(int CapacidadCarga, int remolques, String Marca, String Modelo, int Año, int Kilometraje, String Uso) {
        super(Marca, Modelo, Año, Kilometraje, Uso);
        this.CapacidadCarga = CapacidadCarga;
        this.remolques = remolques;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getRemolques() {
        return remolques;
    }

    public void setRemolques(int remolques) {
        this.remolques = remolques;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nDatos Camion: ");
        System.out.println("Marca: " + getMarca()+" "+ getModelo());
        System.out.println("Uso " + getUso());
        System.out.println("Kilometraje " + getKilometraje());
        System.out.println("Capacidad: "+ CapacidadCarga);
        System.out.println("Remolques: "+remolques);
        
    }
    
    
    
    
    
}
