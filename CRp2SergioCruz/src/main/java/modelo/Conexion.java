/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Conexion {

    /**
     * Buffer de lectura
     */
    protected BufferedReader ent ;

    /**
     * lector de archivos
     */
    protected FileReader archLee;

    /**
     * escritor de archivos
     */
    protected FileWriter archEscr;
 
    /**
     * impresor de archivos
     */
    protected PrintWriter sal; 

    /**
     * Constructor paramétrico
     * @param ent Buffer de lectura
     * @param archLee lector de archivos
     * @param archEscr escritor de archivos
     * @param sal impresor de archivos
     */
    public Conexion(BufferedReader ent, FileReader archLee, FileWriter archEscr, PrintWriter sal) {
        this.ent = ent;
        this.archLee = archLee;
        this.archEscr = archEscr;
        this.sal = sal;
    }

    /**
     * Constructor básico
     * @throws IOException excepcion Archivo no encotrada
     */
    public Conexion() throws IOException {
       // this.ent = ent;
       this.archLee = null;
       this.archEscr = null;
       // this.sal = sal;
    }
  
    /**
     * Retorna los datos extraidos de un archivo
     * @param nomArchivo nombre del archivo a leer
     * @return String
     * @throws IOException excepcion, archivo no encotrado
     */
    public String leerDatos(String nomArchivo) throws IOException{
  //System.out.println("Entré...");
   this.archLee = new FileReader(nomArchivo);
   ent = new BufferedReader(archLee);
   String datos=" ";
   String linea = this.ent.readLine();
   while (linea != null) { 
        datos+=linea+"\n";
  //       System.out.println(" "+datos);
    linea = ent.readLine();
   }
    ent.close();
    return datos;
 }

    /**
     * Escribe datos en un archivo
     * @param datos datos a plasmar
     * @param nomArchivo nombre del archivo
     * @throws IOException excepcion, archivo no encontrado
     */
    public void EscribeDatos(String datos, String nomArchivo) throws IOException
 { 
   archEscr= new FileWriter(nomArchivo,true);
   sal = new PrintWriter(archEscr);
   sal.println(datos);
   System.out.println("Ejecuto accion");
   sal.close();
 } 

}
