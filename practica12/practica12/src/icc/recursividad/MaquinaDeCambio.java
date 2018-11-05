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

import icc.util.*;
/**
 *Clase para simular el funcionamiento de una maquina de cambio
 */
public class MaquinaDeCambio{
    private ManejadorDeLista combinationsList;

    /**
     *Metodo para obtener una lista de combinaciones posibles de cambio
     *@param change -- cambio del cual se daran las combinaciones
     *@return combinationsList -- Lista de combinaciones
     */
    public ManejadorDeLista combinations(int change){
	combinationsList = new ManejadorDeLista();
	Cambio c = new Cambio(1,1,1,1);
	Cambio c1 = new Cambio();
	combinations(c1,change,c);
	return combinationsList;
    }
    /**
     *Metodo para obtener el cambio
     *@param currentCoin - Moneda actual
     *@param amount -- Importe
     *@param coins - Monedas
     *@throws IllegalArgumentException -- Excepcion en caso de que el usuario 
     *ingrese alguna cantidad negativa
     */
    public void  combinations(Cambio currentCoin, int amount, Cambio coins){
	int receivedCoin;
	Cambio aux;
	if(amount<0)
	    throw new IllegalArgumentException("No se trabaja con dinero negativo");
	if(amount==0){
	    combinationsList.agrega(currentCoin);
	}else{
	    receivedCoin = getReceivedCoin(coins,amount);
	    if(receivedCoin!=0){
		aux = new Cambio(coins);
		getReceivedCoin(aux,receivedCoin);
		combinations(new Cambio(currentCoin),amount,aux);
		giveChange(currentCoin,receivedCoin);
	        combinations(currentCoin,amount-receivedCoin,coins);
	    }
	}
    }
    /**
     *Metodo para obtener el valor del dinero recibido
     *@param change -- cambio
     *@param receivedCoin -- Moneda recibida
     *@return int - valor de moneda recibida
     */
    public int getReceivedCoin(Cambio change, int receivedCoin){
	if(change.getNumDiez() > 0 && receivedCoin >= 10){
	    return 10;
	}else if(change.getNumCinco() > 0 && receivedCoin >= 5){
	    return 5;
	}else if(change.getNumDos() > 0 && receivedCoin >= 2){
	    return 2;
	}else if(change.getNumUno() > 0 && receivedCoin >=1){
	    return 1;
	}else{
	    return 0;
	}
    }
    /**
     *Metodo para que da cambio
     *@param change -- cambio
     *@param receivedCoin - Moneda recibida
     */
    public void giveChange(Cambio change, int receivedCoin){
	if(receivedCoin == 10){
	    change.setNumDiez(change.getNumDiez()+1);
    }else if(receivedCoin == 5){
	change.setNumCinco(change.getNumCinco()+1);
    }else if(receivedCoin == 2){
	change.setNumDos(change.getNumDos()+1);
    }else if(receivedCoin == 1){
	change.setNumUno(change.getNumUno()+1);
	}
    }

}
