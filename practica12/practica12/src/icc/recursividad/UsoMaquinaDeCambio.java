/* -------------------------------------------------------------------
 * UsoMaquinaDeCambio.java
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
package icc.recursividad;

import icc.util.*;

import java.util.Scanner;
/**
 *Clase para interactuar con el usuario
 */
public class UsoMaquinaDeCambio{
    private  MaquinaDeCambio machine = new MaquinaDeCambio();
    private  Scanner scanner = new Scanner(System.in);
    
    /**
     *Metodo para correr el menu
     */
    public void run(){
	System.out.println("Maquina de cambio");
	boolean continuar = true;
	while(continuar){
	    imprimeMenu();
	    int option=leeEntero("Selecciona una opcion");
	    switch(option){
	    case 1:
		System.out.println("Ingresa el dinero del cual quieres obtener el cambio");
		String aux = scanner.nextLine();
		int money = Integer.parseInt(aux);
		ManejadorDeLista combinationsList = machine.combinations(money);
		System.out.println(combinationsList);
		System.out.println("Esas son todas las posibles combinaciones de cambio que te pueden dar");
		break;
	    case 2:
		continuar = false;
		break;
	    default:
		System.out.println("No es una opcion valida");
	    }
	}
    }
    

    /**
     *Metodo en el que se tendra interaccion con el usuario para pedir dinero
     * o salir del programa
     *@param args -- Argumentos que seran pasados
     */
    public static void main(String[] args){
	UsoMaquinaDeCambio interfaz = new UsoMaquinaDeCambio();
	interfaz.run();
    }
	


    
    /**
     * Pide un número al usuario.
     * @param mensaje - mensaje 
     * @return num - entero leido 
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
     * Método auxiliar para imprimir el menú para el usuario.
     */
    private void imprimeMenu() {
        System.out.println("Opciones:");
        System.out.println("1) Ingresar dinero");
        System.out.println("2) Salir");
    }
}
