/* Rey.java
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
 *Clase para la pieza Rey
 */
public class Rey extends Pieza{

    /**
     *Constructor para la pieza rey
     *@param renglon - renglon en el que la pieza rey se encuentra
     *@param columna - columna en la que la pieza rey se encuentra
     */
    public Rey(int renglon, char columna){
	super( renglon, columna);
    }
        @Override
    public LinkedList<Posicion> posiblesMovimientos(){
        LinkedList<Posicion> list = new LinkedList<>();
	Posicion aux = new Posicion(posicion);
	int renglonAuxiliar=aux.getRenglon();
	char columnaAuxiliar=aux.getColumna();
	for(int i = renglonAuxiliar; i<=(i++);i++){
	    aux.setRenglon(i);
	    list.add(new Posicion(aux));
	}
	for(char i=columnaAuxiliar;i<=(i++);i++){
	    aux = new Posicion(posicion);
	    aux.setColumna(i);
	    list.add(new Posicion(aux));
	}
	return list;
    }
    @Override
    public  boolean esValida(int renglon, char columna){
	int rowDifference=this.renglon-renglon;
	int columnDifference=this.columna-columna;
	if(renglon <= 0 || renglon >=9) return false;
	if(columna <= 96 || columna >=105) return false;
	//Solo se mueve una posicion alrededor
	if(Math.abs(rowDifference)<=1&&Math.abs(columnDifference)<=1){
	    return true;
	}else{
	    return false;
	}
    }
    @Override
    public String toString(){
	return "Rey" + posicion.toString() + ", color: " + (color?"blanco":"negro");
    }
    

}
