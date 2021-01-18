/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso1_monro.de.sueldo;

/**
 *
 * @author FAMILIA TONATO
 */
import java.util.Scanner;
public class EjecutaEmpleado {
public static void main(String[]args){
    //Declarar variables
        String nomEmp;
        int horasTra;
        float cuotaHr;
    //Crear objeto para entrada de datos por el teclado
        Scanner entrada=new Scanner(System.in);
    //Se declara y se crea e inicia el objeto objEmpleado de la clase
        Empleado objEmpleado=new Empleado();
        
        System.out.println("\n -----Lectura de datos------");
        System.out.println("Teclee el nombre");
        nomEmp=entrada.nextLine();
        System.out.println("Teclee horas Trabajadas");
        horasTra=entrada.nextInt();
        System.out.println("Teclee cuota por hora");
        cuotaHr=entrada.nextFloat();
    // invocaar los metodos para colocar los datos en los atributos del objeto
        objEmpleado.establecerNombreEmp(nomEmp);
        objEmpleado.establecerHorasTrab(horasTra);
        objEmpleado.establecerCuotaHora(cuotaHr);
        
    //Invocar el metodo calcular sueldo
        objEmpleado.calcularSueldo();
    //Imprimir
        System.out.println("Resultado");
        System.out.println("Nombre ="+objEmpleado.obtenerNombre());
        System.out.println("Sueldo ="+objEmpleado.obtenerSueldo());
   
    
}
}