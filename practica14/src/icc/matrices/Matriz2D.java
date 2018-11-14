/* -------------------------------------------------------------------
 * Matriz2D.java
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
 *Clase para trabajar con matrices
 */
public class Matriz2D{
    private double[][] mat;
    /**
     *Constructor  de la clase matriz
     *@param rows - filas
     *@param columns - columnas
     */
    public Matriz2D(int rows, int columns){
	mat = new double[rows][columns];
    }
	
    /**
     *Metodo para regresar el contenido de la matriz en forma de string
     *@param array - arreglo
     *@return String -- Matriz en forma de String
     */
    public String toString(double array[][] ){
	String mat=" ";
	 for(int i=0; i < array.length;i++){
	    System.out.println("|");
	    for(int j=0; j < array[i].length;j++){
		System.out.println(array[i][j]);
		if(j!=array[i].length-1)
		    System.out.println("\t");
	    }
	    System.out.println("|");
	}
	 return mat;
    }
    /**
     *Metodo estatatico que crea una matriz a partir de un arreglo de dos dimensiones
     *con numeros alteatorios
     *@param array -- arreglo de dos dimensiones
     */
    public static void crearMatriz2D(double[][] array){
	Matriz2D m = new Matriz2D(array.length,array[0].length);
	for(int i=0;i<array.length;i++){
	    for(int j=0;j<array[0].length;j++){
		m.mat[i][j]=array[i][j];
	    }
	}
    }
	    
    
    /**
     *Metodo para obtener la cantidad de renglones de la matriz
     *@return double -- el numero de renglones de la matriz
     */
    public int renglones(){
	return mat.length;
    }
    /**
     *Metodo para obtener el numero de columnas de la matri
     *@return double -- el numero de columas de la matriz
     */
    public int columnas(){
	if(mat.length>0){
	    return mat[0].length;
	}else{
	    return 0;
	}
    }
    /**
     *Metodo para calcular que la suma de dos matrices
     *@param m1--Matriz que sera sumada
     *@return suma -- resultado de  operacion suma 
     */
    public Matriz2D sumar(Matriz2D m1){
         if(m1.mat.length!=mat.length || m1.mat[0].length!=mat[0].length)
	    throw new IllegalArgumentException("Dimensiones incorrectas");

	Matriz2D suma = new Matriz2D(mat.length,m1.mat[0].length);
	for(int i = 0; i < mat.length; i++){
	    for(int j = 0; j < mat[0].length; j++){
		suma.mat[i][j]=m1.mat[i][j] + mat[i][j];
	    }
	}
	return suma;
    }
    /**   
     *Metodo para calcular la resta de dos matrices 
     *@param m1--Matriz que sera sumada
     *@throws IllegalArgumentException -- Dimensiones incorrectas
     *@return resta -- resultado de la operacion resta
     */
    public Matriz2D resta(Matriz2D m1){
        if(m1.mat.length!=mat.length || m1.mat[0].length!=mat[0].length)
	    throw new IllegalArgumentException("Dimensiones incorrectas");

	Matriz2D resta = new Matriz2D(mat.length,m1.mat[0].length);
	for(int i = 0; i < mat.length; i++){
	    for(int j = 0; j < mat[0].length; j++){
		resta.mat[i][j]=m1.mat[i][j] - mat[i][j];
	    }
	}
	return resta;
    }
    
       
    /**
     *Metodo para calcular la multiplicacion de dos matrices
     *@param m1 -- Matriz que sera multiplicada
     *@throws IllegalArgumentException -- Exception en caso de que las matrices
     *no se puedan multiplicar 
     *@return producto -- El producto de las dos matrices
     */
    public Matriz2D multiplicar(Matriz2D m1){
	if(mat[0].length!=m1.mat.length)
	    throw new IllegalArgumentException("No se puede efectuar la multiplicacion tiene dimensiones incorrectas");

	Matriz2D producto = new Matriz2D(mat.length,m1.mat[0].length);
	for(int i = 0; i<producto.mat.length;i++){
	    for(int j = 0; j < producto.mat[0].length;j++){
		for(int k=0; k < mat[0].length;k++){
		    producto.mat[i][j] += (mat[i][k] * m1.mat[k][j]);
		}
	    }
	}
	return producto;
    }
	    
    /**
     *Metodo para multiplicar una matriz a partir de un escalar
     *@param m -- Matriz
     *@param escalar - Escalar
     *@return result -- Matriz multiplicada
     */
    public Matriz2D multiplicarEscalar(Matriz2D m, int escalar){
	Matriz2D result = new Matriz2D(mat.length,m.mat[0].length);
	for(int i=0;i<result.mat.length; i++){
	    for(int j=0;j<result.mat[0].length;j++){
		result.mat[i][j] = escalar * result.mat[i][j];
	    }
	}
	return result;
    }
}
