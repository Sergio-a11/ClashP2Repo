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
public class Mazos {
    private ArrayList<Mazo> listaMazos;

    public Mazos(ArrayList<Mazo> listaMazos) {
        this.listaMazos = listaMazos;
    }
    
    public Mazos() {
        this.listaMazos = new ArrayList<>();
    }

    public ArrayList<Mazo> getListaMazos() {
        return listaMazos;
    }

    public void setListaMazos(ArrayList<Mazo> listaMazos) {
        this.listaMazos = listaMazos;
    }

    @Override
    public String toString() {
        return "Mazos{" + "listaMazos=" + listaMazos + '}';
    }
    
    public int totalMazos()
    {
        return listaMazos.size();
    }
}
