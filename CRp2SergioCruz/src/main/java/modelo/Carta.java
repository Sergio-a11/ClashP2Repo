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
public abstract class Carta {
    protected String objetivos, nombre, alcance, calidad, ruta;
    protected int dano, vida, costo;

    public Carta(String objetivos, String nombre, String alcance, String calidad, int costo, String ruta, int dano, int vida) {
        this.objetivos = objetivos;
        this.nombre = nombre;
        this.alcance = alcance;
        this.calidad = calidad;
        this.costo = costo;
        this.dano = dano;
        this.vida = vida;
        this.ruta = ruta;
    }
    
    public Carta() {
        this.objetivos = "";
        this.nombre = "";
        this.alcance = "";
        this.calidad = "";
        this.costo = 0;
        this.ruta = "";
        this.dano = 0;
        this.vida = 0;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Carta{" + "objetivos=" + objetivos + ", nombre=" + nombre + ", alcance=" + alcance + ", calidad=" + calidad + ", costo=" + costo + ", ruta=" + ruta + ", dano=" + dano + ", vida=" + vida + '}';
    }
    
    public abstract String Utilidad();
}
