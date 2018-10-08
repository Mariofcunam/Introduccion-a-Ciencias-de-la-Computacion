/* Caballo.java
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

import java.util.LinkedList;
/**
 *Clase de la pieza caballo
 */
public class Caballo extends Pieza{

    /**
     *Constructor que crea una pieza caballo
     *@param renglon - renglon donde se encuentra el caballo
     *@param columna - columna donde se encunetra el caballo
     */
    public Caballo(int renglon, char columna){
	super(renglon, columna);
    }
       @Override
    public LinkedList<Posicion> posiblesMovimientos(){
        LinkedList<Posicion> list = new LinkedList<>();
	Posicion aux = new  Posicion(posicion);
	for(int i =2; i<=7;i++){
	    aux.setRenglon(i);
	    list.add(new Posicion(aux));
	}
	for(char i ='b';i<'i';i++){
	    aux=new Posicion(posicion);
	    aux.setColumna(i);
	    list.add(new Posicion(aux));
	}
	return list;
       }
	    
    @Override
    public  boolean esValida(int renglon, char columna){
	int diferenciaRenglon = this.renglon-renglon;
	int diferenciaColumna = this.columna-columna;
      
	if(renglon <=0 || renglon >= 9) return false;
	if(columna <=96 || columna >=105) return false;

	//El movimiento del caballo se caracteriza por moverse en L.
	//1 en renglones y 2 en columnas o viceversa(valor absoluto)
	if(((Math.abs(diferenciaRenglon)==1)&&(Math.abs(diferenciaColumna)==2)) ||
	   ((Math.abs(diferenciaRenglon)==2)&&(Math.abs(diferenciaColumna)==1))){
	   
	    return true;
	}else{
	    return true;
	
	}
    }
    @Override
    public String toString(){
	return "Caballo" + posicion.toString() + ", color: " + (color?"blanco":"negro");
    }
    
}
    

