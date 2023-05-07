/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Automotor {
    private String cedulaD;
    private int AnioF;
    private double ValorH;
    private double ValorM;
    private fabricante fabri;
    
    public Automotor (String cD, int aF, double vH, double vM, fabricante fab){
        cedulaD = cD;
        AnioF = aF;
        ValorH = vH;
        ValorM = vM;
        fabri = fab;
    }

    public String getCedulaD() {
        return cedulaD;
    }

    public void setCedulaD(String cedulaDD) {
        cedulaD = cedulaDD;
    }

    public int getAnioF() {
        return AnioF;
    }

    public void setAnioF(int AnioFF) {
        AnioF = AnioFF;
    }

    public double getValorH() {
        return ValorH;
    }

    public void setValorH(double ValorHH) {
        ValorH = ValorHH;
    }

    public double getValorM() {
        return ValorM;
    }

    public void setValorM(double ValorMM) {
        ValorM = ValorMM;
    }

    public fabricante getFabri() {
        return fabri;
    }

    public void setFabri(fabricante fabrii) {
        fabri = fabrii;
    }
}
