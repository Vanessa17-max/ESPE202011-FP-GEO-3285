/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_areageometricfigures;

import java.util.*;//Importamos las librerias.

/**
 *
 * @author FAMILIA TONATO
 */
public class WS13_areageometricfigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner neme = new Scanner(System.in);
     int opcion;

        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");
        System.out.println("~~~~VANESSA TONATO~~~~");
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");

//Mediante una estructura do while crearemos el menu de opciones.
     do{//Primero crearemos un menu con las diferentes opciones.  
        System.out.println("1.-Rectangular tetrahedron");
        System.out.println("2.-Truncated cone");
        System.out.println("3.-Circle");
        System.out.println("4.-Square");
        System.out.println("5.-Ellipse");
        System.out.println("8.-Exit");
        opcion = neme.nextInt();
        System.out.println("֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍֍");

            double base=0.0;
            double altura=0.0;
            double area=0.0;
            double generatrizcot=0.0;
            double radiocotmr=0.0;
            double radiocotmy=0.0;
            double arearec=0.0;
            double radio=0.0;
            double pi=3.1416;
            double areacir=0.0;
            double basecua=0.0;
            double alturacua=0.0;
            double areacua=0.0;
            double semiejemayor=0.0;
            double semiejemenor=0.0;
            double areaelip=0.0;

        if(opcion==1){
        System.out.println("Enter the base of the rectangular tetrahedron --> ");
        base = neme.nextDouble();
        area=((base*base)*Math.sqrt(3));
        System.out.println("The area of ​​the rectangular tetraede is --> "+area);

        }

        else{

        if(opcion==2){//Si elegimos la opcion 2.. se realizaran los procesos para la opcion 2(rectangulo).
        System.out.println("Enter the radius of the truncated cone --> ");
        radiocotmr=neme.nextDouble();
        System.out.println("Enter the radius(2) of the truncated cone --> ");
        radiocotmy=neme.nextDouble();
        System.out.println("Introduces the generatrix of the truncated cone --> ");
        generatrizcot=neme.nextDouble();
        arearec=(pi*(radiocotmr*radiocotmy)*generatrizcot);
        System.out.println("the area of ​​the truncated cone is --> "+arearec);

        }

        else{

        if(opcion==3){//Si se seleciona la opcion 3 .. se realizaran los procesos para la opcion 3(circulo).
        System.out.println("Enter the radius of the circle --> ");
        radio=neme.nextDouble();
        areacir=pi*radio*radio;
        System.out.println("The area of ​​the circle is --> "+areacir);

        }

        else{

        if(opcion==4){//Si se selecciona la opcion 4, se realizaran los procesos para la opcion4(cuadrado).
        System.out.println("Enter the base of the square --> ");
        basecua=neme.nextDouble();
        System.out.println("Enter the height of the square --> ");
        alturacua=neme.nextDouble();
        areacua=basecua*alturacua;
        System.out.println("The area of ​​the square is -->  "+areacua);
        }
        else{

        if(opcion==5){
        System.out.println("Introduces the semi-major axis of the ellipsoid --> ");
        semiejemayor=neme.nextDouble();
        System.out.println("Introduces the semi-minor axis of the ellipsoid -->");
        semiejemenor=neme.nextDouble();
        areaelip=semiejemayor*semiejemenor*pi;
        System.out.println("the area of ​​the ellipse is --> "+areaelip);
        }
        }
        }
        }
        }
        System.out.println("Thnks for using my software");
        System.out.println("[֍֍֍֍ GOOD BYE MY FRIEND IS VANESSA.T ֍֍֍֍]");
        }while(opcion<8);
        }
     }

     