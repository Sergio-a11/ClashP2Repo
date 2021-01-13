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
public class Tropa extends Carta {
    
    private String velocidadMovimineto;
    
    @Override
    public String Utilidad() {
        return String.valueOf(Integer.parseInt(this.costo)/(this.dano + this.vida));
    }

    public Tropa(String velocidadMovimineto, String objetivos, String nombre, String alcance, String calidad, String costo, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, dano, vida);
        this.velocidadMovimineto = velocidadMovimineto;
    }

    public Tropa() {
        super();
        this.velocidadMovimineto = "";
    }

    public String getVelocidadMovimineto() {
        return velocidadMovimineto;
    }

    public void setVelocidadMovimineto(String velocidadMovimineto) {
        this.velocidadMovimineto = velocidadMovimineto;
    }

    @Override
    public String toString() {
        return "Tropa{" + "velocidadMovimineto=" + velocidadMovimineto + '}';
    }
}
