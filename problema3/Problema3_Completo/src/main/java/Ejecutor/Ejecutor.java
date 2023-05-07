/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;
import paquete1.Automotor;
import paquete1.fabricante;
/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        System.out.println("-------AUTOMOTOR-------");
        
        fabricante fabr = new fabricante("FERRARI", "Loja");
        
        // asigno valores
        String ceduD = "1150287322";
        int anioFabi = 2005;
        double vH1 = 35000.0;
        double vM1 = (((vH1*0.002)/100)*8.0);
        
        Automotor a1 = new Automotor(ceduD,anioFabi,vH1,vM1,fabr );
        
        // imprimo resultados
        System.out.println("La cedula del duenio es: "+a1.getCedulaD());
        System.out.println("El fabricante del vehiculo es: "+a1.getFabri().getNomFabri());
        System.out.println("La ciudad de origen del fabricante es: "+a1.getFabri().getCiuOrigen());
        System.out.println("El anio de fabricacion es: "+a1.getAnioF());
        System.out.println("El valor del vehiculo es: "+a1.getValorH());
        System.out.println("El valor de la matricula es: "+a1.getValorM());
    }
}
