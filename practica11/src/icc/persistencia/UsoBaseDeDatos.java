/* -------------------------------------------------------------------
 * UsoBaseDeDatos.java
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
package icc.persistencia;

import java.util.Scanner;

/**
 * Interfaz de usuario para manejar una lista de contactos.
 */
public class UsoBaseDeDatos {
    private Scanner scanner;
    private BaseDeDatosAgenda records;
    
    /**
     * Crea la interfaz de usuario para manejar las opciones de uso de una base
     *de datos
     */
    public UsoBaseDeDatos() {
        scanner = new Scanner(System.in);
	records = new BaseDeDatosAgenda();
    }
	
 
    
    /**
     *Metodo que despliega el menu
     */
    public void corre() {
	RegistroAgenda reg;
        System.out.println(" *** Lista de contactos *** ");
        boolean continuar = true;
        while(continuar) {
            imprimeMenu();
            int opcion = leeEntero("Selecciona una opción:");
            switch(opcion) {
	    case 1:
		reg = requestContactData();
		records.addaRecord(reg);
		break;
	    case 2:
		break;
	    case 3:
		break;
	    case 4:
		break;
                case 5:
		    System.out.println("Escribe el nombre del contacto que buscas:");
		    String name = scanner.nextLine();
		    reg = records.dameRegistroPorNombre(name);
		    if(reg==null){
			System.out.println("No se encontro ningun registro con nombre " + name);
		    }else{
			System.out.println("Se encontro a:");
			System.out.println(dameRegistroPorNombre());
		    }
		    break;
	    case 6:
		System.out.println("Escribe el telefono del contacto que buscas");
		int tel = scanner.nextInt();
		reg = records.dameRegistroPorTelefono(tel);
		if(tel==0){
		    System.out.println("No se encontro ningun registro con el telefono " + tel);
		}else{
		    System.out.println("Se encontra a:");
		    System.out.println(dameRegistroPorTelefono());
		}
		break;
                case 7:
		    break;
                case 8:
                    continuar = false;
		    break;
                default:
                    System.out.println("Esa no es una opción válida del menú.");
            }
        }
    }
    /**
     *Metodo main para correr el menu en la terminal
     *@args -- argumentos que se pasaran
     */
    public static void main(String args[]){
	UsoBaseDeDatos menu = new UsoBaseDeDatos();
	menu.corre();
    }
    /*
     *Metodo auxiliar que pide al usuario los datos del contacto nuevo y
     *devuelve su registro en la agenda.
     *@return newContact-nuevos datos de contacto
     */
    private RegistroAgenda requestContactData(){
	Scanner in = new Scanner(System.in);
	System.out.println("Nombre: ");
	String name = scanner.nextLine();
	System.out.println("Direccion: ");
	String address = scanner.nextLine();
	System.out.println("Telefono: ");
	int telephone = scanner.nextInt();

	RegistroAgenda newContact = new RegistroAgenda(name, address, telephone);
	return newContact;
    }
    /*
     * Método auxiliar para imprimir el menú para el usuario.
     */
    private void imprimeMenu() {
        System.out.println("Opciones:");
        System.out.println("1) Crear una base de datos");
        System.out.println("2) Cargar de disco");
        System.out.println("3) Guardar la agenda");
        System.out.println("4) Agregar un registro");
	System.out.println("5) Buscar por nombre");
	System.out.println("6) Buscar por telefono");
	System.out.println("7) Imprimirla toda");
	System.out.println("8) Salir");
    }
     /*
     * Pide un número al usuario.
     * @param mensaje -- mensaje del usuario
     * @return num -- num que sera leido
     */
    private int leeEntero(String mensaje) {
        System.out.println(mensaje);
        boolean error = false;
        int num = -1;
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num <= 0) {
                error = true;
                System.out.println("El valor más chico posible es uno.");
            }
        } catch (NumberFormatException nfe) {
            error = true;
            System.out.println("Por favor ingresa un número válido.");
        }
        if (error) {
            num = leeEntero(mensaje);
        }
        return num;
    }
    
}
