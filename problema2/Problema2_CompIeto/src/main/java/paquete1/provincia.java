/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class provincia {
    private String NombrePro;
    private int NumH;
    
    public provincia (String nomPro, int nH){
        NombrePro = nomPro;
        NumH = nH;
    }

    public String getNombrePro() {
        return NombrePro;
    }

    public void setNombrePro(String NombreProo) {
        NombrePro = NombreProo;
    }

    public int getNumH() {
        return NumH;
    }

    public void setNumH(int NumHH) {
        NumH = NumHH;
    }
}
