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
public class Estructura extends Carta{
    private int TiempoEnBatalla;
    
    @Override
    public String Utilidad() {
        return String.valueOf(Integer.parseInt(this.costo)/(this.dano + this.vida));
    }

    public Estructura(int TiempoEnBatalla, String objetivos, String nombre, String alcance, String calidad, String costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    public Estructura() {
        super();
        this.TiempoEnBatalla = 0;
    }

    public int getVelocidadMovimineto() {
        return TiempoEnBatalla;
    }

    public void setVelocidadMovimineto(int TiempoEnBatalla) {
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    @Override
    public String toString() {
        return "Estructura{" + "TiempoEnBatalla=" + TiempoEnBatalla + '}';
    }
}
