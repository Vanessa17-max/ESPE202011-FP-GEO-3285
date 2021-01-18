package wso1_monro.de.sueldo;
public class Empleado {
 // Declaracion datos de la clase
    private String nombreEmp;
    private int horasTrab;
    private float cuotaHora;
    private float sueldo;
    
//Metodos de entrada de datos -setters-
    public void establecerNombreEmp(String nom){
        nombreEmp=nom;
    }    
    public void establecerHorasTrab(int horasTr){
        horasTrab=horasTr;
    }
    public void establecerCuotaHora(float cuotaHr){
        cuotaHora=cuotaHr;
    }
    
// Metodo de calculo
    public void calcularSueldo(){
        sueldo=horasTrab*cuotaHora;
    }
    
//Metodo de acceso a los datos -getters-
    
    public String obtenerNombre(){
        return nombreEmp;
    }
    public float obtenerSueldo(){
        return sueldo;   
}
}