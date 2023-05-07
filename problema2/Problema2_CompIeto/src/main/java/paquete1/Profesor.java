/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Profesor {
    private String nombreP;
    private String apellidoP;
    private double sueldoB;
    private double sueldoT;
    private String cedula;
    private provincia prov;
    
    public Profesor(String nP, String ap, String ced, double sB, double sT, provincia pro){
        nombreP = nP;
        apellidoP = ap;
        sueldoB = sB;
        sueldoT = sT;
        prov = pro;
        cedula = ced;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedulaa) {
        cedula = cedulaa;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombrePP) {
        nombreP = nombrePP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoPP) {
        apellidoP = apellidoPP;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoBB) {
        sueldoB = sueldoBB;
    }

    public double getSueldoT() {
        return sueldoT;
    }

    public void setSueldoT(double sueldoTT) {
        sueldoT = sueldoTT;
    }

    public provincia getProv() {
        return prov;
    }

    public void setProv(provincia provv) {
        prov = provv;
    }
}
