/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso10_fuctions;

import java.util.Scanner;

/**
 *
 * @author FAMILIA TONATO
 */
public class WSO10_Fuctions {

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
        int NUM1 = 0;
        int NUM2= 0;
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
    NUM1=input.nextInt (); 
    NUM2 = f(NUM1);
    System.out.println("NUM2 value: " + NUM1 + " ^2-->" + NUM2);

    System.out.println("Write the number of NUM1 -->");
    NUM1=input.nextInt ();     
    NUM2 = f(NUM1);
    System.out.println("NUM2 value: " + NUM1 + " ^2-->" + NUM2); 
        
    System.out.println("Write the number of NUM1 -->");
    NUM1=input.nextInt ();
    NUM2 = f(NUM1);
    System.out.println("the square of -> " + NUM1 + " <- is equal to -> " + NUM2);

System.out.println("=================================================");          
    System.out.println("Write the number of NUM1 -->");
    NUM1=input.nextInt (); 
    NUM2 = g(NUM1);
    System.out.println("NUM2 value: NUM2 = " + NUM1 + " * " + NUM1 + " + 2 * " + NUM1 + " + 1--> NUM2 = " + NUM2);

System.out.println("=================================================");
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

    public static int f(int NUM1) {
        
        int NUM2 = 0;
        NUM2 = NUM1 * NUM1;

        return NUM2;
    }

    public static int g(int NUM1) {
     
        int NUM2 = 0;
        NUM2 = NUM1 * NUM1 + 2 * NUM1 + 1;

        return NUM2;
    }
     public static int tablemulriplication() {   
    System.out.println("=================================================");
    System.out.println("The multiplication tables: ");
    
    int top=0;
    int product=0;
    int table=0;
    
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println( + table + " * " + j + " = " + product);
      
     } 
         return +product;
}
}
