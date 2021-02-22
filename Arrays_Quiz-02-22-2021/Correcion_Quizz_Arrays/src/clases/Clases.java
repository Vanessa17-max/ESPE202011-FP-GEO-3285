/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Scanner; 

/**
 *
 * @author FAMILIA TONATO
 */
public class Clases{
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO, add your application code 
 
        int Opc=1;
        float Suma=0,Cont1=0, Cont2=0, Cont3=0,Cont4=0,Cont5=0, Cont6=0, Cont7=0,Cont8=0,Cont9=0, Cont10=0, Cont11=0,Cont12=0,Cont13=0, Cont14=0, Cont15=0,Cont16=0;
 
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        //No=sc.nextInt();
 
        System.out.println("CANDIDATOS");
        System.out.println("1.- Candidato Andrés Arauz Galarza");
        System.out.println("2.- Candidato Lucio Gutierrez");
        System.out.println("3.- Candidato Gerson Almeida ");
        System.out.println("4.- Candidato Isidrio Romero");
        System.out.println("5.- Candidato Xavier Hervas");
        System.out.println("6.- Candidato Pedro Jóse Freile");
        System.out.println("7.- Candidato Yaku Pérez");
        System.out.println("8.- Candidato Gustavo Larrea");
        System.out.println("9.- Candidato Guillermo Lasso");
        System.out.println("10.- Candidato Guillermo Celi");
        System.out.println("11.- Candidato Juan Fernando Velasco");
        System.out.println("12.- Candidato Paúl Carrasco");
        System.out.println("13.- Candidato Ximena Peña");
        System.out.println("14.- Candidato César Montufar");
        System.out.println("15.- Candidato Giovanny Andrade");
        System.out.println("16.- Candidato Carlos Sagñay");        
        System.out.println("Seleccione candidato...!");
        while(Opc!=0){
 
        Opc=sc.nextInt();
 
        switch(Opc){
            case 1:
                Cont1++;
                break;
 
            case 2:
                Cont2++;
                break;
 
            case 3:
                Cont3++;
                break;
 
            case 4:
                Cont4++;
                break;
            case 5:
                Cont5++;
                break;
 
            case 6:
                Cont6++;
                break;
 
            case 7:
                Cont7++;
                break;
 
            case 8:
                Cont8++;
                break;
             case 9:
                Cont9++;
                break;
 
            case 10:
                Cont10++;
                break;
 
            case 11:
                Cont11++;
                break;
 
            case 12:
                Cont12++;
                break;
            case 13:
                Cont13++;
                break;
 
            case 14:
                Cont14++;
                break;
 
            case 15:
                Cont15++;
                break;
 
            case 16:
                Cont16++;
                break;
        }
        }
        int[] Candidatos;
        String[] Candidatoss;
        float[] Reproduction;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of cages -> ");
        n = input.nextInt();
        Candidatos = new int[n];
        Suma = Cont1 + Cont2 + Cont3 + Cont4+Cont5 + Cont6 + Cont7 + Cont8+Cont9 + Cont10 + Cont11 + Cont12+Cont13 + Cont14 + Cont15 + Cont16;
 //        Candidatos[1] = 32.12%;
//        Candidatos[2] = 1.78%;
//        Candidatos[3] = 1.73%;
//        Candidatos[4] = 1.86%;
//        Candidatos[5] = 15.68%;
//        Candidatos[6] = 2.08%;
//        Candidatos[7] = 19.38%;
//        Candidatos[8] = 0.4%;
//        Candidatos[9] = 19.74%;
//        Candidatos[10] = 0.91%;
//        Candidatos[11] = 0.82%;
//        Candidatos[12] = 0.21%;
//        Candidatos[13] = 1.54%;
//        Candidatos[14] = 0.62%;
//        Candidatos[15] = 0.22%;
//        Candidatos[16] = 0.29%;

