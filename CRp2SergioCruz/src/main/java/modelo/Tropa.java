/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase para crear cartas con cualidades de Tropa
 * @author Sergio Cruz
 */
public class Tropa extends Carta {
    
    private String velocidadMovimineto;
    
    @Override
    public String Utilidad() {
        return String.valueOf((this.dano + this.vida)/(this.costo));
    }

    /**
     * Constructor paramétrico, se llama al constructor padre paramétrico
     * @param velocidadMovimineto velocidad de movimiento de la tropa en la arena de batalla
     * @param objetivos a quien ataca
     * @param nombre nombre de la carta
     * @param alcance alcance de su proyectil
     * @param calidad rarezza de la carta
     * @param costo costo en partida, de elixir
     * @param ruta ubicacion de la imagen que representa a la carta
     * @param dano daño de la carta
     * @param vida salud de la carta
     */
    public Tropa(String velocidadMovimineto, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.velocidadMovimineto = velocidadMovimineto;
    }

    /**
     * Constructor básico, se llama al constructor padre
     */
    public Tropa() {
        super();
        this.velocidadMovimineto = "";
    }

    /**
     * retorna el valor de la velocidad de movimineto de la tropa en la arena
     * @return String
     */
    public String getVelocidadMovimineto() {
        return velocidadMovimineto;
    }

    /**
     * establece el valor de la velocidad de movimineto de la tropa en la arena
     * @param velocidadMovimineto valor de la velocidad de movimineto
     */
    public void setVelocidadMovimineto(String velocidadMovimineto) {
        
        this.velocidadMovimineto = velocidadMovimineto;
    }

    @Override
    public String toString() {
        return "Tropa{" + "velocidadMovimineto=" + velocidadMovimineto + '}';
    }
}
