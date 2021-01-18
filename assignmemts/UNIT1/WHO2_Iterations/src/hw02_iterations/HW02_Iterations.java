/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_iterations;

/**
 *
 * @author FAMILIA TONATO
 */
public class HW02_Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int i;
    i=0;
    
    System.out.println("===== The number of file ===");
    while (i < 44) {
    System.out.println("i  -->" + (i + 1));
    // i += 1;
    i++;
    // i = i +1;
    }
            
    System.out.println("=================================================");
    System.out.println("First 22 Even numbers");
    
    int stop;
    stop = 44;
    int sum = 0;
    int addition = 1;
    for (int j = 1 ; j < stop ; j += 2){
        sum = addition + j;
    System.out.println("even number -> " + sum);
    } 
    
    System.out.println("=================================================");
    System.out.println("Multiplication Tables : 44 ");
    
    int top = 15;
    int product = 0;
    int table = 44;
    
    for (int j = 1 ; j <= top ; j ++){
    product = table * j;
    System.out.println("44 * " + j + " = " + product);
    } 
        
    }
    
}
