import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *Demo basica sobre el uso PrintSteam
 *@author blackzafiro
 */
public class DemoPrintStream{
    /**
     *Escribe el texto indicado en un archivo
     *@param args
     */
    public static void main(String[] args){
	String nombreArchivo = "Salida.txt";
	try(PrintStream fout = new PrintStream(nombreArchivo)){
	    fout.println("Inicio");
	    fout.format("Linea %d\n", 1);
	    fout.println("Fin");
	} catch(FileNotFoundException fnfe){
	    System.err.println("No se encontro el archivo" + nombreArchivo + "y no puede ser creado");
	} catch(SecurityException se){
	    System.err.println("No se tiene permiso de escribir en el archivo");
	}
    }
}
