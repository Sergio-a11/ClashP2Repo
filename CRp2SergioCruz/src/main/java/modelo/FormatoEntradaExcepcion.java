/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase para controlar las excepcion perzonalidas dentro del programa
 * @author Sergio Cruz
 */
public class FormatoEntradaExcepcion extends Exception {
    private int nroError;
    private String msg;

    /**
     * Constructor paramétrico
     * @param nroError número del error a controlar
     * @param msg mensaje de error para el usuario
     */
    public FormatoEntradaExcepcion(int nroError, String msg) {
        this.nroError = nroError;
        this.msg = msg;
    }
    
    /**
     * Constructor sobrecargado para controlar el número de error y generar sus mensaje de error
     * @param nroError número de error
     */
    public FormatoEntradaExcepcion(int nroError) {
        this.nroError = nroError;
        switch(nroError)
        {
            case 101://nulo
            {
                this.msg = "Hay campos con valor nulo";
                break;
            }
            case 102://letras
            {
                this.msg = "Campo dedicado unicamente a letras";
                break;
            }
            case 103:
            {
                this.msg = "Campo dedicado unicamente a números";
                break;
            }
            case 104:
            {
                this.msg = "Se ha superado el valor maximo [10]";
                break;
            }
        }
    }
    
    /**
     * Constructor básico
     */
    public FormatoEntradaExcepcion() {
        this.nroError = 0;
        this.msg = "";
    }

    /**
     * retorna el número de error
     * @return int
     */
    public int getNroError() {
        return nroError;
    }

    /**
     * establece un número de error para controlar una excepcion
     * @param nroRegitro número de registro de error
     */
    public void setNroError(int nroRegitro) {
        this.nroError = nroRegitro;
    }

    /**
     * retorna el mensaje de error
     * @return String
     */
    public String getMsg() {
        return msg;
    }

    /**
     * establece un mensaje de error
     * @param msg mensaje de error
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    /**
     * Retorna la información básica del error
     * @return String
     */
    @Override
    public String toString() {
        return "Error: " + nroError + ": "+ msg;
    }
    
}
