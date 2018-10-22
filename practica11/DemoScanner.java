import java.util.Scanner;
/**
*Demo basico sobre el uso de la clase Scanner
*@author blackzafiro
*/
public class DemoScanner{

    /**
     *Recibe una línea de texto desde el teclado y
     *reimprime el mensaje que recibió, hasta que el usuario
     *se despida.
     *@param args
     */
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	while(s.hasNext()){
	    String linea = s.nextLine();
	    System.out.println("Eco:" + linea);
	    if(linea.equals("Adios"))break;
	}
	s.close();
    }
}
