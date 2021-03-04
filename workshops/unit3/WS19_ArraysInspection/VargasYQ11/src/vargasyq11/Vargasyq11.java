/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargasyq11;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class Vargasyq11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);

        int[] value = new int[5];
        int sum = 0;

       sum = Sum(value, input, sum);
         System.out.println("The sum is" + sum);

        float TotalAverage = 3;
        int[] n = new int[3];
        float SumAverage = 0;

        for (int y = 0; y < 3; y++) {
            System.out.println("Enter the numbers for average" + (y + 1) + "->");
            n[y] = (int) input.nextInt();
        }
        TotalAverage = TotalAverage(n, SumAverage, TotalAverage);

        System.out.println("The TotalAverage is" + TotalAverage);

    }

    private static int Sum(int[] value, Scanner input, int sum) {
        for (int y = 0; y < 5; y++) {
            System.out.println("Enter the number" + y + "->");
            value[y] = input.nextInt();
            sum = sum + value[y];
        }
        return sum;
    }

    private static float TotalAverage(int[] n, float SumAverage, float TotalAverage) {
        for (int y = 0; y < n.length; y++) {
            SumAverage = SumAverage + n[y];
            TotalAverage = SumAverage / n.length;

        }
        return TotalAverage;
    }

}

