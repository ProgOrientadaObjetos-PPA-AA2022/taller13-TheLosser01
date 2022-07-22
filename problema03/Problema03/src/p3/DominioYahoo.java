/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author VIVOBOOK
 */
public class DominioYahoo implements DominioCorreo{

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = "Yahoo.com";
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }

    @Override
    public String toString() {
        String cadena = "DominioYahoo\n";

        return cadena;
    }
}
