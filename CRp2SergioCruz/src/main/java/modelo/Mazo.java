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
public class Mazo {
    private ArrayList<Carta> listaM;
    //va a agregar carta buscando en cartas, pero es una array de carta, no cartas (nombre de clases)

    public Mazo(ArrayList<Carta> listaM) {
        this.listaM = listaM;
    }
    
    public Mazo() {
        this.listaM = new ArrayList<>();
    }

    public ArrayList<Carta> getListaM() {
        return listaM;
    }

    public void setListaM(ArrayList<Carta> listaM) {
        this.listaM = listaM;
    }

    @Override
    public String toString() {
        return "Mazo{" + "listaM=" + listaM + '}';
    }
    
    public double costeMedio()
    {
        //se obtiene de recorrer listaM y operar sobre el
        return 0;
    }
    
    public double utilidadMedia()
    {
        return 0;
    }
    
    public int vidaTotal()
    {
        return 0;
    }
    
    public void crearMazo(ArrayList<Carta> cartas, String aAgregar)
    {
        //cartas obtiene la lista y añade la carta creada
        //desde cada comboBox recibe las cartas, todas, y nombre de la carta a agregar, busca y agrega, verificar que sean 8
        for(int i=0; i<cartas.size(); i++)
        {
            if(cartas.get(i).nombre.equals(aAgregar))
            {
                listaM.add(cartas.get(i));
            }
            else
            {
                //oops
            }
        }
    }
}
