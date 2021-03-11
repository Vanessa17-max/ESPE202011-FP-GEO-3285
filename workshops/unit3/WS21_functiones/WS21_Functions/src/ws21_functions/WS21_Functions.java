/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21_functions;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class WS21_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("=================================================");
        System.out.println(" VANESSA TONATO");
        System.out.println("================================================="); 
        
        float products = 0;
        float price = 0;
        float IVA = 0;
        float cantidad_vendida;
        float monto_total = 0;
        
        Scanner keyboard = new Scanner(System.in);    

        calculatePriceRefrigerator(products); 
        
        calculateProducts(monto_total);
        
        System.out.println("=================================================");
        System.out.println(" THANKKS FOR USING OUR PROGRAM");
        System.out.println("================================================="); 
        }

    private static float calculateProducts(float cantidad_vendida) {
        float monto_total = 0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("\nEnter the quantity sold for this product:");
        cantidad_vendida = keyboard.nextInt();
        System.out.printf("\nPrice of this sale:%f", cantidad_vendida*2.50);
        monto_total += cantidad_vendida*2.50;
        return monto_total;
    }

    private static float calculatePriceRefrigerator(float products) {
        float IVA;
        float price;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the retail value of a used refrigerator--> ");
        products=keyboard.nextFloat();
        IVA=products*0.12f;
        price = products+IVA;
        System.out.println("IVA: "+IVA+"\n Sale price: "+price );

        return price;
    }

}