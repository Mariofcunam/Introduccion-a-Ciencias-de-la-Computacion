/* -------------------------------------------------------------------
 * UsoAjedrez.java
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
package icc.ajedrez;

import java.util.Scanner;

/**
 * Interfaz de usuario para manejar una lista de contactos.
 * @author blackzafiro
 */
public class UsoAjedrez {
	private Scanner scanner;
    
    /**
     * Crea la interfaz de usuario para manejar un plantío con magueyes, cempohualxochitl y rosas.
     */
    public UsoAjedrez() {
        scanner = new Scanner(System.in);
    }
	
    /**
     * Pide un número al usuario.
     * @param mensaje
     * @return 
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
    

    /**
     * Método auxiliar para imprimir el menú para el usuario.
     */
    private void imprimeMenu() {
        System.out.println("Opciones:");//Escribir donde van las piezas(es decir regresar toString de cada pieza
        System.out.println("1) Menu de Rey");
        System.out.println("2) Menu de Reyna");
        System.out.println("3) Menu de caballo");
        System.out.println("4) Salir");
    }

    private void imprimePiezaMenu() {
        System.out.println("Opciones:");//Escribir donde van las piezas(es decir regresar toString de cada pieza
        System.out.println("1) Mover posicion ");
        System.out.println("2) Lista de posiciones ");
        System.out.println("3) Salir");
    }
    
    public void corre() {
	Registro reg;
	
        System.out.println(" *** Lista de contactos *** ");
        boolean continuar = true;
	int opc;
	Pieza p;
	Rey rey;
	Reyna reyna;
	Caballo cab;
        while(continuar) {
            imprimeMenu();
            int opcion = leeEntero("Selecciona una opción:");
            switch(opcion) {
                case 1:
		    imprimePiezaMenu();
		    opc = leeEntero("Selecciona opcion");
		    switch(opcion){
		    case 1://Cambiar posicion de ficha actual
			//Hacer metodo leerChar, revisar excepcion y utilizar un
			//try-catch
			break;
                case 2:
		    imprimePiezaMenu();
		    opc = leeEntero("Selecciona opcion");
		    break;
                case 3:
		    if(opc == 1){
			p = rey;
		    }else if(opc == 2){
			p = reyna;
		    }else{
			p = cab;
		    }
		    imprimePiezaMenu();
		    opc = leeEntero("Selecciona opcion");
		    switch(opc){
		    case 1:
			p;
			break;
		    case 2:
			break;
		    default:
			break;
		    }
		    break;
		    case 4:
			continuar = false;
			break;
		    default:
			System.out.println("Esa no es una opción válida del menú.");
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        IUContactos interfaz = new IUContactos();
        interfaz.corre();
    }
}
