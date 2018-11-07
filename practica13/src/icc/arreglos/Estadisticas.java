/* -------------------------------------------------------------------
 * Estadisticas.java
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
import java.io.File;
import java.util.Scanner;
/**
 *Clase estadistica
 */
public class Estadisticas{
    private double[] datos;

    /**
     *Constructor que carga el archivo para llenar los datos
     *@param fileName -- nombre del archivo
     *@throws FileNotFoundException -- Excepcion en caso de que no se encuentre
     *el archivo
     */
    public Estadisticas(String fileName) throws FileNotFoundException{
	this.datos=this.cargarArreglo(fileName);
    }
    /**
     *Metodo para cargar el arreglo
     *@param name -- nombre del archivo que se le pasara
     *@throws FileNotFoundException -- Excepcion en caso de que no se encuentre
     *el archivo
     *@return datos -- datos del archivo
     */
    public  double[]  cargarArreglo(String name) throws FileNotFoundException{
  	    File file = new File(name);
	    Scanner in = new Scanner(file);

	    int a = in.nextInt();
	    double[] datos = new double[a];

	    for(int i=0;i<a;i++){
		datos[i]=in.nextDouble();
	    }
	    return datos;
	    
	}
    /**
     *Metodo para obtener la media que devuelva de los datos en el arreglo
     *@return double - promedio de los datos en el arreglo
     */
    public double media(){
	double suma = 0.0;
	for(int i = 0; i<datos.length;i++){
	    suma += datos[i];
	}
	return suma/datos.length;
    }
    /**
     *Metodo para obtener la varianza
     *@return double -- varianza 
     */		    
    public double varianza(){
	double acMedia=0.0;
	double acMedia1=0.0;
	double x=0.0;
	double varianza;
	int n=0;
	while(x!=0){
	    acMedia = acMedia+x;
	    acMedia1 = acMedia1 + x*x;
	    n++;
	}
	return varianza = acMedia1/(n-1)-(acMedia*acMedia)/(n*(n-1));
    }
}
