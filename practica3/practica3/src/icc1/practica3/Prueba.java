package icc1.practica3;

public class Prueba{

    public static void main(String[] args){
	//Activdad 3.7
	System.out.println("Hola mundo.");
	System.out.println("Adios mundo.");
	System.out.print("Hola mundo.");
	System.out.print("Adios mundo.");
	System.out.print("Hola mundo.\n");
	System.out.print("Adios mundo.\n");
	System.out.print("Hola mundo.\nAdios mundo.\n");
	//Actividad 3.8
	int a = 5;
	int entero = 1234;
	double doble = 13.745;
	char caracter = 'a';
	boolean booleano = true;
	float xx = 12;
	byte b = 5;
	byte c = b;
	//Ejercicio 1
	float n1 = 3.5F;
	float n2 = 5.8F;
	float moduloN= n1%n2;
	System.out.println(moduloN);
	//Ejercicio 2
	float x = 1F;
	float y = 0.00000001F;
	float z = y - x;
	System.out.println(z);
	//Ejercicio 3
	System.out.println(1>>1);
	System.out.println(-1>>1);
	//Ejercicio 4
	boolean p = true;
	boolean q = false;
	boolean p1=true;
	boolean q1 = true;
	boolean p2 = false;
	boolean q2= false;
	boolean p3=false;
	boolean q3=true;
	System.out.println(!(p&&q));
	System.out.println(!p||!q);
        System.out.println(!(p1&&q1));
	System.out.println(!p1||!q1);
	System.out.println(!(p2&&q2));
	System.out.println(!p2||!q2);
	System.out.println(!(p3&&q3));
	System.out.println(!p3||!q3);

    }

}    
