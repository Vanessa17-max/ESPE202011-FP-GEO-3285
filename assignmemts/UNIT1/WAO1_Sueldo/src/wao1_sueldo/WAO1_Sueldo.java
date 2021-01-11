package wao1_sueldo;

import java.util.Scanner;
public class WAO1_Sueldo {


    public static void main(String[] args) {
    
      Scanner entrada = new Scanner (System.in);
       int horas; 
       int precio; 
       int sueldo;
       
System.out.println("Cuantas horas laboro durante el mes"); 
horas = entrada.nextInt (); 
System.out.println ("cual es el precio por hora trabajada"); 
precio = entrada.nextInt();


sueldo = horas*precio;
System.out.println ("El sueldo del trabajador es: "+" "+sueldo);
 
    }
    
}
