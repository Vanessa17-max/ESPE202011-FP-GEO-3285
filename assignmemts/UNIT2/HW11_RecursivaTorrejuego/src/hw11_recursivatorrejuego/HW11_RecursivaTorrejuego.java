/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11_recursivatorrejuego;

/**
 *
 * @author FAMILIA TONATO
 */
public class HW11_RecursivaTorrejuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     HW11_RecursivaTorrejuego objHanoi = new HW11_RecursivaTorrejuego();
     objHanoi.torresHanoi(4,1,2,3);
     System.out.println("Juego Completado");
    }
    //Para soluccionar los tores de un juego
    // link de juego: http://www.uterra.com/juegos/torre_hanoi.php
    public void torresHanoi(int disco,int torre1,int torre2,int torre3){
      // Caso Base
      if(disco == 1){
          System.out.println("Mover Disco de Torre" + torre1 + " a Torre" + torre3);
      }else{
       // Dominio
       torresHanoi(disco-1,torre1,torre3,torre2);
       System.out.println("Mover Disco de Torre" + torre1 + " a Torre" + torre3);
       torresHanoi(disco-1,torre2,torre1,torre3);
      }
    }
}
