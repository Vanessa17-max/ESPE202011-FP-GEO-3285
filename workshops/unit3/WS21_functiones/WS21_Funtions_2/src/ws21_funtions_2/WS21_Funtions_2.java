/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21_funtions_2;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class WS21_Funtions_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int costo;
  int monto_total = 0;
  int numero_producto;
  int cantidad_vendida;
Scanner entrada = new Scanner(System.in);
         boolean mainLoop = true;
        int option;

        do {
            option = readOptionfromMenu();

            switch (option) {  

 case 1:{  

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*250);
  monto_total += cantidad_vendida*250;
  break;
  }

  case 2:{   

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.50);
  monto_total += cantidad_vendida*4.50;
  break;
  } 

  case 3:{  

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*9.98);
  monto_total += cantidad_vendida*9.98;
  break;
  }  

   
  case 4:{   

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.49);
  monto_total += cantidad_vendida*4.49;
  break;
  }  

  case 5:{  

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*6.87);
  monto_total += cantidad_vendida*6.87;
  break;
  }  
  
  case 6:
  System.out.println(" THANKKS FOR USING OUR PROGRAM ");
  System.exit(0);
  break;
  default:
  System.out.println("Invalid option\n\n\n");
  break;

  }

  } while (option != 6);

  }
   
    private static int readOptionfromMenu() {
        int option;
        Scanner input = new Scanner(System.in);
        printMenu();
        option = input.nextInt();
        return option;
    }
  private static void printMenu() {    
      
   System.out.print("Este almacen vende cinco productos con los siguientes");
  
  System.out.println("Producto 1: $2.98");
  System.out.println("Producto 2: $4.50");
  System.out.println("Producto 3: $9.98");
  System.out.println("Producto 4: $4.49");
  System.out.println("Producto 5: $6.87\n");

  System.out.println("Por favor introduzca el numero del primer producto:");
  System.out.println("( 6 para terminar).");
     
  }
   }
