/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {	

     
    private ManejadorDeLista tabla;
    private Lista cabeza;
    private int longitud;
    private Scanner file;
    private static String savedDataBase_file_location = "/User/appsshah/Ciencias/2019-1/ICC/practica11/src/icc/agenda";
    private BaseDeDatosAgenda e;
    private BaseDeDatosAgenda s;

    /**
     *Constructor por omision de Base de base dats agenda
     */
    public BaseDeDatosAgenda(){
	ManejadorDeLista tabla=new ManejadorDeLista();
    }

	/**
	 * Constructor.
	 *@param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 *@param tam_nombre -- tamaño de la cadena del noombre de los contactos.
	 *@param tam_direccion -- tamaño de la  cadena de la direccion de los contactos.
	 *@param tam_telefono -- tamaño de la cadena del telefono de los contactos.
	 */
	public BaseDeDatosAgenda(String datos,
				 int tam_nombre,
				 int tam_direccion,
				 int tam_telefono) {
		int tam_registro = tam_nombre + tam_direccion + tam_telefono;
		tabla = new ManejadorDeLista();
		if(datos.length() % tam_registro != 0) System.out.println("CADENA INVALIDA");
		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.
		int pos = 0;
		String nombre, direccion;
		int telefono;
		while(pos<datos.length()){
		    nombre = datos.substring(pos, pos + tam_nombre);
		    direccion = datos.substring(pos + tam_nombre, pos + tam_nombre + tam_direccion);
		    telefono = Integer.parseInt(datos.substring(pos + tam_nombre + tam_direccion, pos + tam_nombre + tam_direccion + tam_telefono));
		    tabla.agrega(new RegistroAgenda(nombre, direccion, telefono));
		    pos += tam_registro;
		}
		
	}
    /**
     *Metodo para obtener un registro por nombre
     *@param nombre -- registro que sera buscado 
     *@return rg -- registro por nombre
     */
	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista
	    if(nombre==null)
		throw new NullPointerException("El usuario no se encuetra");
	    BuscadorPorNombre b = new BuscadorPorNombre(nombre);
	    RegistroAgenda rg = (RegistroAgenda)(tabla.encuentra(b));
	    return rg;
	}
    /**
     *Metodo para obtener un registro por telefono
     *@param tel - registro que sera buscado
     *@return auxT - registro por teefono
     */
	public RegistroAgenda dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
	    BuscadorPorTelefono t = new BuscadorPorTelefono(tel);
	    RegistroAgenda auxT = (RegistroAgenda)(tabla.encuentra(t));
	    return auxT;
	}
    	/**
	 * Agrega un registro agenda al final de la lista.
	 *@param elemento -- Elemento que sera agregado al final de la lista.
	 */
	public void agrega(Object elemento) {
		// Crea el nuevo elemento y lo cuenta.
		Lista nuevo = new Lista(elemento);
		longitud++;

		// Si la lista está vacía añade al primer elemento y termina.
		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}

		// Si no, hay que recorrer la lista para formar al nuevo
		// elemento detrás del último.
		Lista anterior = cabeza;
		while(anterior.getSiguiente() != null) {
		    anterior = anterior.getSiguiente();
		}
		anterior.setSiguiente(nuevo); 
	}
    /**
     *Metodo para guardar una agenda
     *@param nombreArchivo--Nombre del archivo
     *@throws IOException--Exception que se lanza de que se intente 
     *escribir en el codigo
     */
    public void guardaAgenda(String nombreArchivo){
	File file = new File(savedDataBase_file_location) ;
	if(!file.exists()){
	    try{
		File directory = new File(file.getParent());
		if(!directory.exists()){
		    directory.mkdirs();
		}
		directory.createNewFile();
	    }catch(IOException e){
		log("La excepcion ocurrio en :" + e.toString());
	    }
	}
	try{
	    FileWriter fileWriter;
	    fileWriter = new FileWriter(file.getAbsoluteFile(),true);

	    BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
	    bufferWriter.write(nombreArchivo.toString());
	    bufferWriter.close();
	    log("La base de datos se guardo en " + savedDataBase_file_location +
		"archivos " + nombreArchivo + "\n");
	} catch(IOException e){
	    log("Error mientras guardaba la agenda " + e.toString());
	}
    }
    /**
     *Metodo para cargar la base de datos
     *@param nombreArchivo - nombre del archivo que sera cargado
     *@throws Exception - Excepcion
     */
    public void carga(String nombreArchivo){
	File file = new File(savedDataBase_file_location);
	if(!file.exists())
	    log("No existe el archivo");

	InputStreamReader isReader;
	try{
	    isReader = new InputStreamReader(new FileInputStream(nombreArchivo));

	    BufferedReader in = new BufferedReader(new FileReader("Base de Datos.txt"));
	    String line;
	    while((line = in.readLine())!=null){
		System.out.println(line);
	    }
	    in.close();
    
	}catch(FileNotFoundException e){
	    System.err.println("No se encontro le archivo Base de Datos.txt, olvidaste crearlo");
	}catch (IOException ioe){
	    System.err.println("Error al leer contenido de Base de Datos.txt");
	}
	log("\nBase de datos exitosamente cargada del archivo " + savedDataBase_file_location);
    }
    /**
     *Metodo para imprimir toda la base de datos
     */
    public void imprime(){
	System.out.println(e);
	if(s!=null){
	    s.imprime();
	}
    }
     /**
     *Metodo para imprimir una cadena de caracteres
     *@return cadena--cadena de caracteres
     */
    public String toString(){
	String cadena = "[" + e + "]";
	if(s!=null){
	    cadena +=s.toString();
	}
	return cadena;
    }
    
		
    /*
     *Metodo para que la terminal tenga interaccion con el usuario
     *@param String--Cadena de texto que representara la termial
     */
    private static void log(String string){
	System.out.println(string);
    }
    /*
     *Metodo auxiliar que recibe que como parametro un buffer de tipo String
     *@param sb-Buffer tipo String
     */
    private void toString(StringBuffer sb){
	sb.append("[");
	sb.append(e.toString());
	sb.append("]");
	if(s!=null)
	    sb.append(s.toString());
    }
    
   
}

