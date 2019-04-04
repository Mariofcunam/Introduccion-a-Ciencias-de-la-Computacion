import java.util.ArrayList;

public abstract class Vehiculo{
    protected ArrayList<LugarEstacionamiento> lugaresEstacionamiento = new ArrayList<LugarEstacionamiento>();
    protected String placa;
    protected int lugaresNecesarios;
    protected TamañoVehiculo tamaño;
    protected String marca;
    protected String modelo;
    protected String color;
    protected int año;

    public int getLugaresNecesitados(){
	return lugaresNecesarios;
    }
    public TamañoVehiculo getTamaño(){
	return tamaño;
    }
    public void estacionarEnLugar(LugarEstacionamiento le){
	lugaresEstacionamiento.add(le);
    }

    public void liberarLugares(){
	//Remueve carro del lugar, y notifica que el lugar esta lubre
	for(int i = 0;  i<lugaresEstacionamiento.size(); i++){
	    lugaresEstacionamiento.get(i).quitarVehiculo();
	}
	lugaresEstacionamiento.clear();
    }
    public abstract boolean siCabe(LugarEstacionamiento lugar);
}
