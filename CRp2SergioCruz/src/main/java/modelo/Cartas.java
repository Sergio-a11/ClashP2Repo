/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Sergio Cruz
 */
public class Cartas {
    private ArrayList<Carta> listaC;

    public Cartas() {
        this.listaC = new ArrayList<>();
    }

    public Cartas(ArrayList<Carta> listaC) {
        this.listaC = listaC;
    }

    public ArrayList<Carta> getListaC() {
        return listaC;
    }

    public void setListaC(ArrayList<Carta> listaC) {
        this.listaC = listaC;
    }

    @Override
    public String toString() {
        return "Cartas{" + "listaC=" + listaC + '}';
    }
    
    
}
