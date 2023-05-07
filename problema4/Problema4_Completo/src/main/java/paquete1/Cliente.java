/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private String nCliente;
    private String apeCliente;
    private String ceduCliente;
    
    public Cliente (String nC, String apeC, String ceduC){
        nCliente = nC;
        apeCliente = apeC;
        ceduCliente = ceduC;
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nClientee) {
        nCliente = nClientee;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeClientee) {
        apeCliente = apeClientee;
    }

    public String getCeduCliente() {
        return ceduCliente;
    }

    public void setCeduCliente(String ceduClientee) {
        ceduCliente = ceduClientee;
    }
}
