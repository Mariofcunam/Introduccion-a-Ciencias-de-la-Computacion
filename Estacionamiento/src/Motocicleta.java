public class Motocicleta extends Vehiculo{
    public Motocicleta(String placa, String marca, String modelo, String color, int año){
	lugaresNecesarios = 1;
	tamaño = TamañoVehiculo.motocicleta;
	this.placa = placa;
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.año = año;
    }
    public boolean siCabe(LugarEstacionamiento lugar){
	//checa si el lugar es para un vehicula compacto, motocicleta o grande

	return lugar.getTamaño() == TamañoVehiculo.tamañoCarro || lugar.getTamaño() == TamañoVehiculo.motocicleta;
    }
}
