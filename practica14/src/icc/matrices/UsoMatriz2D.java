/* -------------------------------------------------------------------
 * UsoMatriz2D.java
 * versión 4.0
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
package icc.matrices;
/**
 *Clase para probar las operaciones de las matrices
 */
public class UsoMatriz2D{
    /**
     *Metodo main para realizar las operaciones de las matrices
     *@param args - parametros recibidos
     */
    public static void main(String[] args){
	Matriz2D matriz1 = new Matriz2D(2,2);
	Matriz2D matrizSuma = new Matriz2D(3,3);
	matrizSuma = matriz1.sumar(matriz1);

      	Matriz2D matriz2 = new Matriz2D(6,2);
	Matriz2D matrizResta = new Matriz2D(6,6);
	matrizResta = matriz2.resta(matriz1);

	Matriz2D matriz3 = new Matriz2D(8,7);
	Matriz2D matrizMultiplicacion = new Matriz2D(3,2);
	matrizMultiplicacion = matriz3.multiplicar(matriz1);

	Matriz2D matriz4 = new Matriz2D(7,8);
	int escalar = 2;
	Matriz2D matrizMultiplicacionE = new Matriz2D(4,3);
	matrizMultiplicacionE = matriz4.multiplicarEscalar(matriz4,escalar);
    }

}
