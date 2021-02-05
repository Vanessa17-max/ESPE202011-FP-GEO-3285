/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11_method;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class WS11_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner (System.in); 
       int Operation1;
       int Operation2; 
       int multiplication; 
       int sum; 
       float divisions; 
       int mod; 
       int tablenum1; 
       int tablenum2; 
       char option;
       
     do {
System.out.print("Enter the operation 1-->"); 
Operation1 = scanner.nextInt (); 
scanner.nextLine();
System.out.print("Enter the operator 2-->"); 
Operation2 = scanner.nextInt(); 
scanner.nextLine();

if ( Operation1 % 2 == 0 && Operation2 % 2 == 0 )
        {
            System.out.println( "It's even" );
        }
        else
        {
            System.out.println( "It's odd" );
        }

if(Operation1 % 2 == 0 && Operation2 % 2 == 0) {
   ShowMutiplication(Operation1, Operation2);
    
} else if (Operation1 % 3 == 0 && Operation2 % 3 == 0){
   ShowAddition(Operation1, Operation2);
  
} else if (Operation1 % 7 == 0 && Operation2 % 7 == 0){
   ShowModulus(Operation1, Operation2);

} else if (Operation1 % 11 == 0 && Operation2 % 11 == 0){
   ShowMultiplicationTable(Operation1, Operation2);

} else if (Operation1 % 13 == 0 && Operation2 % 13 == 0){
   ShowDivisions(Operation1, Operation2);

} else{
System.out.println("This operation does not exist");
}
System.out.println("Do you want to try again? Yes[y] or No[n] -->");
option = scanner.nextLine().charAt(0); 
    
     }while (option != 'n'); 
System.out.println("==== Goodbye friends ====");
        
    }

    private static void ShowDivisions(int Operation1, int Operation2) {
        float divisions;
        divisions = Operation1 / Operation2;
        System.out.println("The division of --> " + Operation1 + "/" + Operation2 + " = " + divisions);
    }

    private static void ShowModulus(int Operation1, int Operation2) {
        int mod;
        mod = Operation1 * Operation2;
        System.out.println("The module of -->" + Operation1 + "%" + Operation2 + "-" + mod);
    }

    private static void ShowAddition(int Operation1, int Operation2) {
        int sum;
        sum = Operation1 + Operation2;
        System.out.println("The sum of -->" + Operation1 + " + " + Operation2 + " = " + sum);
    }

    private static void ShowMutiplication(int Operation1, int Operation2) {
        int multiplication;
        multiplication =Operation1 * Operation2;
        System.out.println("The multiplication of -->" + Operation1 + "*" + Operation2 + " = " + multiplication);
    }

    private static void ShowMultiplicationTable(int Operation1, int Operation2) {
        int tablenum1;
        int tablenum2;
        for (int i = 1; i <= 12; i++) {
            tablenum1 = Operation1 * i;
            System.out.println (Operation1 + ":*" + i + " = " + tablenum1 + "\n");
            
        }       System.out.println("=================================================");
        for (int j = 1; j <= 12; j++) {
            tablenum2 = Operation2 * j;
            System.out.println(Operation2 + " * " + j + " = " + tablenum2 + "\n");
        }   }
}