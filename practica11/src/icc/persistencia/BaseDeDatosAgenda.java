/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.persistencia;
/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {	

     
    private ManejadorDeLista tabla;
    private RegistroAgenda firstContact=null;

	/**
	 * Constructor.
	 *@param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 *@param tam_nombre -- tamaño de la cadena del noombre de los contactos.
	 *@param tam_direccion -- tamaño de la  cadena de la direccion de los contactos.
	 *@param tam_telefono -- tamaño de la cadena del telefono de los contactos.
	 */
	public BaseDeDatosAgenda(String datos,
				 int tam_nombre,
				 int tam_direccion,
				 int tam_telefono) {
		int tam_registro = tam_nombre + tam_direccion + tam_telefono;
		tabla = new ManejadorDeLista();
		if(datos.length() % tam_registro != 0) System.out.println("CADENA INVALIDA");
		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.
		int pos = 0;
		String nombre, direccion;
		int telefono;
		while(pos<datos.length()){
		    nombre = datos.substring(pos, pos + tam_nombre);
		    direccion = datos.substring(pos + tam_nombre, pos + tam_nombre + tam_direccion);
		    telefono = Integer.parseInt(datos.substring(pos + tam_nombre + tam_direccion, pos + tam_nombre + tam_direccion + tam_telefono));
		    tabla.agrega(new RegistroAgenda(nombre, direccion, telefono));
		    pos += tam_registro;
		}
		
	}
    /**
     *Metodo para obtener un registro por nombre
     *@param nombre -- registro que sera buscado 
     *@return rg -- registro
     */
	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
	    BuscadorPorNombre b = new BuscadorPorNombre(nombre);
	    RegistroAgenda rg = (RegistroAgenda)(tabla.encuentra(b));
	    return rg;
	}
    /**
     *Metodo para obtener un registro por telefono
     *@param tel - registro que sera buscado
     *@return auxT - registro
     */
	public RegistroAgenda dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
	    BuscadorPorTelefono t = new BuscadorPorTelefono(tel);
	    RegistroAgenda auxT = (RegistroAgenda)(tabla.encuentra(t));
	    return auxT;
	}
    /**
     *Metodo para agregar un registro
     *@param reg - registro a ser agregado
     */
    public void  addaRecord(RegistroAgenda reg){
	RegistroAgenda aux = null;
	RegistroAgenda previous=null;
	RegistroAgenda actual=null;
	if(firstContact==null){
	    firstContact=reg;
	}else if(firstContact.getSiguiente()==null){
	    if(firstContact.getNombre().compareTo(reg.getNombre())>0){
		aux=firstContact;
		firstContact = reg;
		firstContact.setSiguiente(aux);
	    }else
		firstContact.setSiguiente(reg);
	}else{
	    previous=null;
	    actual=this.firstContact;
	    while(actual!=null){
		if(actual.getNombre().compareTo(reg.getNombre())>=0){
		    aux=actual;
		    if(previous!=null)
			previus.getSiguiente(reg);
		    else
			this.firstContact=reg;
		    reg.setSiguiente(reg);
		    break;
		}
		else if(actual.getNombre().compareTo(reg.getNombre()) < 0){
		    previous=actual;
		    actual=actual.getSiguiente();
		    if(actual==null){
			previous.getSiguiente(reg);
			break;
		    }
		}
	    }
	}
    }
}
