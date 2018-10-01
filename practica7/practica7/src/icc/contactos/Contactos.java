/* -------------------------------------------------------------------
 * Contactos.java
 * versión 6.0
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
     */
    public Contactos(){
	this.contacto1=null;
    }
    /**
     *Metodo para insertar contactos
     *@param reg - Registro del nuevo contacto
     */
    public void insertaContacto(Registro reg){
	Registro aux=null;
	Registro anterior=null;
	Registro actual=null;
	if(contacto1==null){
	    contacto1=reg;
	}else if(contacto1.getSiguiente()==null){
	    if(contacto1.getNombre().compareTo(reg.getNombre())>0){
		aux=contacto1;
		contacto1 = reg;
		contacto1.setSiguiente(aux);
	    }else
		contacto1.setSiguiente(reg);
	    
	}else{
	    anterior = null;
	    actual = this.contacto1;
	    while(actual!=null){
		if(actual.getNombre().compareTo(reg.getNombre()) >= 0){
		    aux = actual;
		    if(anterior!=null)
			anterior.setSiguiente(reg);
		    else
			this.contacto1=reg;
			reg.setSiguiente(reg);
			break;
		}
		else if(actual.getNombre().compareTo(reg.getNombre()) < 0){
		    anterior=actual;
		    actual=actual.getSiguiente();
		    if(actual==null){
			anterior.setSiguiente(reg);
			break;
		    }
		}
	    }
	}
    }
    
		    
		    
    
		
    /**
     *Metodo para imprimir contactos en orden alfabetico
     */
    public void imprimeContactos(){
	Registro reg = contacto1;
	String s = " ";
	while(reg !=null){
	    s = s + reg.toString() + "\n";
	    System.out.println(s);	Registro aux = null;
	    reg = reg.getSiguiente();
	} 
 
    }
    
    /**
     *Metodo para consultar un registro
     *@param nombre - nombre que sera pasado
     *@return aux o null si no hay contacto  
     */
    public Registro consultar(String nombre){
	Registro aux = contacto1;
	if(nombre==null)
	    throw new NullPointerException("No se encontro el contacto");
	while(aux!=null){
	    if(aux.getNombre().equals(nombre)){
		return aux;
	    }else if(aux.getDireccion().equals(nombre)){
		return aux;
	    }
	    aux=aux.siguiente;
	}
	return null;
    }
 
    
}
