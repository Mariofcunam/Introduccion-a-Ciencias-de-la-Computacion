/* -------------------------------------------------------------------
 * GuardarRegistro.java
 * versión 1.0
 * Copyright (C) 2018  Mario Navarrete Baltazar.
 * Facultad de Ciencias,
 * Universidad Nacional Autónoma de México, Mexico.
 *
 * Este programa es software libre; se puede redistribuir
 * y/o modificar en los términos establecidos por la
 * Licencia Pública General de GNU tal como fue publicada
 * por la Free Software Foundation en la versión 2 o
 * superior.
 *
 * Este programa es distribuido con la esperanza de que
 * resulte de utilidad, pero SIN GARANTÍA ALGUNA; de hecho
 * sin la garantía implícita de COMERCIALIZACIÓN o
 * ADECUACIÓN PARA PROPÓSITOS PARTICULARES. Véase la
 * Licencia Pública General de GNU para mayores detalles.
 *
 * Con este programa se debe haber recibido una copia de la
 * Licencia Pública General de GNU, de no ser así, visite el
 * siguiente URL:
 * http://www.gnu.org/licenses/gpl.html
 * o escriba a la Free Software Foundation Inc.,
 * 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * -------------------------------------------------------------------
*/
package icc.agenda;

import icc.agenda.*;
import icc.util.*;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 *Clase
 */
public class GuardarRegistro implements IBuscador{
    private PrintStream reg;
    private PrintStream save;
    private Scanner file;

    /**
     *Constructor para guardar un registro
     *@param reg - registro a ser guardado
     */
    public GuardarRegistro(PrintStream reg){
	if(reg==null){
	    throw new NullPointerException("No se encuentra el registro");
	}else{
	this.reg=reg;
	}
    }
    /**
     *Metodo que indica si el objeto pasado como parametro
     *es el que se esta buscando.
     *@param reg -- Registro que sera evaluado si este es igual al que se esta
     *buscando.
     *@throws FileNotFoundException--Excepcion en el caso de que no se encuentre
     *un archivo
     *@throws SecurityException--Excepcion para indicar que no tiene permiso de
     *escribir en el codigo
     *@return false -- false en caso de que no sea el archivo buscado
     */
    public boolean esEste(Object reg) throws FileNotFoundException{
	file = new Scanner(new File("Agenda.txt"));
	save = new PrintStream("guardar.txt");
	try(PrintStream fout = new PrintStream("Agenda.txt")){
	    fout.println("Inicio");
	    fout.format("Linea %d\n", 1);
	    fout.println("Fin");
	}catch (FileNotFoundException fnfe){
	    System.err.println("No se encontro el archivo " + file + "y no pudo ser creado");
	}catch (SecurityException se){
	    System.err.println("No se tiene permiso de escribir en el codigo");
	}
	PrintStream reg1 = (PrintStream) reg;
	RegistroAgenda aux = (RegistroAgenda)reg;
	aux.saveAgenda(reg1);
	return false;
    }
}

	
       
