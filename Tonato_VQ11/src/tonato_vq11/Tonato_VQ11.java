/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonato_vq11;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class Tonato_VQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================================");
        System.out.println(" VANESSA TONATO");
        System.out.println("================================================="); 
        Scanner sc = new Scanner(System.in);
        
        compuAddition(sc);
        compuMatrix(sc);
    }

    private static void compuAddition(Scanner sc) {
        int i;
        int[] numbers = new int[5];
        double sum = 0;

        //lectura de datos y llenar el array
        System.out.println("Reading the elements 5 numbers: ");
        for (i = 0; i < 5; i++) {
            System.out.print("numbers[" + i + "]= ");
            numbers[i] = sc.nextInt();
        }
        
        //Recorrer el array y calcular la media
        for (i = 0; i < 5; i++) {
            sum += numbers[i]; //se suma el valor de esa posición
        }
        
        //Calcular y mostrar la media
        System.out.println("Total sum of the 5 numbers: "+ sum);              
                
        double average = 0;
        average = sum / 5;
        
        System.out.println("The average of the elements of the numbers is: "+ average);
    }   
      private static void compuMatrix(Scanner sc) {
        
            boolean elNumeroEsta = false;
         Scanner teclado=new Scanner(System.in);
        int a[][] = {{12}, {23}, {34}, {98}, {87}, {65}, {0}};
        int num[]=new int[7];
        
        int x;
        for(x=0;x<a.length;x++){
            System.out.print("ingrese un numero: ");
            num[x]=teclado.nextInt();
        }
        for(x=0;x<a.length;x++){
            System.out.println(num[x]);
        }

        System.out.print("buscar numero: ");
        int numer;
        numer=teclado.nextInt();

        for(x=0;x<a.length;x++){
            if (numer == num[x]) {
                System.out.println("El numero esta en el indice "+x+", en la posicion "+(x+1));
                elNumeroEsta = true;
            }
        }

        if(elNumeroEsta ==false) {
            System.out.println("El numero no esta");
        }
    }
}