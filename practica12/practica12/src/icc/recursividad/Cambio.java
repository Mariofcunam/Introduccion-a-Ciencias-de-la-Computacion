/* -------------------------------------------------------------------
 * Cambio.java
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
/**
*Clase para comportamiento de cambio
*/
package icc.recursividad;


public class Cambio{
    int numDiez;
    int numCinco;
    int numDos;
    int numUno;

    /**
     *Constructor de cambio con monedas de $10, $5, $2  y $1
     *@param numDiez--Moneda de diez pesos
     *@param numCinco--Moneda de cinco pesos
     *@param numDos--Moneda de dos pesos
     *@param numUno--Moneda de un peso
     */
    public Cambio(int numDiez, int numCinco, int numDos, int numUno){
	this.numDiez = numDiez;
	this.numCinco = numCinco;
	this.numDos = numDos;
	this.numUno = numUno;
    }
    /**
     *Constructor de copia de la clase cambio
     *@param c - parametro a ser copiado
     */
    public Cambio(Cambio c){
	this(c.numDiez,c.numCinco,c.numDos,c.numUno);
    }
    /**
     *Constructor por omision que inicia el cambio en 0
     */
    public Cambio(){
	this(0,0,0,0);
    }
    /**
     *Metodo para obtener el valor de la moneda de $10
     *@return numDiez -- moneda de $10
     */
    public int getNumDiez(){
	return numDiez;
    }
    /**
     *Metodo para asignar el valor de la moneda de $10
     *@param numDiez-- moneda de $10
     */
    public void setNumDiez(int numDiez){
	this.numDiez=numDiez;
    }
    /**
     *Metodo para obtener el valor de la moneda de $5
     *@return numCinco -- moneda de $5
     */
    public int getNumCinco(){
	return numCinco;
    }
    /**
     *Metodo para asignar el valor de la moneda de $5
     *@param numCinco -- moneda de $5
     */
    public void setNumCinco(int numCinco){
	this.numCinco=numCinco;
    }
    /**
     *Metodo para obtener el valor de la moneda de $2
     *@return numDos -- moneda de $2
     */
    public int getNumDos(){
	return numDos;
    }
    /**
     *Metodo para asignar el valor de la moneda de $2
     *@param numDos -- moenda de $2
     */
    public void setNumDos(int numDos){
	this.numDos=numDos;
    }
    /**
     *Metodo para obtener el valor de la moneda de $1
     *@return numUno -- moneda de $1
     */
    public int getNumUno(){
	return numUno;
    }
    /**
     *Metodo para asignar el valor de la moneda de $1
     *@param numUno -- moneda de $1
     */
    public void setNumUno(int numUno){
	this.numUno=numUno;
    }
    /**
     *Metodo para regresar las monedas en forma de caracteres
     *@return String -- Monedas en formato de String
     */
    public String toString(){
	return "[10:" + numDiez + "5:" + numCinco + "2:" + numDos + "1" + numUno + "]";
    }
}
