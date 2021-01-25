/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase para crear cartas con cualidades de hechizo
 * @author Sergio Cruz
 */
public class Hechizo extends Carta{
    private int duracion, radio;
    
    @Override
    public String Utilidad() {
        return String.valueOf((this.dano + this.duracion)/(this.costo));
    }

    /**
     * Constructor paramétrico, se llama al constructor padre paramétrico
     * @param duracion duración del efecto del hechizo 
     * @param radio radio de efecto del hechizo
     * @param objetivos a quien ataca
     * @param nombre nombre de la carta
     * @param alcance alcance de su proyectil
     * @param calidad rarezza de la carta
     * @param costo costo en partida, de elixir
     * @param ruta ubicacion de la imagen que representa a la carta
     * @param dano daño de la carta
     * @param vida salud de la carta
     */
    public Hechizo(int duracion, int radio, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.duracion = duracion;
        this.radio = radio;
    }

    /**
     * Constructor básico, se llama al constructor padre
     */
    public Hechizo() {
        super();
        this.duracion = 0;
        this.radio = 0;
    }

    /**
     * retorna el tiempo de accion del hechizo en la arena
     * @return int
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * establece el tiempo de accion del hechizo en la arena
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * retorna el radio de accion del hechizo en la arena
     * @return
     */
    public int getRadio() {
        return radio;
    }

    /**
     * establece el radio de accion del hechizo en la arena
     * @param radio radio de accion
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Hechizo{" + "duracion=" + duracion + '}';
    }

    
}
