/* -------------------------------------------------------------------
 * Ciudadano.java
 * versión 3.0
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
package icc.clases;
public class Ciudadano{
    private String nombre="";
    private String apellidoPaterno ="";
    private String apellidoMaterno="";
    private String fechadeNacimiento = "dd/mm/aa";
    /**
     *Constructor del ciudadano
     *@param nombre - Nombre del ciudadano
     *@param apellidoPaterno- Apellido Paterno del ciudadano
     *@param apellidoMaterno - Apellido Materno del ciudadano
     *@param fechadeNacimiento - fecha de nacimiento del ciudadano
     */
    public Ciudadano(String nombre, String apellidoPaterno, String apellidoMaterno, String fechadeNacimiento){
	this.nombre = nombre;
	this.apellidoPaterno = apellidoPaterno;
	this.apellidoMaterno = apellidoMaterno;
	this.fechadeNacimiento = fechadeNacimiento;
    }
    /**
     *Metódo para calcular el rfc.
     *@return rfc - rfc del ciudadano.
     */
    public String calculaRFC(){
        String apellidoPat=apellidoPaterno.substring(0,2); 
	String apellMat=apellidoMaterno.substring(0,1);
	String name=nombre.substring(0,1);
	String year=fechadeNacimiento.substring(8);
	String month=fechadeNacimiento.substring(3,5);
        String day=fechadeNacimiento.substring(0,2);

	String rfc= apellidoPat.toUpperCase()+apellMat.toUpperCase()+name+year+month+day;
	
	return rfc;
    }
    /**
     *Método para devolver el nombre, cumpleaños y rfc en forma de cadena de caracteres.
     *@return String -- el nombre, cumpleaños y rfc en forma de cadena de caracteres.
     */
    public String toString(){
	return "El ciudadano: " + nombre + " con cumpleaños en " + fechadeNacimiento.substring(0,5) + " con rfc de : " + calculaRFC();
    }
}
	
