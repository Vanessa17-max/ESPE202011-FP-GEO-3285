/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_fisicaejercice;

import java.util.Scanner;

/**
 *
 * @author FAMILIA TONATO
 */
public class WS13_FisicaEjercice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        float area;
        float radio;
        float mayorDiagonal;
        float menorDiagonal;
        float base=0;
        float topSide=0;
        float height=0;
        float finalSpeed=0;
        float initialVelocity=0;
        float gravity = 9.8F;
        float weather=0;
        float acceleration=0;
        float distance;
        float masa=0;
        float fuerza=0;

        do {
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.println("~~~~VANESSA TONATO~~~~");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.println("  What would you like to do? ");
        System.out.println(" 1.  The area of the circle .");
        System.out.println(" 2.  The area of the rhombus.");
        System.out.println(" 3.  The area of the Trapezium");
        System.out.println(" 4.  The final speed.");
        System.out.println(" 5.  The distance.");
        System.out.println(" 6.  The acceletarion.");
        System.out.println(" 0. Exit");
        System.out.println("Enter your menu option -->> ");
        option = input.nextInt();

            switch (option) {

                case 1:

                    System.out.println("Enter the value of radio : ");
                    radio = scanner.nextFloat();
                    area = computeTheAreaOfTheCircle(radio);
                    System.out.println("The area of the circle is " + area);
                    break;
                case 2:
                    System.out.println("Enter the value of the major diagonal : ");
                    mayorDiagonal = scanner.nextFloat();
                    System.out.println("Enter the value of the minor diagonal : ");
                    menorDiagonal = scanner.nextFloat();
                    area = computeRhombuses(mayorDiagonal, menorDiagonal);
                    System.out.println("The area of the rhombus is " + area);
                    break;
                case 3:
                    area = computeTheAreaOfTheTrapezium(base, topSide, height);
                    System.out.println("The area of the Trapezium is " + area);
                    break;
                case 4:
                    finalSpeed = computeTheFinalSpeed(initialVelocity, acceleration, weather);
                    System.out.println("The final speed is " + finalSpeed);
                    break;

                case 5:
                         
                    System.out.println("Enter the value of the initialVelocity : ");
                    initialVelocity = scanner.nextFloat();
                    System.out.println("Enter the value of the weather : ");
                    weather = scanner.nextFloat();
                    System.out.println("Enter the value of the final speed : ");
                    finalSpeed = scanner.nextFloat();
                    distance = compteTheDistance(initialVelocity, finalSpeed, weather);
                    System.out.println("The distance is " + distance);
                    break;

                case 6:
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("introduce el valor de Fuerza");
                    fuerza = teclado.nextFloat();
                    System.out.println("introduce el valor de masa");
                    masa = teclado.nextFloat();
                    acceleration = computeTheAcceleration(masa,fuerza);
                    System.out.println("The acceleration is " + acceleration);
                    break;

                case 0:
                    System.out.println("Thnks for using my software");
                    System.out.println("[֍֍֍֍ GOOD BYE MY FRIEND IS VANESSA.T ֍֍֍֍]");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 7);

    }
    
    private static float computeTheAreaOfTheCircle(float radio) {

        float pi = (float) 3.14;
        float exponent = 2;
        float area;
        return (area = (float) (Math.pow(radio, exponent) * pi));

    }

    private static float computeRhombuses(float majorDiagonal, float minorDiagonal) {

        float area;
        return (area = (majorDiagonal * minorDiagonal) / 2);
    }

    private static float computeTheAreaOfTheTrapezium(float base, float topSide, float height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the base : ");
        base = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the top side : ");
        topSide = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the height : ");
        height = scanner.nextFloat();
        scanner.nextLine();
        float area;
        float result;
        result = (base + topSide) / 2;
        return (area = result * height);

    }

    private static float computeTheFinalSpeed(float initialVelocity, float acceleration, float weather) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the initialVelocity : ");
        initialVelocity = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the weather : ");
        weather = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the acceleration : ");
        acceleration = scanner.nextFloat();
        scanner.nextLine();
        float finalSpeed;
        return (finalSpeed = initialVelocity + (acceleration * weather));
    }

    private static float compteTheDistance(float initialVelocity, float finalSpeed, float weather) {

        float distance;
        return (distance = ((initialVelocity + finalSpeed) / 2) * weather);

    }

    private static float computeTheAcceleration(float masa, float fuerza) {

        float acceleration;
       return (acceleration=(fuerza/masa));          
       
    }
}




