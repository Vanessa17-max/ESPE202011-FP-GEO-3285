/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17_matrixlibraries;
import java.util.Scanner;
import ec.edu.espe.tax.BasicMatrix;
/**
 *
 * @author FAMILIA TONATO
 */
public class HW17_MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     System.out.println("=================================================");
     System.out.println(" VANESSA TONATO");
     System.out.println("================================================="); 
        
        float [][] a;
        float [][] b;
        float [][] d;
        float [][] c;
        int m=0;
        int n=0;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the matrix dimensions: ");
        System.out.print("m: ");
        m = input.nextInt();
        System.out.print("n: ");
        n = input.nextInt();
        
        a = new float [m][n];
        b = new float [m][n];
        c = new float [m][n];
        d = new float [m][n];
        
        System.out.println("\nEnter the elements of the Matrix: ");
        
        a = BasicMatrix.compuMatrix(m, n, "A");
        b = BasicMatrix.compuMatrix(m, n, "B");
        
        for(int tab = 0; tab <= m / 2; tab++){
            System.out.println("\t");
        }
        
        System.out.print("The Matrix A is: ");
        BasicMatrix.compuPrintMatrix(m, n, a);
        System.out.println("");
        
        System.out.print("The Matrix B is:  ");
        BasicMatrix.compuPrintMatrix(m, n, b);
        System.out.println("");
        
        BasicMatrix.compuTranspose(n, m, d, a);
        for(int tab = 0 ; tab <= m / 2; tab++){
            System.out.print("");
        }
        System.out.println("====== Operation 1 ======");
        System.out.println("The Sum of A and B is: ");
        c = BasicMatrix.addTwoMatrix(m, n, a, b);
        BasicMatrix.compuPrintMatrix(m, n, c);
        
        System.out.println("\n====== Operation 2 ======");
        System.out.println("The Multiplication  of A and B is: ");
        c = BasicMatrix.multiplyTwoMatrix(m, n, a, b);
        BasicMatrix.compuPrintMatrix(m, n, c);
        
        System.out.println("\n====== Operation 3 ======");
        System.out.println("The Subtract of B and A is: ");
        c = BasicMatrix.subtractTwoMatrix(m, n, a, b);
        BasicMatrix.compuPrintMatrix(m, n, c);
        
        System.out.println("\n====== Operation 4 ======");
        System.out.println("The Transpose the A to D is:");
        System.out.print("D: ");
        BasicMatrix.compuPrintMatrix(n, m, d);
   
    System.out.println("=================================================");
    System.out.println("[GOOD BYE MY FRIEND]"); 
    System.out.println("================================================="); 
    
    }
        
}
