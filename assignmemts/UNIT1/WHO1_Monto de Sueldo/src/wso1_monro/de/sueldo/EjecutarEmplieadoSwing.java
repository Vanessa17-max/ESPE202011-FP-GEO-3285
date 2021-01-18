/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso1_monro.de.sueldo;

import javax.swing.JOptionPane;
public class EjecutarEmplieadoSwing {
    public static void main(String[]args){
        //declarar variables
        String nomEmp;
        int horasTra;
        float cuotaHr;
        
        //Crear el objeto
        Empleado objEmpleado=new Empleado();
        
        //Entrada de datos
        nomEmp=JOptionPane.showInputDialog("Tecle el nombre ");
        horasTra=Integer.parseInt(JOptionPane.showInputDialog("Tecle las horas trabajadas "));
        cuotaHr=Float.parseFloat(JOptionPane.showInputDialog("Tecle la cuota por hora "));
        
        //colocar los valores en los atributos
        objEmpleado.establecerNombreEmp(nomEmp);
        objEmpleado.establecerHorasTrab(horasTra);
        objEmpleado.establecerCuotaHora(cuotaHr);
        
        //Invocar al metodo calcular sueldo
        objEmpleado.calcularSueldo();
        
        //Impresion de los datos
        JOptionPane.showMessageDialog(null, "\n--------Resultdos--------"+
                "\nNombre :"+objEmpleado.obtenerNombre()+
                "\n Sueldo : "+objEmpleado.obtenerSueldo());
        
    }
}
