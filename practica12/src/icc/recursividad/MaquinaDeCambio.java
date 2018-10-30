/* -------------------------------------------------------------------
 * MaquinaDeCambio.java
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
package icc.recursividad;

/**
 *Clase para simular el funcionamiento de una maquina de cambio
 */
public class MaquinaDeCambio{
    private double total;
    private double startingQuantity;

    /**
     *Construor.Inicializa una maquina e cambio poniendo en cero su cantidad
     *inicial y dando un total acomulado inicial
     *@param starting - cantidad de dinero con que se abrira la maquina de
     *cambio
     */
    public MaquinaDeCambio(double starting){
	starting = Math.abs(starting);
	total = starting;
	startingQuantity = starting;
    }
    /**
     *Constructor por omision
     *Inializa una maquina de cambio con las monedas $10, $5, $2 y $1
     */
    public MaquinaDeCambio(){
	this(10.00,5.00,2.00,1.00);
    }
    /**
     *Metodo para guadar en la maquina de cambio  el dinero recibido
     *@param importe -- cantidad de dinero que se guardara
     */
    public void saveMoney(double importe){
	total += importe;
    }
    /**
     *Metodo para retirar de la maquina de cambio una cierta cantidad
     *@param importe -- cantidad a ser retirada
     */
    public void withdrawMoney(double importe){
	total -= importe;
    }
    /**
     *Metodo para obtener la cantidad de dinero acomulada en la maquina de 
     *cambio
     *@return double -- cantidad acomulada
     */
    public double obtenerTotal(){
	return total-startingQuantity;
    }
    /**
     *Metodo  para devolver la cantidad de dinero que hay en la maquina 
     *de cambio
     *@return total -- cantidad de dinero acomulada en la maquina de cambio
     */
    public double cut(){
	return total;
    }
