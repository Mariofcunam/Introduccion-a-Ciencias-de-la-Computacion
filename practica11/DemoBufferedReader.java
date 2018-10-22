import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *Demo básico sobre el uso de FileReader y BufferedReader-
 *@author blackzafiro
 */
public class DemoBufferedReader{
    /**
     *Lee un archivo de texto e imprime su contenido linea por 1inea
     *@param args
     */
    public static void main(String[] args){
	try{
	    BufferedReader in = new BufferedReader(new FileReader("texto.txt"));
	    String line;
	    while((line = in.readLine()) !=null){
		System.out.println(line);
	    }
	    in.close();
	} catch (FileNotFoundException e) {
	    System.err.println("No se encontro el archivo texto.txt Olvidaste crearlo");
	} catch (IOException ioe){
	    System.err.println("Error al leer el contenido de texto.txt");
	}
    }
}
