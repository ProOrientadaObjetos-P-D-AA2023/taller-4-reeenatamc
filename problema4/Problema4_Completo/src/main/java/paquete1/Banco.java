/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Banco {
    private String nBanco;
    private int sBancos;
    
    public Banco (String nB, int sB){
        nBanco = nB;
        sBancos = sB;
    }

    public String getnBanco() {
        return nBanco;
    }

    public void setnBanco(String nBancoo) {
        nBanco = nBancoo;
    }

    public int getsBancos() {
        return sBancos;
    }

    public void setsBancos(int sBancoss) {
        sBancos = sBancoss;
    }
}
