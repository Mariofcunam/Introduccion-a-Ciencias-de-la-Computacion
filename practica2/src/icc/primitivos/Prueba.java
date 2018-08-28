/**
 *Programa que imprime el funcionamiento del programa
 *@author Navarrete Baltazar Mario
 */
package icc.primitivos;
public class Prueba{
    public static void main(String  args[]){
	ImpresoraBinario ib = new ImpresoraBinario();
	int max = Integer.MAX_VALUE;
	int min = Integer.MIN_VALUE;
	double nan = Double.NaN;
	double minf = Double.NEGATIVE_INFINITY;
	double pinf = Double.POSITIVE_INFINITY;
	double cero = 0.0;
	double mcero = -0.0;
	short permisos = 0754;
	int num = 345;
	int resultadoi1 = num << 3;
	int resultadoi2 = num << 1;
	int resultadod1 = num >> 3;
	int resultadod2 = num >> 1;
	short permisosescribir = 0776;
	int numero = 456;
	long numerol = 456;
	float numerof = 456;
	double numerod = 456;
	int numeronegativo = -456;
	long numerolnegativo= -456;
	float numerofnegativo = -456;
	double numerodnegativo = -456;
	double d = -456.601;
	int n = (int) d;
	float f = (float) d;
	long l = (long) d;
	int mascara = 2121981111;
	int mascararesultado = mascara << 3;
	int num5 = 1408;
	int mascara5= num5 << 3;
	
	System.out.println(max);
	ib.imprime(max);

	System.out.println(min);
	ib.imprime(min);

	System.out.println(nan);
	ib.imprime(nan);

	System.out.println(minf);
	ib.imprime(minf);

	System.out.println(pinf);
	ib.imprime(pinf);

	System.out.println(cero);
	ib.imprime(cero);

	System.out.println(mcero);
	ib.imprime(mcero);

	System.out.println(permisos);
	ib.imprime(permisos);

	System.out.println(num);
	ib.imprime(num);

	System.out.println(resultadoi1);
	ib.imprime(resultadoi1);

	System.out.println(resultadoi2);
	ib.imprime(resultadoi2);

	System.out.println(resultadod1);
	ib.imprime(resultadod1);

	System.out.println(resultadod2);
	ib.imprime(resultadod2);

	System.out.println(permisosescribir);
	ib.imprime(permisosescribir);

	System.out.println(numero);
	ib.imprime(numero);

	System.out.println(numerol);
	ib.imprime(numerol);

	System.out.println(numerof);
	ib.imprime(numerof);

	System.out.println(numerod);
	ib.imprime(numerod);

	System.out.println(numeronegativo);
	ib.imprime(numeronegativo);

	System.out.println(numerolnegativo);
	ib.imprime(numerolnegativo);

	System.out.println(numerofnegativo);
	ib.imprime(numerofnegativo);

	System.out.println(numerodnegativo);
	ib.imprime(numerodnegativo);
	
	System.out.println(n);
	ib.imprime(n);

	System.out.println(d);
	ib.imprime(d);

	System.out.println(f);
	ib.imprime(f);

	System.out.println(l);
	ib.imprime(l);

	System.out.println(mascararesultado);
	ib.imprime(mascararesultado);

	System.out.println(num5);
	ib.imprime(num5);

	System.out.println(mascara5);
	ib.imprime(mascara5);
    }
    
}

