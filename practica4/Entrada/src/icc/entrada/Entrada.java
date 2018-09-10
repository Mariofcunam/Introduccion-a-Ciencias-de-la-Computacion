package icc.entrada;

/**
 * Imprime en la consola los argumentos que le fueron pasados a este programa.
 * Todo programa de Java se encuentra de una construcción llamada <code>class</code>.
 */
public class Entrada {

    /**
     * Método principal, tú código comienza a ejecutarse aquí.
     * @param args Esta variable permite acceder a cada argumento.
     * Los argumentos son cadenas de caracteres <code>String</code>.
     */
      
    public static void main(String[] args) {
	int r;
	boolean b;
	if(args.length == 1) {
	    r = Integer.parseInt(args[0]);
	    System.out.println("" + r);
	    b = esPrimo(r);
	    if(b){
		System.out.println("El numero" + r + "es primo");
	    }else{
		System.out.println("El numero" + r + "no es primo");
	
	    }
	}
    }
    /**
     *Método estatico booleano que verifica es un numero es primo
     *@param n - Numero que sera verificado si es primo.
     *@return primo - True si es primo
     */
    public static boolean esPrimo(int n){
	int contador = 2;
	boolean primo=true;
	while ((primo) && (contador!=n)){
	    if(n % contador == 0)
		primo = false;
	    contador++;
	}
	return primo;
    }
  

}
