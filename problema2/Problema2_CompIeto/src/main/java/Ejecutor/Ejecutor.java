/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;
import paquete1.Profesor;
import paquete1.provincia;
/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    public static void main(String[] args) {
        System.out.println("----------DATOS PROFESORES xdddd----------");
        provincia provi = new provincia("Loja",500000);
        
        //asignar datos
        String nombre = "Olivia";
        String ap1 = "Coronel";
        double sBasico = 1000;
        double sTotal = (sBasico+(sBasico*0.2));
        String ceduuu = "1150287322";
        
        Profesor p1 = new Profesor(nombre, ap1, ceduuu, sBasico, sTotal, provi);
        
        // Presentar datos 
        System.out.println("Nombre del profesor: "+p1.getNombreP());
        System.out.println("Apellido del profesor: "+p1.getApellidoP());
        System.out.println("La cedula del profesor es: "+p1.getCedula());
        System.out.println("La provincia de origen del profesor es: "+p1.getProv().getNombrePro());
        System.out.println("La provincia tiene "+p1.getProv().getNumH()+" habitantes.");
        System.out.println("Sueldo basico: "+p1.getSueldoB());
        System.out.println("Sueldo total: "+p1.getSueldoT());
        
    }
}
