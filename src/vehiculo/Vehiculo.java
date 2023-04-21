package vehiculo;

/**
 *
 * @author danie
 */
import java.util.Scanner;
public abstract class Vehiculo {
    
    
    private static int vehiculosCreados = 0;
    private static int kilometrajeTotal = 0;
    private static int kmBicicleta = 0;
    private static int kmCoche = 0;
    
    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }
    
    public static int getvehiculosCreados()
    {
        return vehiculosCreados;
    }
    
    public static void setVehiculosCreados()
    {
        vehiculosCreados =+ 1;
    }
    
    public static void setKilometrajeTotal(int km) { // Añade km
        kilometrajeTotal += km; // Añade km a kmTotales
    }

    public static int getKmTotalBicicleta() { // Pide kmBicicleta
        return kmBicicleta; // Devuelve kmBicicleta
    }

    public static void setKmTotalBicicleta(int km) { // Añade km
        kmBicicleta += km; // Añade km a kmBicicleta
    }

    public static int getKmTotalCoche() { // Pide kmCoche
        return kmCoche; // Devuelve kmCoche
    }

    public static void setKmTotalCoche(int km) { // Añade km
        kmCoche += km; // Añade km a kmCoche
    }
   
 

}
