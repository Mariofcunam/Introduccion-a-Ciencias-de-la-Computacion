package icc.recursion;

/**
 * Imprime en la consola los argumentos que le fueron pasados a este programa.
 * Todo programa de Java se encuentra de una construcción llamada <code>class</code>.
 */
public class Euclides {

    /**
     * Método principal, tú código comienza a ejecutarse aquí.
     * @param args Esta variable p
ermite acceder a cada argumento.
     * Los argumentos son cadenas de caracteres <code>String</code>.
     */
      
    public static void main(String[] args) {
	int i, j;
	if(args.length==2){
	    i = Integer.parseInt(args[0]);
	    j = Integer.parseInt(args[1]);
	    demo(i,j);
	} else {
	    System.out.println("El parametro es incorrecto");
	    demo(4,5);
	    demo(11,13);
	    demo(9,14);
	    demo(1,4);
	    demo(2000,3343);

	}
    }
    /**
     *Método estatico booleano que verifica es un numero es primo
     *@param n - Numero que sera verificado si es primo.
     *@return primo - True si es primo
     */
	public static void demo(int i, int j){
	    int r;
	    System.out.println(" " + i + " " + j);
	    r = euclides(i , j);
	    System.out.println("El mcd de " + i + " y " + j + "es " + r);
	    System.out.println("---------\n");
	   
	}
	public static int euclides(int a, int b){
	    int aux;
	    if(a <= 0) throw new ArithmeticException("El parametro" + a + "debe ser mayor a 0");
	    if(b <= 0) throw new ArithmeticException("El parametro" + b + "debe ser mayor a 0");
	    if(a < b){
		aux = a;
		a = b;
		b=aux;
	    }
	    return euc(a,b);
	}
	public static int euc(int a, int b){
	    if(b==0){
		return a;
	    }else{
		return euc(b,a%b);
	    }
	}

}
