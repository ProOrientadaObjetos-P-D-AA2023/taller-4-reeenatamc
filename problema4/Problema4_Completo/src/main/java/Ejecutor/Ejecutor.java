/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;
import paquete1.Cheque;
import paquete1.Banco;
import paquete1.Cliente;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {
    public static void main(String[] args) {
        System.out.println("CHEQUES");
        
        Banco b11 = new Banco ("Banco de Loja", 5);
        Cliente c11 = new Cliente ("JH"," de la Cruz","1150287322");
        
        //asignar valores
        double valorCheque1 = 12000.5;
        double bComision = (((valorCheque1*0.003)/100)*valorCheque1);
        
        Cheque ch11 = new Cheque (c11, b11,valorCheque1,bComision);
        
        // imprimir resultados 
        
        System.out.println("Propietario del cheque: "+ch11.getClient().getnCliente()+" "+ch11.getClient().getApeCliente());
        System.out.println("Con numero de cedula: "+ch11.getClient().getCeduCliente());
        System.out.println("Nombre del Banco: "+ch11.getBaanco().getnBanco()+" el mismo que cuenta con "+ch11.getBaanco().getsBancos()+" sucursales.");
        System.out.println("El valor del cheque es: "+ch11.getvCheque());
        System.out.println("La comision por el cheque es: "+ ch11.getbComision());
        
    }
}
