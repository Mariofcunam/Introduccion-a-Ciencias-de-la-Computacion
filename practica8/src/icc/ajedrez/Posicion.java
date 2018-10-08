/* Posicion.java
 * versión 2.0
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
 
package icc.ajedrez;
/**
 *Clase Posicion
 */

public class Posicion{
    private int renglon=0;
    private char columna;
    private Posicion posicion;

    /**
     *Constructor de clase posicion
     *@param renglon - renglon en la cual la pieza estara colocada
     *@param columna - columna en la cual la pieza estara colocada
     */
    public Posicion(int renglon, char columna){
	this.renglon=renglon;
	this.columna=columna;
    }
    /**
     *Constructor de posicion
     *@param posicion - posicion de la pieza
     */
    public Posicion(Posicion posicion){
	this.posicion=posicion;
    }
    /**
     *Metodo para obtener renglon de la posicion
     *@return renglon - renglon de la posicion
     */
    public int getRenglon(){
	return renglon;
    }
    /**
     *Metodo para asignar renglon en la posicion indicada.
     *@param renglon - renglon de la posicion
     *@throws IllegalArgumentException - Exception si el parametro pasado es 
     *incorrecto
     */
    public void setRenglon(int renglon){
	if(renglon <=0 || renglon>=9){
	    throw new IllegalArgumentException("El valor debe ser entre 1 y 8");
	}else{
	    this.renglon=renglon;
	}
    }
    /**
     *Metodo para obtener columna de la posicion indicada.
     *@return columna - columna de la posicion
     */
    public char getColumna(){
	return columna;
    }
    /**
     *Metodo para asignar columna en la posicion indicada
     *@param columna - columna de la posicion
     *@throws IllegalArgumentException - Exception si el parametro pasado es
     *incorrecto
     */
    public void setColumna(char columna){
	if(columna <= 96 || columna >= 105){
	    throw new IllegalArgumentException("Columna invalida, solo caracteres [a-h]");
	}else{
	    this.columna=columna;
	}
    }
    public String toString(){
	return "[" + renglon + ", " + columna + "]";
    }
}
    
	
