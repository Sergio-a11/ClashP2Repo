/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase para crear cartas con cualidades de tropa
 * @author Sergio Cruz
 */
public class Estructura extends Carta{
    private int TiempoEnBatalla;
    
    @Override
    public String Utilidad() {
        return String.valueOf((this.dano + this.vida + this.TiempoEnBatalla)/(this.costo));
    }

    /**
     * Constructor paramétrico, se llama al constructor padre paramétrico
     * @param TiempoEnBatalla tiempo de la estructura en la arena de batalla
     * @param objetivos a quien ataca
     * @param nombre nombre de la carta
     * @param alcance alcance de su proyectil
     * @param calidad rarezza de la carta
     * @param costo costo en partida, de elixir
     * @param ruta ubicacion de la imagen que representa a la carta
     * @param dano daño de la carta
     * @param vida salud de la carta
     */
    public Estructura(int TiempoEnBatalla, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    /**
     * Constructor básico, se llama al constructor padre
     */
    public Estructura() {
        super();
        this.TiempoEnBatalla = 0;
    }

    /**
     * retorna el tiempo de la estructura en la arena
     * @return int
     */
    public int getTiempoEnBatalla() {
        return TiempoEnBatalla;
    }

    /**
     * establece el tiempo de la estructura en la arena
     * @param TiempoEnBatalla tiempo de la estructura en la arena
     */
    public void setTiempoEnBatalla(int TiempoEnBatalla) {
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    @Override
    public String toString() {
        return "Estructura{" + "TiempoEnBatalla=" + TiempoEnBatalla + '}';
    }
}
