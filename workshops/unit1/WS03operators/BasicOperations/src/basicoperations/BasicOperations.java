/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author FAMILIA TONATO
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int sum;
    int addend1;
    int addend2;
    
    int minuend;
    int subtrahend;
    int difference;
    
    minuend = -23;
    subtrahend = -6;
    
    int multiplicand;
    int multiplier;
    
    multiplicand = 96;
    multiplier = 15;
    
    int dividend;
    int divider;
    
    dividend = 150;
    divider = 15;
    
    int dividend1;
    int divider2;
    
    dividend1 = 450;
    divider2 = 26;    
    


    //-23-(-6)= 17
    
    // 96 * 15 = 1440
    
    // 150 / 15 = 10
    
    // 450 & 26 = 8
    
    //initilization
    addend1 = 5;
    addend2 = 18;
    
    //operation
    sum = addend1 + addend2;
    System.out.println( "The additin of" + addend1 + "+" + addend2 + "is equal to --->" +sum);
    
    ++sum;
    System.out.println("sum is equal to -->" +sum);
    
    sum++;
    System.out.println("sum is equal to -->" +sum);
    
    System.out.println("adding one to sum ->" +(sum++));
    
    System.out.println("adding one to sum ->" +((++sum)));
    
    System.out.println("The subtraction of " + minuend + " - " + subtrahend + " is aqual to ->" + (minuend - subtrahend));    
   
    System.out.println("The multiplication of " + multiplicand + " * " + multiplier + " is equal to ->" + (multiplicand * multiplier));
            
   System.out.println("The division of " + dividend + " / " + divider + " is equal to ->" + (dividend / divider));        
    
   System.out.println("The remainder of " + dividend1 + " & " + divider2 + " is equal to ->" + (dividend1 % divider2));        
       
    }
    
}
