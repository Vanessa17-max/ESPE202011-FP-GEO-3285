/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09.embeddedstructures;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class HW09EmbeddedStructures {

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
    multiplication =Operation1 + Operation2;
    System.out.println("The multiplication of -->" + Operation1 + "*" + Operation2 + " = " + multiplication);
    
} else if (Operation1 % 3 == 0 && Operation2 % 3 == 0){
    sum = Operation1 + Operation2; 
    System.out.println("The sum of -->" + Operation1 + " + " + Operation2 + " = " + sum);
  
} else if (Operation1 % 7 == 0 && Operation2 % 7 == 0){
mod = Operation1 * Operation2; 
System.out.println("The module of -->" + Operation1 + "%" + Operation2 + "-" + mod);

} else if (Operation1 % 11 == 0 && Operation2 % 11 == 0){
for (int i = 1; i <= 12; i++) {
tablenum1 = Operation1 * i; 
System.out.println (Operation1 + ":*" + i + " = " + tablenum1 + "\n");

}System.out.println("=================================================");
for (int j = 1; j <= 12; j++) {
tablenum2 = Operation2 * j; 
System.out.println(Operation2 + " * " + j + " = " + tablenum2 + "\n");
}

} else if (Operation1 % 13 == 0 && Operation2 % 13 == 0){
divisions = Operation1 / Operation2; 
System.out.println("The division of --> " + Operation1 + "/" + Operation2 + " = " + divisions);

} else{
System.out.println("This operation does not exist");
}
System.out.println("Do you want to try again? Yes[y] or No[n] -->");
option = scanner.nextLine().charAt(0); 
    
     }while (option != 'n'); 
System.out.println("==== Goodbye friends ====");
        
    }
}
