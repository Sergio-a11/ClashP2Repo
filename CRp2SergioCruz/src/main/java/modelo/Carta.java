/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase Carta, base del programa, establece los atributos principales de las cartas, se entiende por cartas, tropas, hechizos o estructuras.
 * @author Sergio Cruz
 */
public abstract class Carta {

    /**
     *  objetivos que atacan las cartas, tierra, aire, estructuras, etc...
     */
    protected String objetivos,

    /**
     * nombre de la carta
     */
    nombre,

    /**
     * alcance de la carta al momento de disparar a su objetivo
     */
    alcance,

    /**
     * calidad de la carta en el juego, define la rareza en el juego
     */
    calidad,

    /**
     * ruta de la imagen que representa la carta
     */
    ruta;

    /**
     * daño de la carta a su objetivos
     */
    protected int dano,

    /**
     * vida de la carta en la arena
     */
    vida,

    /**
     * costo de la carta en partida, se basa en gotas de elixir, maximo 10 de elixir
     */
    costo;

    /**
     * Constructor paramétrico. es usado por las clases derivadas
     * @param objetivos a quien ataca
     * @param nombre nombre de la carta
     * @param alcance alcance de su proyectil
     * @param calidad rarezza de la carta
     * @param costo costo en partida, de elixir
     * @param ruta ubicacion de la imagen que representa a la carta
     * @param dano daño de la carta
     * @param vida salud de la carta
     */
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
    
    /**
     *  Constructor básico usado por las clases derivadas
     */
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

    /**
     * retorna el item selecciona en el combo box, objetivos
     * @return String
     */
    public String getObjetivos() {
        return objetivos;
    }

    /**
     * establece el valor que se selecciona en el combo box, objetivos
     * @param objetivos a quien ataca
     */
    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    /**
     * retorna el nombre ingresado de la carta
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * establece el nombre de la carta
     * @param nombre nombre de la carta
     * @throws FormatoEntradaExcepcion excepcion campo, nulo o numeros
     */
    public void setNombre(String nombre) throws FormatoEntradaExcepcion {
        Pattern pat =Pattern.compile("[1-9]");
        Matcher mat = pat.matcher(nombre);
        if(nombre.equals(""))
        {
            throw new FormatoEntradaExcepcion(101);
        }
        else if(mat.find())
        {
            throw new FormatoEntradaExcepcion(102);
        }
        else
        {
            this.nombre = nombre;
        }
    }

    /**
     * retorna el item selecciona en el combo box, alcance
     * @return String
     */
    public String getAlcance() {
        return alcance;
    }

    /**
     * establece el valor que se selecciona en el combo box, alcance
     * @param alcance tipo de alcance de la carta
     */
    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    /**
     * retorna el item selecciona en el combo box, calidad
     * @return String
     */
    public String getCalidad() {
        return calidad;
    }

    /**
     * establece el valor que se selecciona en el combo box, calidad
     * @param calidad rareza de la carta
     */
    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    /**
     * retorna el costo ingresado de la carta
     * @return int
     */
    public int getCosto() {
        return costo;
    }

    /**
     * establece el costo de la carta
     * @param costo valor en elixir de la carta
     * @throws modelo.FormatoEntradaExcepcion excepcion, valor limite 10
     */
    public void setCosto(int costo) throws FormatoEntradaExcepcion {
        if(costo > 10)
        {
            throw new FormatoEntradaExcepcion(104);
        }
        else
        {
            this.costo = costo;
        } 
    }

    /**
     * retorna la ruta de la imagen de la carta
     * @return String
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * establece la ruta literal para la imagen de la carta
     * @param ruta ubicacion fisica de la carta
     * @throws FormatoEntradaExcepcion excepción, campo nulo
     */
    public void setRuta(String ruta) throws FormatoEntradaExcepcion {
        if(ruta.equals(""))
        {
            throw new FormatoEntradaExcepcion(101);
        }
        else
        {
            this.ruta = ruta;
        }
    }

    /**
     * retorna el daño ingresado de la carta
     * @return int
     */
    public int getDano() {
        return dano;
    }

    /**
     * establece el daño ingresado de la carta
     * @param dano daño de la carta en partida
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * retorna el valor de la vida ingresado de la carta
     * @return int
     */
    public int getVida() {
        return vida;
    }

    /**
     * establece el valor de vida de la carta
     * @param vida puntos de vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * String con la informacion basica de la carta
     * @return String
     */
    @Override
    public String toString() {
        return "Carta{" + "objetivos=" + objetivos + ", nombre=" + nombre + ", alcance=" + alcance + ", calidad=" + calidad + ", costo=" + costo + ", ruta=" + ruta + ", dano=" + dano + ", vida=" + vida + '}';
    }

    /**
     * Método abstracto para conocer la utilidad de una carta en partida
     * @return String
     */

    
    public abstract String Utilidad();
}
