import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estacionamiento{
    private Nivel[] niveles;
    private final int NUM_NIVELES = 2;
    private int numeroDeLugares;

    Map<String, ArrayList<String>> marcaVehiculo;
    public Estacionamiento(int numeroDeLugares){
	this.numeroDeLugares = numeroDeLugares;
	this.marcaVehiculo = new HashMap<String, ArrayList<String>>();
	niveles = new Nivel[NUM_NIVELES];
	for(int i = 0; i < NUM_NIVELES; i++){
	    niveles[i] = new Nivel(i, numeroDeLugares);
	    System.out.println("Nivel" + i + "creado con " + numeroDeLugares + " " + "lugares" );
	}
    }
    public boolean estacionarVehiculo(Vehiculo vehiculo){
	System.out.println("----------------------------");

	for(int i = 0; i < niveles.length; i++){
	    if(niveles[i].estacionarVehiculo(vehiculo)){
		System.out.println("Nivel" + i + " con el numero del vehiculo " + vehiculo.placa + " de " + vehiculo.marca);
		if(this.marcaVehiculo.containsKey(vehiculo.marca)){
		    ArrayList<String> registroSinLista = this.marcaVehiculo.get(vehiculo.marca);
		    this.marcaVehiculo.remove(vehiculo.marca);
		    registroSinLista.add(vehiculo.placa);
		    this.marcaVehiculo.put(vehiculo.marca, registroSinLista);
		}
		return true;
	    }
	}
	System.out.println("Estacionamiento lleno");
	return false;
    }
    public boolean liberar(Vehiculo vehiculo, int nvl){
	System.out.println("----------------------------");
	niveles[nvl].lugarLiberado();
	System.out.println("Lugar liberado de nivel " + 0 + "y salio " + vehiculo.placa + " de " + vehiculo.marca);
	ArrayList<String> listaVehiculo = this.marcaVehiculo.get(vehiculo.marca);
	if(listaVehiculo.contains(vehiculo.placa)){
	    listaVehiculo.remove(vehiculo.placa);
	}
	return true;
    }
    public void marcaEstacionada(String marca){
	System.out.println("-------------------------");
	ArrayList<String>listaVehiculo = this.marcaVehiculo.get(marca);
	System.out.print("Los vehiculos de " + marca + " : ");
	for(String el : listaVehiculo){
	    System.out.println(el + "\t");
	}
	System.out.println();
    }
}
