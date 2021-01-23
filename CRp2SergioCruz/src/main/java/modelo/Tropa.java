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
        return String.valueOf((this.dano + this.vida)/(this.costo));
    }

    public Tropa(String velocidadMovimineto, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
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
