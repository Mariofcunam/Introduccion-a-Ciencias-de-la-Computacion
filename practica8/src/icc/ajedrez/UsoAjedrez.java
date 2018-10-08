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
    private int leeEntero(String mensaje){
        System.out.println(mensaje);
        boolean error = false;
        int num = -1;
        try {
            num = Integer.parseInt(scanner.nextLine());
            if (num <= 0) {
                error = true;
                System.out.println("El valor más chico posible es uno.");
            }
        } catch(NumberFormatException nfe){
            error = true;
            System.out.println("Por favor ingresa un número válido.");
        }
        if (error){
            num = leeEntero(mensaje);
        }
        return num;
    }

    /**
     * Pide un número al usuario.
     * @param mensaje
     * @return 
     */
    private char leeChar(String mensaje) {
        System.out.println(mensaje);
        boolean error = false;
        int num = -1;
	char a = (char) num;
        try {
            num = scanner.nextLine().charAt(0);
            
        } catch (Exception nfe) {
            error = true;
            System.out.println("Por favor ingresa un número válido.");
        }
        if (error) {
            a  = leeChar(mensaje);
        }
        return a;
    }
    
    

    /**
     * Método auxiliar para imprimir el menú para el usuario.
     */
    private void imprimeMenu() {
        System.out.println("Opciones:");//Escribir donde van las piezas(es decir regresar toString de cada pieza
        System.out.println("1) Menu de Rey");
        System.out.println("2) Menu de Reyna");
        System.out.println("3) Menu de caballo");
	System.out.println("4) Menu de Torre");
        System.out.println("5) Salir");
    }

    private void imprimePiezaMenu() {
        System.out.println("Opciones:");//Escribir donde van las piezas(es decir regresar toString de cada pieza
        System.out.println("1) Validar posicion ");
        System.out.println("2) Lista de posiciones ");
        System.out.println("3) Salir");
    }
    
    public void corre() {
        System.out.println(" *** Lista de ajedrez *** ");
        boolean continuar = true;
	int renglon;
	char columna;
	Pieza pieza;
	Rey rey = new Rey(8, 'h');
	Reyna reyna = new Reyna(6,'a');
	Caballo caballo =  new Caballo(2, 'c');
	Torre torre = new Torre(1, 'b');
	int opc;
	boolean esValida;
        while(continuar) {
            imprimeMenu();
            int opcion = leeEntero("Selecciona una opción:");
            switch(opcion) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
		if (opcion == 1){
		    pieza = rey;
		}else if(opcion == 2){
		    pieza = reyna;
		}else if(opcion == 3){
		    pieza = caballo;
		}else if(opcion == 4){
		    pieza = torre;
		}else{
		    pieza=rey;
		}
		System.out.println(pieza.toString());
		imprimePiezaMenu();
		opc= leeEntero("Selecciona opcion");
		switch(opc){
		case 1:
		    renglon = leeEntero("Selecciona un renglon (1-8)");
		    columna = leeChar("Selecciona un renglon [a-h]");
		    esValida=pieza.esValida(renglon,columna);
		    System.out.print("La posicion nueva de la pieza");
		    if (!esValida){
			System.out.println("No es valida ");
		    }else{
			try{
			pieza.setRenglon(renglon);
			pieza.setColumna(columna);
			}catch(IllegalArgumentException e){
			    System.out.println(e);
			}
		    }
		    System.out.println("Si es valida");
		    break;
		case 2:
		    System.out.println(pieza.posiblesMovimientos().toString());
		    break;
		case 3:
		    System.out.println("Regresando al menu anterior");
		    break;
			
		default:
		    System.out.println("Opcion invalida.");
		    break;
		}
		
		break;
	    case 5:
		continuar=false;//Salir de la opcion
		break;
	    default:
			System.out.println("Esa no es una opción válida del menú.");
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        UsoAjedrez interfaz = new UsoAjedrez();
        interfaz.corre();
    }
}

