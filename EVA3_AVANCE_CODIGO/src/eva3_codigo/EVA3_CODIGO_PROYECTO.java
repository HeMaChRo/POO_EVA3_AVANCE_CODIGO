package eva3_codigo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_CODIGO_PROYECTO {

    public static void main(String[] args) throws IOException {
       
        Scanner leer = new Scanner(System.in);
        String ruta = "H:\\archivos\\datosObjetos.obj";
        boolean desicion = true;
        int elec = 0, cantP = 0;
        do {
            System.out.println("Que deseas hacer? \n1.-Registrar Empleados\n2.-Comprobar empleados ");//Añadir Automoviles, y metodos de las personas
            elec = leer.nextInt();

            switch (elec) {
                case 1:
                    System.out.print("\nCuantos empleados deseas ingresar? ");

                    int cant = leer.nextInt();
                    cantP = cant;

                    Empleado[] empleados = new Empleado[cant];

                    for (int i = 0; i < empleados.length; i++) {
                        int tipo;
                        do {
                            System.out.print("Que tipo de empleado es? 1.- Camionero  Otro.- Ejecutivo: ");
                            try {
                                leer = new Scanner(System.in);
                                tipo = leer.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("\nCaptura en formato incorrecto, intentalo otra vez: ");
                            }
                        } while (true);
                        if (tipo == 1) {

                            Camionero camionero = new Camionero();
                            leer.skip("\n");
                            System.out.print("Introduce el Nombre: ");
                            camionero.setNombre(leer.nextLine());
                            System.out.print("Introduce el Apellido: ");
                            camionero.setApellido(leer.nextLine());
                            System.out.print("Introduce el Codigo de empleado: ");
                            camionero.setCodigoEmpleado(leer.nextLine());

                            do {
                                try {
                                    leer = new Scanner(System.in);
                                    System.out.print("Introduce la Edad: ");
                                    camionero.setEdad(leer.nextInt());
                                    System.out.print("Introduce la Antiguedad: ");
                                    camionero.setAntiguedad(leer.nextInt());
                                    System.out.print("Introduce la Experiencia Previa: ");
                                    camionero.setExpPrevia(leer.nextInt());
                                    System.out.print("Introduce la Experiencia Adquirida: ");
                                    camionero.setExpAdquirida(leer.nextInt());

                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("\nCaptura en formato incorrecto, intentalo otra vez: ");                      
                                }
                            } while (true);
                            empleados[i] = camionero;

                        } else {

                            Ejecutivo ejecutivo = new Ejecutivo();
                            leer.skip("\n");
                            System.out.print("Introduce el Nombre: ");
                            ejecutivo.setNombre(leer.nextLine());
                            System.out.print("Introduce el Apellido: ");
                            ejecutivo.setApellido(leer.nextLine());
                            System.out.print("Introduce el Codigo de empleado: ");
                            ejecutivo.setCodigoEmpleado(leer.nextLine());
                            System.out.print("Introduce la Edad: ");
                            ejecutivo.setEdad(leer.nextInt());
                            System.out.print("Introduce la Antiguedad: ");
                            ejecutivo.setAntiguedad(leer.nextInt());
                            leer.skip("\n");
                            System.out.print("Introduce la Seccion: ");
                            ejecutivo.setSeccion(leer.nextLine());
                            System.out.print("Introduce el Puesto: ");
                            ejecutivo.setPuesto(leer.nextLine());

                            empleados[i] = ejecutivo;
                        }
                    }
                    
                    for (int i = 0; i < empleados.length; i++) {

                        try {
                            guardarObj(empleados[i], ruta);                            
                        } catch (IOException ex) {
                            Logger.getLogger(EVA3_CODIGO_PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    break;
                case 2:
                    
                    
                    try {
                        
                        Empleado[] empleados2 = new Empleado[cantP];
                        for (int i = 0; i < cantP; i++) {
                        
                            try {
                                empleados2[i] = leerObj(ruta);
                                empleados2[i].imprimirDatos();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(EVA3_CODIGO_PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                            }                        
                        }
                } catch (NullPointerException e) {
                    System.out.println("Debes guardar al menos un empleado previamente para poder hacer esto: ");
                }
                
                break;

                default:
                    System.out.println("Ingrese un numero valido: ");
            }
            do {
                try {
                    leer = new Scanner(System.in);
                    System.out.print("Desea hacer algo mas? (true o false): ");
                    desicion = leer.nextBoolean();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Debes contestar con true o false!!!");
                }
            } while (true);

        } while (desicion != false);

    }

    public static void guardarObj(Empleado empleado, String ruta) throws IOException {

        FileOutputStream foStream = new FileOutputStream(ruta, true);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);

        ooStream.writeObject(empleado);
        ooStream.close();
        
    }
   
    public static Empleado leerObj(String ruta) throws IOException, ClassNotFoundException {

        Empleado empleado = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);

        empleado = (Empleado) oiStream.readObject();

        return empleado;
    }

}
