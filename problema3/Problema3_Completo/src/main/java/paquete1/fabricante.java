/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class fabricante {
    private String nomFabri;
    private String ciuOrigen;
    
    public fabricante(String nF, String cO){
        nomFabri = nF;
        ciuOrigen = cO;
    }

    public String getNomFabri() {
        return nomFabri;
    }

    public void setNomFabri(String nomFabrii) {
        nomFabri = nomFabrii;
    }

    public String getCiuOrigen() {
        return ciuOrigen;
    }

    public void setCiuOrigen(String ciuOrigenn) {
        ciuOrigen = ciuOrigenn;
    }
}
