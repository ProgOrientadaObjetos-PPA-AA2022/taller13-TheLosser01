/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class Correo {
    private DominioCorreo dominioMail;
    private String correo;
    private String username;
    
    public void establecerDominio(DominioGmail g){
        dominioMail = g;
    }
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public DominioCorreo obtenerDominio(){
        return dominioMail;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("uername: %s\n"
                + "correo: %s\n"
                + "Dominio: %s\n",username,
                correo,
                dominioMail.toString());
        return cadena;
    }

    
    
}