    for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of guinea pigs born " + (i + 1) + " -> ");
            Candidatos[i] = input.nextInt();
 }
            for (int i = 0; i < n; i++) {
            System.out.println("guinea pigs are there now" + (i + 1) + " -> " + Candidatos[i]);
  }
        System.out.println("Total de votos contabilizados: "+Suma);
        System.out.println("El Candidato Andrés Arauz Galarza obtuvo el : "+Cont1/Suma*100+"% con "+Cont1+" votos.");
        System.out.println("El Candidato Lucio Gutierrez obtuvo el : "+Cont2/Suma*100+"% con "+Cont2+" votos.");
        System.out.println("El Candidato Gerson Almeida obtuvo el : "+Cont3/Suma*100+"% con "+Cont3+" votos.");
        System.out.println("El Candidato Isidrio Romero obtuvo el : "+Cont4/Suma*100+"% con "+Cont4+" votos.");
        System.out.println("El Candidato Xavier Hervas obtuvo el : "+Cont1/Suma*100+"% con "+Cont5+" votos.");
        System.out.println("El Candidato Pedro Jóse Freile obtuvo el : "+Cont2/Suma*100+"% con "+Cont6+" votos.");
        System.out.println("El Candidato Yaku Pérez obtuvo el : "+Cont3/Suma*100+"% con "+Cont7+" votos.");
        System.out.println("El Candidato Gustavo Larrea obtuvo el : "+Cont4/Suma*100+"% con "+Cont8+" votos.");
        System.out.println("El Candidato Guillermo Lasso obtuvo el : "+Cont1/Suma*100+"% con "+Cont9+" votos.");
        System.out.println("El Candidato Guillermo Celi obtuvo el : "+Cont2/Suma*100+"% con "+Cont10+" votos.");
        System.out.println("El Candidato Juan Fernando Velasco obtuvo el : "+Cont3/Suma*100+"% con "+Cont11+" votos.");
        System.out.println("El Candidato Paúl Carrasco obtuvo el : "+Cont4/Suma*100+"% con "+Cont12+" votos.");
        System.out.println("El Candidato Ximena Peña obtuvo el : "+Cont1/Suma*100+"% con "+Cont13+" votos.");
        System.out.println("El Candidato César Montufar obtuvo el : "+Cont2/Suma*100+"% con "+Cont14+" votos.");
        System.out.println("El Candidato Giovanny Andrade obtuvo el : "+Cont3/Suma*100+"% con "+Cont15+" votos.");
        System.out.println("El Candidato Carlos Sagñay obtuvo el : "+Cont4/Suma*100+"% con "+Cont16+" votos.");        

}
public static void main() throws java.io.IOException {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entra número de candidatos: ");
    int num_candidatos = teclado.nextInt(); //Aquí especifico el espacio de la array candidatos

    System.out.println("Entra número de votantes:");
    int total_votantes = teclado.nextInt(); //Aquí especifico el espacio de la array votos

    int voto_user; //Voto de cada user

    int[] candidatos = new int[num_candidatos]; // Num de Candidatos

    int[] votos = new int[total_votantes]; // Num de personas que votan


    for (int i = 0; i < votos.length; i++) { //tienes que compararlo con el numero de votantes, para que repita la accion esa cantidad de veces

        do {
            int indice = i + 1;
            System.out.println("Votante " + indice + ", entra tu voto (1-" + num_candidatos + "):");

            // Aquí tenemos el voto del votante
            voto_user = teclado.nextInt();

            if (voto_user > num_candidatos) {
                System.out.println("Voto inválido.");
            }
            else {
                candidatos[voto_user-1]++;
            }
        } while (voto_user > num_candidatos);
    }
    System.out.println("Resultados:");
    System.out.println("-----------------------");
    for (int i = 0; i < candidatos.length; i++) {

        System.out.println("Candidato " + (i + 1) + " " + candidatos[i] + " votos.");
    }
}
}