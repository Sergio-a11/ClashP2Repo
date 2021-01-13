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

    public Estructura(int TiempoEnBatalla, String string, String string1, String string2, String string3, String string4, int i, int i1) {
        super(string, string1, string2, string3, string4, i, i1);
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
