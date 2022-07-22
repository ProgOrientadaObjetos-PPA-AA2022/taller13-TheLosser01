/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionesTelevisor {

    ArrayList<Televisor> lista;
    double totalPrecios;
    double televisorMasCaro;
    String listaMarcastv;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        lista = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return lista;
    }

    public void establecerTotalPrecios() {
        double s = 0;
        for (Televisor t : obtenerTelevisores()) {
            s = s + t.obtenerPrecio();
            System.out.println(s);
        }
        totalPrecios = s;
    }

    public double obtenerTotalPrecios() {
        return totalPrecios;
    }

    public void establecerTelevisorMasCaro(ArrayList<Televisor> t) {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > s) {
                s = t.get(i).obtenerPrecio();
            }
        }
        televisorMasCaro = s;
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public void establecerListaMarcasTV() {
        String s = "";
        for (Televisor t : obtenerTelevisores()) {
            s = String.format("%s%s\n", s, t.obtenerMarca());
        }
        listaMarcastv = s;
    }

    public String obtenerListaMarcasTV() {
        return listaMarcastv;
    }

    @Override
    public String toString() {
        return String.format("Precio Total: %.2f\n"
                + "Marca mas cara:%s\n",
                totalPrecios,
                televisorMasCaro);
    }

}
