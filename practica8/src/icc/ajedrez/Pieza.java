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
import java.util.LinkedList;
/**
 *Clase abstractica para piezas
 */
public abstract class Pieza{
    protected Posicion  posicion;
    protected boolean color;
    protected int renglon;
    protected char columna;
    /**
     *Constructor para clase pieza
     *@param renglon -- renglon en el que se encuentra la pieza
     *@param columna -- renglon en el que se encuentra la columna
     */
    public Pieza(int renglon, char columna){
	posicion = new Posicion(renglon, columna);
	color = true;
    }
    /**
     *Metodo abstracto que regresa una lista de los posibles movimientos
     */
    public abstract LinkedList<Posicion> posiblesMovimientos();
    /**
     *Metodo booleano que verfica que la posicion es valida
     *@param renglon--renlgon en el que se encuentra
     *@param columna--columna en la que se encunetra la pieza
     */
     
    public abstract boolean esValida(int renglon, char columna);
    /**
     *Metodo que regresa una cadena de strings que representa el estado de la 
     *pieza
     */
    public abstract String  toString();
    /**
     *Metodo que asigna renglon
     *@param renglon - renglon al que se le asignara la pieza
     */
    public void setRenglon(int renglon){
	posicion.setRenglon(renglon);
    }
    /**
     *Metodo que asigna una columna
     *@param columna - columna en la que se le asignara la pieza
     */
    public void setColumna(char columna){
	posicion.setColumna(columna);
    }
    /**
     *Metodo para obtener el renglon
     *@return posicion.getReglon - renglon en el que se encuentra la pieza
     */
    public int getRenglon(){
	return posicion.getRenglon();
    }
    /**
     *Metodo para obtener la columna
     *@return posicion.getColumna - columna en el que se encunetra la ppieza
     */
    public char getColumna(){
	return posicion.getColumna();
    }
}
	
