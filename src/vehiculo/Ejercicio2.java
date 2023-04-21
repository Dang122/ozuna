
package vehiculo;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class Ejercicio2 {
     public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
         
        Bicicleta orbea = new Bicicleta("Orbea");
        Coche ford = new Coche("Ford"); 
        int opcion;
         
        do {
         
        
         System.out.println("VEHÍCULOS");
         System.out.println("=========");
         System.out.println("1. Anda con la bicicleta");
         System.out.println("2. Haz el caballito con la bicicleta");
         System.out.println("3. Anda con el coche");
         System.out.println("4. Quema rueda con el coche");
         System.out.println("5. Ver kilometraje de la bicicleta");
         System.out.println("6. Ver kilometraje del coche");
         System.out.println("7. Ver kilometraje total");
         System.out.println("8. Salir");
         System.out.println("Elige una opción (1-8):");
         opcion = s.nextInt();
     
         
         System.out.println("");
         
         
             switch (opcion) {
                 case 1:
                    orbea.anda(1000);
                     break;
                 case 2:
                     orbea.hazCaballito(2);
                     break;
                 case 3:
                     ford.andaCoche(50);
                     break;
                 case 4:
                     ford.quemaRueda(10);
                     break;
                 case 5:
                     System.out.println("La bicicleta ha recorrido en total " + Vehiculo.getKmTotalBicicleta() + " km");
                     break;
                 case 6:
                     System.out.println("La bicicleta ha recorrido en total " + Vehiculo.getKmTotalCoche() + " km");
                     break;
                 case 7:
                     System.out.println("La bicicleta ha recorrido en total " + Vehiculo.getKilometrajeTotal() + " km");
                     break;
             }
             
             
          
         } while (opcion != 8);
         
         
         
         
         
         
     
     }
    
    
    
}
