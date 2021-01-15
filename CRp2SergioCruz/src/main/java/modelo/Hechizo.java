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
    private int duracion;
    
    @Override
    public String Utilidad() {
        return String.valueOf((this.costo)/(this.dano + this.vida));
    }

    public Hechizo(int duracion, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.duracion = duracion;
    }

    public Hechizo() {
        super();
        this.duracion = 0;
    }

    public int getVelocidadMovimineto() {
        return duracion;
    }

    public void setVelocidadMovimineto(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Hechizo{" + "duracion=" + duracion + '}';
    }

    
}
