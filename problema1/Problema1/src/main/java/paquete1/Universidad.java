/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Universidad {
    private String nombreU;
    private String direccion;
    private String calle;
    
    
    public Universidad (String nU, String dirr){
        nombreU = nU;
        direccion = dirr;
    }
    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nomU) {
        nombreU = nomU;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String diresic) {
        direccion = diresic;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String c) {
        calle = c;
    }
    
}
