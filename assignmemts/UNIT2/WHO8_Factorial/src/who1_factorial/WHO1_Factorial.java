/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package who1_factorial;

import java.util.Scanner;

/**
 *
 * @author FAMILIA TONATO
 */
public class WHO1_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner input= new Scanner (System.in);
        boolean mainLoop = true;
        int option;
        
    		
        do {
            System.out.println(" ======Factorial=====");
            System.out.println("1. -> Factorial");
            System.out.println("0. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

 case 1:
                int fac=1, n, i=1;
                for (; ;){
    		System.out.println("Escribir un numero");
    		n=input.nextInt ();
    		if (n>=0 && n<=15)
    		break;    			  			
    		}	
                for (i=1;i<=n;i++){
    		fac=fac*i;
    		}
    		System.out.println ("El factorial es " +fac);
                break;
 case 0:
                System.out.println("Good Bye my friend:Vanessa Tonato");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid option\n\n\n");
                break;
                }
    } while (option != 2);
   }      
 }   