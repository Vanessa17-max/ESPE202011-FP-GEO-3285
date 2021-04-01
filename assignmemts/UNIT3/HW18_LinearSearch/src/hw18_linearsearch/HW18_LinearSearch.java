/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18_linearsearch;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class HW18_LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner input= new Scanner(System.in);
        
        int [] offerPrices  = {6,4,8,10, 12, 15, 18, 20, 23, 25, 27, 30, 32, 36, 39, 40, 42, 44, 48, 49, 50, 52, 55, 57, 60, 62, 65, 66, 68, 70, 73, 74, 76, 79, 80, 81, 85, 88, 90, 100};
        int price;
        int [] shoePrices = {15, 20, 23, 25, 28, 30, 33, 35, 39, 40, 43, 44, 45, 47, 50, 52, 55, 58, 60, 63, 65, 67, 70, 72, 75, 76, 80, 83, 85, 88, 90, 93, 95, 97, 100, 105};
        int prices;
        int highBargainPrices= 12 ;
        int lowBargainPrices = 6 ;
        System.out.println("=================================================");
        System.out.println(" VANESSA TONATO");
        System.out.println("=================================================");
        
        System.out.println("");
        System.out.println("==== *LINEAR SEARCH* ====");
        System.out.println("Enter the most expensive shoe price for purchase-->");
        price=input.nextInt();
        System.out.println("The most expensive price of shoes " + price + " The price of the shoe is in the price index--> " + search( offerPrices , price));
        
        System.out.println("");
        System.out.println("==== +BINARY SEARCH+ ====");
        System.out.println("Enter the price you want to find cheap or expensive-->");
        prices= input.nextInt(); 
        System.out.println("The price of the shoes is in the price list index-->" + binarySearch(shoePrices, lowBargainPrices, lowBargainPrices, prices));
       
        System.out.println("*************************************************");
        System.out.println("+++ < Thank you for using this program > ++++");
        System.out.println("-------------------------------------------------");
    }
    
    public static int search(int elements[], int x){

        int n = elements.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(elements[i] == x){
     return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int  elements[], int left, int right, int x){
  
        int n = elements.length;
            if(right>=left){  
              int mid = left +(right - left)/2;
          
          if(elements[mid] == x)
              return mid;
          
          if (elements[mid]>x)
            return binarySearch(elements,left,mid-1,x);
          
             return  binarySearch(elements,mid+1,right,x);
        }
        return -1;
 }
}
