/* -------------------------------------------------------------------
 * UsoEstadistica.java
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
package icc.arreglos;


import java.io.FileNotFoundException;

/**
 *Clase donde se imprimiran los resultados
 */
public class UsoEstadistica{
    /**
     *Metodo main para poder imprimir los resultados
     *@param args -- argumentos que se le pasaran
     *@throws FileNotFoundException -- Excepcion en caso de que no se encuentre
     *el archivo
     */
    public static void main(String[] args)throws FileNotFoundException{
	String nombreArchivo = args[0];

	Estadisticas calculos = new Estadisticas(nombreArchivo);

	System.out.println("Media : " + calculos.media());
	System.out.println("Varianza : " + calculos.varianza());
    }
}
