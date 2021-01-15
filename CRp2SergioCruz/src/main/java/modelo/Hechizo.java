/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sergio Cruz
 */
public class Hechizo extends Carta{
    private int duracion, radio;
    
    @Override
    public String Utilidad() {
        return String.valueOf((this.costo)/(this.dano + this.vida));
    }

    public Hechizo(int duracion, int radio, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.duracion = duracion;
        this.radio = radio;
    }

    public Hechizo() {
        super();
        this.duracion = 0;
        this.radio = 0;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Hechizo{" + "duracion=" + duracion + '}';
    }

    
}
