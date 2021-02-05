/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11_refactor;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class WS11_Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================================");
        System.out.println(" VANESSA TONATO");
        System.out.println("=================================================");       
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;
        float quotient;
        int VariableX = 0;
        int VariableY= 0;
        int top=0;
        int product=0;
        int table=0;
    
  //call to divideTwoNumbers() function
    System.out.println("Write the number of dividend-->");
    dividend=input.nextInt ();
    System.out.println("Write the number of divisor-->");
    divisor=input.nextInt ();
    quotient = divideTwoNumbers(dividend, divisor);

    System.out.println(" Quotient of " + dividend + " and " + divisor + " is -> " + quotient); //0.5 or ?

System.out.println("=================================================");          
    System.out.println("Write the number of NUM1 -->");
    VariableX=input.nextInt (); 
    VariableY = ComputeSquare(VariableX);
    System.out.println("NUM2 value: " + VariableX + " ^2-->" + VariableY);

    System.out.println("Write the number of NUM1 -->");
    VariableX=input.nextInt ();     
    VariableY = ComputeSquare(VariableX);
    System.out.println("NUM2 value: " + VariableX + " ^2-->" + VariableY); 
        
    System.out.println("Write the number of NUM1 -->");
    VariableX=input.nextInt ();
    VariableY = ComputeSquare(VariableX);
    System.out.println("the square of -> " + VariableX + " <- is equal to -> " + VariableY);

System.out.println("=================================================");          
    System.out.println("Write the number of NUM1 -->");
    VariableX=input.nextInt (); 
    VariableY = ComputeParabola(VariableX);
    System.out.println("NUM2 value: NUM2 = " + VariableX + " * " + VariableX + " + 2 * " + VariableX + " + 1--> NUM2 = " + VariableY);

System.out.println("=================================================");
    System.out.println("The multiplication tables: ");
    System.out.println("Write the number of top-->");
    top=input.nextInt ();
    System.out.println("Write the number of table-->");
    table=input.nextInt ();   
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println(+ table + " * " + j + " = " + product);
    }
System.out.println("=================================================");
System.out.println("[GOOD BYE MY FRIEND]"); 
System.out.println("=================================================");
    }
    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int ComputeSquare(int VariableY) {
        
        int NUM2 = 0;
        NUM2 = VariableY * VariableY;

        return NUM2;
    }

    public static int ComputeParabola(int VariableX) {
     
        int VariableY = 0;
        VariableY = VariableX * VariableX + 2 * VariableX + 1;

        return VariableY;
    }
     public static int ShowMultiplicationTable(int top,int table) {   
    System.out.println("=================================================");
    System.out.println("The multiplication tables: ");
  
    int product=0;
    
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println( + table + " * " + j + " = " + product);
      
     } 
         return +product;
}
}