/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Clase cartas, crea una lista de todas las cartas disponibles detro del programa
 * @author Sergio Cruz
 */
public class Cartas {
    private ArrayList<Carta> listaC;

    /**
     * Constructor básico, crea la lista de cartas
     */
    public Cartas() {
        this.listaC = new ArrayList<>();
    }

    /**
     * Constructor paramétrico, crea la lista de cartas a partir de una lista inicial
     * @param listaC lista inicial recibida
     */
    public Cartas(ArrayList<Carta> listaC) {
        this.listaC = listaC;
    }

    /**
     * retorna la lista de cartas
     * @return ArrayList
     */
    public ArrayList<Carta> getListaC() {
        return listaC;
    }

    /**
     * establece la lista de cartas
     * @param listaC lista de cartas
     */
    public void setListaC(ArrayList<Carta> listaC) {
        this.listaC = listaC;
    }

    /**
     * retorna la lista de cartas en forma de string, solo informacion básica.
     * @return String
     */
    @Override
    public String toString() {
        return "Cartas{" + "listaC=" + listaC + '}';
    }
    
    
}
