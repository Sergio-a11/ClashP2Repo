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
        return String.valueOf((this.dano + this.vida + this.TiempoEnBatalla)/(this.costo));
    }

    public Estructura(int TiempoEnBatalla, String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        super(objetivos, nombre, alcance, calidad, costo, ruta, dano, vida);
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    public Estructura() {
        super();
        this.TiempoEnBatalla = 0;
    }

    public int getTiempoEnBatalla() {
        return TiempoEnBatalla;
    }

    public void setTiempoEnBatalla(int TiempoEnBatalla) {
        this.TiempoEnBatalla = TiempoEnBatalla;
    }

    @Override
    public String toString() {
        return "Estructura{" + "TiempoEnBatalla=" + TiempoEnBatalla + '}';
    }
}
