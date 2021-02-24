/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15_matrixoperation;

import java.util.Scanner;

/**
 *
 * @author FAMILIA TONATO
 */
public class HW15_MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================================");
        System.out.println(" VANESSA TONATO");
        System.out.println("=================================================");  
        int[][] matrix_Paola = new int[4][4];
        int[][] matrix_Flores = new int[4][4];
        int[][] final_matrix = new int[4][4];
        int choise, cont;

        Scanner in = new Scanner(System.in);

        //lleno la primera matriz
        for (int i = 0; i < matrix_Paola.length; i++) {
            for (int j = 0; j < matrix_Paola.length; j++) {

                matrix_Paola[i][j] = (int) (Math.random() * 10);

            }
        }

        //lleno la segunda matriz
        for (int i = 0; i < matrix_Flores.length; i++) {
            for (int j = 0; j < matrix_Flores.length; j++) {

                matrix_Flores[i][j] = (int) (Math.random() * 10);

            }
        }

        do {
            System.out.println("What matrix operation is subtracted");
            System.out.println("1.- Subtract");
            choise = in.nextInt();

            if (choise == 1) {
                for (int i = 0; i < matrix_Paola.length; i++) {
                    for (int j = 0; j < matrix_Paola.length; j++) {

                        final_matrix[i][j] = matrix_Paola[i][j] - matrix_Flores[i][j];

                    }
                }
            } else if (choise != 1 && choise != 2) {

                System.out.println("No existe esa opcion!");
            }

            for (int i = 0; i < matrix_Paola.length; i++) {
                for (int j = 0; j < matrix_Paola.length; j++) {
                    System.out.print("[" + matrix_Paola[i][j] + "]");
                }
                if (i == 1 && choise == 1) {
                    System.out.print("   -   ");
                } else if (i == 1 && choise == 2) {
                    System.out.print("   -   ");
                } else {
                    System.out.print("       ");
                }
                for (int j = 0; j < matrix_Flores.length; j++) {
                    System.out.print("[" + matrix_Flores[i][j] + "]");

                }
                if (i == 1) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
                for (int j = 0; j < final_matrix.length; j++) {
                    System.out.print("[" + final_matrix[i][j] + "]");

                }
                System.out.println("");
            }

            System.out.println("You want to do another operation? ");
            System.out.println("1)Yes");
            System.out.println("2)Not");
            cont = in.nextInt();

        } while (cont == 1);
    System.out.println("=================================================");
System.out.println("[GOOD BYE MY FRIEND]"); 
System.out.println("=================================================");
    }
}