/* -------------------------------------------------------------------
 * Contactos.java
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
package icc.contactos;
/**
 *Clase para guardar el resgistro de los datos
 */
public class Contactos{
    private Registro contacto1=null;
    /**
     *Constructor de clase contactos
     *@paran contacto1 - primer contacto
     */
    public Contactos(){
	this.contacto1=null;
    }
    /**
     *Metodo para insertar contactos
     *@param reg - Registro del nuevo contacto
     */
    public void insertaContacto(Registro reg){
			
    }
    
    
    
	    
			
    
			
    /**
     *Metodo para imprimir contactos en orden alfabetico
     */
    public void imprimeContactos(){
	System.out.println(toString());
    }
    /**
     *Metodo para consultar un registro
     */
    public Registro consultar(String nombre){
	return null;
    }

		
     /**
     *Método String para regresar una cadena
     *@return s  
     */
   
    public String toString(){
	Registro aux = null;
	Registro reg = aux;
	String s = " ";
	while(aux !=null){
	    s = s + aux.toString() + "\n";
	    aux = aux.siguiente;
	} 
	return s;
    }
	    
       
    
}
