/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquete1;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
    private String nombreE;
    private double cali1;
    private double cali2;
    private double cali3;
    private double promedio;
    private Universidad uni;
    
    public Estudiante(String n, double c1, double c2, double c3, double prom, Universidad univ){
        nombreE = n;
        cali1 = c1;
        cali2 = c2;
        cali3 = c3;
        promedio = prom;
        uni = univ;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombre) {
        nombreE = nombre;
    }

    public double getCali1() {
        return cali1;
    }

    public void setCali1(double cal1) {
        cali1 = cal1;
    }

    public double getCali2() {
        return cali2;
    }

    public void setCali2(double cal2) {
        cali2 = cal2;
    }

    public double getCali3() {
        return cali3;
    }

    public void setCali3(double cal3) {
        cali3 = cal3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedi) {
        promedio = promedi;
    }

    public Universidad getUni() {
        return uni;
    }

    public void setUni(Universidad ui) {
        uni = ui;
    }
}
