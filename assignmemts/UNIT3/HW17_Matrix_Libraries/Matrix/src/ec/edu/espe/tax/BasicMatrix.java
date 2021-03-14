/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class BasicMatrix {
    
    public static float [][] compuMatrix(int number1, int umber2, String matrix_Vane){
        
     Scanner input = new Scanner(System.in);   
        
        float[][] matrix;
        matrix = new float[number1][umber2];
        for(int i=0; i<number1; i++){
            System.out.println("-- ROW Numbers " +(i+1)+ "--");
            for(int j=0; j<number1; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }    
    
    public static void compuTranspose(int number3, int number4, float[][]top, float[][]top1){
        for(int i=0; i<number3; i++){
            for(int j=0; j<number4; j++){
                top[i][j] = top1[i][j];
            }
        }
    }
    
    public static float[][] addTwoMatrix(int number5, int number6, float[][]top2, float[][]top3){
        float[][]c;
        c = new float [number5][number6];
        
        for(int i=0; i<number5; i++){
            for(int j=0; j<number6; j++){
                c[i][j] = top2[i][j] + top3[i][j];
            }
        }
        return c;
    }
    
    public static float[][] multiplyTwoMatrix(int number7, int number8, float[][]top4, float[][]top5){
        float[][]c;
        c = new float [number7][number8];
        
        for(int i=0; i<number7; i++){
            for(int j=0; j<number8; j++){
                c[i][j] = top5[i][j] * top4[i][j];
            }
        }
        return c;
    }
    
        public static float[][] subtractTwoMatrix(int number9, int number10, float[][]top6, float[][]top7){
        float[][]c;
        c = new float [number9][number10];
        
        for(int i=0; i<number9; i++){
            for(int j=0; j<number10; j++){
                c[i][j] = top7[i][j] - top6[i][j];
            }
        }
        return c;
    }
    
    public static void compuPrintMatrix(int number11, int number12, float[][] matrix) {
        for (int i=0; i< number11; i++){
            System.out.println("");
            for(int j=0; j< number12; j++){
                if(j== 0){
                    if(i== 0){
                        System.out.print("┌ " );
                    }else if (i == number11 - 1){
                        System.out.print("└ " );
                    }else{
                        System.out.print("│ " );
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (number12 - 1)){
                    System.out.print(" " );
                }
                if ( j== (number12 - 1)){
                    if (i == 0){
                        System.out.print(" ┐" );
                    } else if ( i == number11 - 1){
                        System.out.print(" ┘" );
                    }else{
                        System.out.print(" │" );
                    }
                }
            }
        }
        System.out.println("");
    }
   
}
