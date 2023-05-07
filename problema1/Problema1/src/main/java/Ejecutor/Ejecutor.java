/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

import paquete1.Estudiante;
import paquete1.Universidad;
/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    public static void main(String[] args) {
        System.out.println("PROBLEMA NOTAS ESTUDIANTES");
        //String calle = "Los pollitos";
        Universidad univer1 = new Universidad ("UTPL", "Las abuelas del montaño");
        
        // dar valores
        String nombre = "Rodolfo Hitler";
        double ca1 = 9.4;
        double ca2 = 7.2;
        double ca3 = 6;
        double promi =((ca1+ca2+ca3)/3);
        
        Estudiante e1 = new Estudiante(nombre, ca1, ca2, ca3, promi, univer1);
        
        System.out.println("Universidad: "+e1.getUni().getNombreU());
        System.out.println("La direccion de la universidad es: "+e1.getUni().getDireccion());
        System.out.println("El nombre de la persona es: " + e1.getNombreE());
        System.out.println("La calificacion 1 es: "+e1.getCali1());
        System.out.println("La calificacion 2 es: "+e1.getCali2());
        System.out.println("La calificacion 3 es: "+e1.getCali3());
        System.out.println("El promedio de las calificaciones es: "+e1.getPromedio());
        
        
        
    }
}
