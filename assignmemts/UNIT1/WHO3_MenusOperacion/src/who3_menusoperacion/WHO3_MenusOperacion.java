/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package who3_logicoperacion;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author FAMILIA TONATO
 */
public class WHO3_LogicOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Square root");
            System.out.println("2. -> Factorial");
            System.out.println("3. -> Triangle Area");
            System.out.println("4. -> Powe");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int RealNumber;
                    int Result;
                    System.out.println("enter a Real Number -> ");
                    RealNumber = input.nextInt();
                    Result = (int) sqrt(RealNumber);
                    System.out.println(" The Square root is --> " + Result);
                    break;
                case 2:
                    int number;
                    int factorial;
                    
                    factorial = 1;
                    System.out.println("enter nimber -> ");
                    number = input.nextInt();
                    for(int i = number; i > 0; i--){
                    System.out.println(" The Factorial is --> " + factorial);
                    break;
                    }
                case 3:
                    int Base;
                    int Height;
                    int Area;
                    System.out.println("enter the base of the triangle -> ");
                    Base = input.nextInt();
                    System.out.println("enter the height of the triangle -> ");
                    Height = input.nextInt();
                    Area = (Base * Height)/2;
                    System.out.println(" The Triangle Area is --> " + Area);
                    break;
                case 4:
                    int base;
                    int exponent;
                    int power;
                    System.out.println("The division is");
                    System.out.println("enter the base of the power -> ");
                    base = input.nextInt();
                    System.out.println("enter the exponent of the power-> ");
                    exponent = input.nextInt();
                    power = (int) Math.pow(base, exponent);
                    System.out.println(" The Powe is --> " + power);
                    break;
                case 5:
                    System.out.println("Good Bye Vanessa Tonato");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                     }

        } while (option != 5);
        
 }   
}

