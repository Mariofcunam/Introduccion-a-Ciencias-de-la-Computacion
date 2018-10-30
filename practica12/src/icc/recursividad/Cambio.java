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

import java.util.Scanner;

public class Cambio{
    private int numDiez;
    private int numCinco;
    private int numDos;
    private int numUno;
    private MaquinaDeCambio myChange;

    /**
     *Constructor por omision. Crea una maquina de cambio con $10,$5,$2,$1
     */
    public Cambio(){
	this(10.00,5.00,2.00,1.00);
    }
    /**
     *Constructor que recibe una cantinidad iniciar de dinero para empezar a 
     *a funcionar
     *@param startingMoney -- cantidad inicial para el funcionamiento de la
     *maquina de cambio.
     */
    public Cambio(double startingMoney){
	if(startingMoney<0){
	    throw new IllegalArgumentException("No se puede dar cambio con dinero negativo");
	}
    myChange = new MaquinaDeCambio(startingMoney);
    }
    /**
     *Metodo para cobrar
     *@param importe - importe que se debe cobrar
     */
    public void charge(double importe){
	double receivedMoney = 0;

	receivedMoney = receiveMoney(importe);
	myChange.saveMoney(receivedMoney);
	double change = receivedMoney - importe;
	if(myChange.getTotal()>=change){
	    myChange.withdrawMoney(change);
	    System.out.println("\n*** Cambio regresado: " + change);
	}else{
	    System.out.println("\n*** De momento no hay cambio ***");
	    myChange.withdrawMoney(receivedMoney);
	}
    }
    /**
     *Metodo para conocer la cantidad total de dinero que hay en la caja
     *@return double -- dinero depositado en la caja
     */
    public double cut(){
	return myChang.cut();
    }
    /*
     *Metodo privado para recibir el importe de una compra.
     *@param importe -- cantidad que espera recibir
     *@return double -- cantidad recibida
     */
    private double receiveMoney(double importe){
	Scannner in = new Scanner(System.in);
	double receivedMoney = 0;
	double balance = importe;

	do{
	    System.out.println("Deposita tu dinero ");
	    double money = in.nextDouble();
	    if(money>0){
		receivedMoney += money;
		balance = importe - receivedMoney;
	    }
	    if(balance > 0)
		System.out.println("El importe a pagar es $ " + importe + "falta $" + balance);
	}while(receivedMoney < importe);

	return receivedMoney;
    }
}
