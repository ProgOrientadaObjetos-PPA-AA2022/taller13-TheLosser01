/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private ArrayList<Matricula> lista;
    private double promedioMatriculas;
    //private MatriculaCampamento campamento;
    //private MatriculaColegio colegio;
    //private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;

    public ArrayList<Matricula> obtenerLista() {
        return lista;
    }

    public void establecerListaMatriculas(ArrayList<Matricula> l) {
        lista = l;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).obtenerTarifa();
        }

        promedioMatriculas = suma;

    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {

        String cadena = String.format("Lista Matriculas\n");

        for (int i = 0; i < lista.size(); i++) {

            cadena = String.format("%s"
                    + "%.2f\n", cadena,
                    lista.get(i).obtenerTarifa());

        }

        cadena = String.format("%s"
                + "Promedio matriculas: %.2f",
                cadena,
                obtenerPromedioTarifas());

        return cadena;

    }

}
