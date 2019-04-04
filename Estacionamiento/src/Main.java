public class Main{

    public static void main(String[] args){

	Estacionamiento e1 = new Estacionamiento(2);

	Carro c1 = new Carro("MAH-1291", "Chevrolet", "Chevy", "Rojo", 2007);
	Motocicleta m1 = new Motocicleta("METH-1982", "Harley-Davidson", "Chopper", "Negro", 2015);
	Carro c2 = new Carro("TUFE-8912", "Nissan", "Tsuru", "Blanco", 2012);
	Motocicleta m2 = new Motocicleta("HAGD-128N", "BMW", "C400GT", "Blanco", 2017);
	Carro c3 = new Carro("TUAD-2123", "Peugeot", "Rifter", "Azul", 2018);

	e1.estacionarVehiculo(c1);
	e1.estacionarVehiculo(m1);
	e1.estacionarVehiculo(c3);
	e1.marcaEstacionada("Chevrolet");
	e1.marcaEstacionada("Harley-Davidson");
	e1.marcaEstacionada("Nissan");
	e1.marcaEstacionada("Peugeot");
	e1.liberar(m1,0);
	e1.marcaEstacionada("Chevrolet");
	e1.estacionarVehiculo(m2);
	e1.estacionarVehiculo(c3);
    }
}
