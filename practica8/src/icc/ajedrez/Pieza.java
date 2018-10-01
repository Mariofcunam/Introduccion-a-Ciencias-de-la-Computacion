/* -------------------------------------------------------------------
 * Pieza.java
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
package icc.ajedrez;
/**
 *Clase abstractica para piezas
 */
public abstract class Pieza{
    protected int renglon = 0;
    protected char columna = null;
    protected boolean color = false;
    
    /**
     *Constructor para clase pieza
     *@param renglon -- renglon en el que se encuentra la pieza
     *@param columna -- renglon en el que se encuentra la columna
     */
    public Pieza(int renglon, char columna){
	this.renglon=renglon;
	this.columna=columna;
    }
    /**
     *Metodo para obtener renglon de la pieza
     *@return renglon - renglon de la pieza
     */
    public int getRenglon(){
	return renglon;
    }
    /**
     *Metodo para asignar renglon en la que se encunetra la pieza
     *@param renglon - renglon en la que se encuentra la pieza
     *@throws IllegalArgumentException - Exception si el parametro pasado es 
     *incorrecto
     */
    public void setRenglon(int reglon){
	if(renglon <1 || renglon>8){
	    throw new IllegalArgumentException("El valor debe ser entre 1 y 8");
	}else{
	    this.renglon=renglon;
	}
    }
    /**
     *Metodo para obtener columna de la posicion indicada.
     *@return columna - columna en la que se encunentra la pieza
     */
    public char getColumna(){
	return columna;
    }
    /**
     *Metodo para asignar columna en la que se encunetra la pieza
     *@param columna - columna en la que se encuentra la pieza
     *@throws IllegalArgumentException - Exception si el parametro pasado es
     *incorrecto
     */
    public void setColumna(char columna){
	if(columuna != 'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'){
	    throw new IllegalArgumentException("Valor invalido");
	}else{
	    this.columna=columna;
	}
    }
    /**
     *Metodo abstracto para que da una lista con las posiciones de todas las 
     *casillas que se podria mover esta pieza.
     */
    public Lista posiblesMovimientos();

    /**
     *Metodo abstracto que indica si el movimiento sera valido para mover la
     *pieza hasta su posicion actual
     *@param renglon - renglon en que se encuentra la pieza
     *@param columna - columna en el que se encuentra la pieza
     */
    public boolean esValida(int renglon, char columna);
    
    /**
     *Metodo abstracto que devuelve una presentacion con cadena de la pieza
     *y su estado actual
     */
    public boolean toString();
