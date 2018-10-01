/* -------------------------------------------------------------------
 * Registro.java
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
package icc.contactos;
/**
 *Clase para registrar los datos de los contactos
 */
public class Registro{
    private String nombre = "";
    private String direccion = "";
    private String telefono = "";
    Registro siguiente;
    /**
     *Constructor del registro de los contactos
     *@param nombre-nombre del contacto
     *@param direccion - direccion del contacto
     *@param telefono - telefono del contacto
     */
    public Registro(String nombre, String direccion, String  telefono){
	this.nombre = nombre;
	this.direccion = direccion;
	this.telefono = telefono;
    }

    /**
     *Metodo para obtener nombre
     *@return nombre-nombre del contacto
     */
    public String getNombre(){
	return nombre;
    }
    /**
     *Metodo para obtener direccion
     *@return direccion - direccion del contacto
     */
    public String getDireccion(){
	return direccion;
    }
    /**
     *Metodo para obtener telefono
     *@return telefono - telefono del contacto
     */
    public String  getTelefono(){
	return telefono;
    }
    /**
     *Metodo para asignar el nombre del contacto
     *@param nombre - nombre del contaco
     *@throws IllegalArgumentException - En caso del que el nombre sea null se l
     lanza esta excepcion
     */
    public void setNombre(String nombre){
	if(nombre == null){
	    throw new IllegalArgumentException("El nombre del contacto no se encuentra en el registro");
	}else{
	    this.nombre = nombre;
	}
    }
    /**
     *Método para asignar la direccion del contacto
     *@param direccion - direccion del contacto
     *@throws IllegalArgumentException - En caso de que no no tenga dirección
     lanzar excepcion
     */
    public void setDireccion(String direccion){
	if(direccion == null){
	    throw new NullPointerException("La direccion del contacto no se ncuentra en el registro");
	}else{
	    this.direccion = direccion;
	}
    }
    /**
     *Metodo para asignar el telefono del contacto
     *@param telefono - telefono  del contacto
     */
    public void setTelefono(String telefono){
	if(telefono == null){
	    throw new NullPointerException("El telefono del contacto no se encuentra en el registro");
	}else{
	    this.telefono = telefono;
	}
    }
    /**
     *Metodo  para obtener el registro siguiente
     *@return siguiente - registro siguiente
     */
    Registro getSiguiente(){
	return siguiente;
    }
    /**
     *Método  para asgnar el registro siguiente
     *@param siguiente - registro del siguiente
     */
    void setSiguiente(Registro siguiente){
	this.siguiente = siguiente;
    }
    /**
     *Método que devuelve una cadena con los datos almacenados del registro
     *@return String - cadena de los daltos almacenados del registro
     */
    public String toString(){
	return nombre+ " " + direccion +" " + telefono;
    }
 
}

