/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Cheque {
    private Cliente client;
    private Banco baanco;
    private double vCheque;
    private double bComision;
    
    public Cheque (Cliente cliente1, Banco banco1, double vC, double bC){
        client = cliente1;
        baanco = banco1;
        vCheque = vC;
        bComision = bC;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente clientt) {
        client = clientt;
    }

    public Banco getBaanco() {
        return baanco;
    }

    public void setBaanco(Banco baancoo) {
        baanco = baancoo;
    }

    public double getvCheque() {
        return vCheque;
    }

    public void setvCheque(double vChequee) {
        vCheque = vChequee;
    }

    public double getbComision() {
        return bComision;
    }

    public void setbComision(double bComisionn) {
        bComision = bComisionn;
    }
}
