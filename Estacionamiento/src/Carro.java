public class Carro extends Vehiculo{
    public Carro(String placa, String marca, String modelo, String color, int año){
	lugaresNecesarios = 1;
	tamaño = TamañoVehiculo.tamañoCarro;
	this.placa = placa;
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.año = año;
    }
    public boolean siCabe(LugarEstacionamiento lugar){
	return lugar.getTamaño() == TamañoVehiculo.tamañoCarro;
    }
}
