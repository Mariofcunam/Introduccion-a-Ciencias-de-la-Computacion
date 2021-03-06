/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;
/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

	/*  Número de caracteres que debe tener el registro nombre. */
	private static final int TAM_NOMBRE    = 20;
	/*  Número de caracteres que debe tener el registro dirección. */
	private static final int TAM_DIRECCION = 30;
	/*  Número de caracteres que debe tener el registro teléfono. */
	private static final int TAM_TELEFONO  = 8;

	private static final String tabla1 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Juan Pérez García   "+"Avenida Siempre Viva # 40     "+"55554466"+
	"Arturo López Estrada"+"Calle de la abundancia # 12   "+"55557733"+
	"Edgar Hernández Levi"+"Oriente 110 # 14              "+"55512112"+
	"María García Sánchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
	"Pedro Páramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
	"José Arcadio Buendía"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermúdez      "+"Sótanos de México # 45        "+"55552112"+
	"Carlos García Vigil "+"La República # 1              "+"55554332"+
	"Eligio García Agusto"+"Ciudades Desiertas # 90       "+"56344325";

	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
	
	    
	    String name ="Florentino Ariza";
	    String name1="Eligio García Agusto";
	    String telephone = "55551221";
	    int result = Integer.parseInt(telephone);
	    String telephone1="56344325";
	    int result1=Integer.parseInt(telephone1);
	    BaseDeDatosAgenda searchName = new BaseDeDatosAgenda(tabla1, TAM_NOMBRE,TAM_DIRECCION, TAM_TELEFONO);
	    System.out.println(searchName.dameRegistroPorNombre(name));
	    BaseDeDatosAgenda searchTelephone = new BaseDeDatosAgenda(tabla1, TAM_NOMBRE,TAM_DIRECCION, TAM_TELEFONO);
	    System.out.println(searchTelephone.dameRegistroPorTelefono(result));
	    BaseDeDatosAgenda searchName1 = new BaseDeDatosAgenda(tabla2, TAM_NOMBRE, TAM_DIRECCION, TAM_TELEFONO);
	    System.out.println(searchName1.dameRegistroPorNombre(name1));
	    BaseDeDatosAgenda searchTelephone1 = new BaseDeDatosAgenda(tabla2, TAM_NOMBRE,TAM_DIRECCION, TAM_TELEFONO);
	    System.out.println(searchTelephone1.dameRegistroPorTelefono(result1));

	    
	    
	}
}

/* </UsoBaseDeDatosAgenda.java> */
