/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littleanimals;

import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class LittleAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] littleAnimals;
        String[] guineapigcages = {"JL.1", "JL.2", "JL.3","JL.4","JL.5", "JL.6", "JL.7","JL.8","JL.9", "JL.10", "JL.11","JL.12","JL.13"};
        float[] Reproductionofguineapig = {6F, 2F,4F, 8F, 4F, 5F,10F,15F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of cages -> ");
        n = input.nextInt();

        littleAnimals = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        guineapigcages[0] = 10;
//        guineapigcages[1] = 15;
//        guineapigcages[2] = 12;
//        guineapigcages[3] = 15;
//        guineapigcages[4] = 18;
//        guineapigcages[5] = 19;
//        guineapigcages[6] = 18;
//        guineapigcages[7] = 12;
//        guineapigcages[8] = 11;
//        guineapigcages[9] = 6;
//        guineapigcages[10] = 4;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of guinea pigs born " + (i + 1) + " -> ");
            littleAnimals[i] = input.nextInt();
        }

        for (int guineapig : littleAnimals) {
            System.out.println("How many guinea pigs are there now " + guineapig);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("eggs of the coop " + (i + 1) + " -> " + littleAnimals[i]);
        }

        for (String guineapigbabies : guineapigcages) {
            System.out.println("New guinea pigs -> " + guineapigbabies);
        }
        
        for (int i = 0; i < Reproductionofguineapig.length ; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + Reproductionofguineapig[i]);
        }

    }

}
