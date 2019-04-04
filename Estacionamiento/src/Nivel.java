public class Nivel{
    private int piso;
    private LugarEstacionamiento[] lugar;
    private int lugaresDisponibles = 0;
    private static int LUGAR_POR_FILA = 10;

    public Nivel(int piso1, int numeroDeLugares){
	piso = piso1;
	lugaresDisponibles = numeroDeLugares;
	lugar = new LugarEstacionamiento[numeroDeLugares];

	int lugaresGrandes = numeroDeLugares / 4;
	int lugaresMotos = numeroDeLugares / 4;
	int lugaresCompactos = numeroDeLugares - lugaresGrandes - lugaresMotos;

	for(int i = 0; i < numeroDeLugares; i++){
	    TamañoVehiculo tam = TamañoVehiculo.motocicleta;
	    if( i < lugaresGrandes + lugaresCompactos){
		tam = TamañoVehiculo.tamañoCarro;
	    }
	    int fila = i / LUGAR_POR_FILA;
	    lugar[i] = new LugarEstacionamiento(this, fila , i, tam);
	}
    }
    public int lugaresDisponibles(){
	return lugaresDisponibles;
    }

    public boolean estacionarVehiculo(Vehiculo vehiculo){
	//Encuentra un lugar para estacionar el vehicula, regresa false si falla
	if(lugaresDisponibles() < vehiculo.getLugaresNecesitados())
	    return false;
	int numeroDeLugares = encuentraLugaresDisponibles(vehiculo);
	if(numeroDeLugares < 0)
	    return false;
	System.out.print(", Numero de Lugar " + numeroDeLugares);
	return estacionamientoIniciarEnLugar(numeroDeLugares, vehiculo);
    }

    private boolean estacionamientoIniciarEnLugar(int num, Vehiculo v){
	//Estaciona un vehiculo iniciando en el lugar con el numero del lugar
	//continua hasta vehiculo.lugaresNecesitados
	v.liberarLugares();
	boolean exito = true;
	for(int i = num; i < num + v.lugaresNecesarios; i++){
	    exito &= lugar[i].estacionar(v);
	}
	lugaresDisponibles -= v.lugaresNecesarios;
	return exito;
    }
    private int encuentraLugaresDisponibles(Vehiculo vehiculo){
	int lugaresNecesarios = vehiculo.getLugaresNecesitados();
	int ultimaFila = -1;
	int lugaresEncontrados = 0;

	for(int i = 0; i < lugar.length; i++){
	    LugarEstacionamiento lugar1 = lugar[i];
	    if(ultimaFila != lugar[i].getCarril()){
		lugaresEncontrados = 0;
		ultimaFila = lugar[i].getCarril();
	    }
	    if(lugar[i].cabeElVehiculo(vehiculo)){
		lugaresEncontrados++;
	    }
	    else{
		lugaresEncontrados = 0;
	    }
	    if(lugaresEncontrados == lugaresNecesarios){
		if(vehiculo.tamaño == TamañoVehiculo.tamañoCarro)
		    System.out.print("Este es un carro estacionado");
		else
		    System.out.print("Esta es una motocicleta estacionada");
		System.out.print("Numero de carril " + ultimaFila);
		return i - (lugaresNecesarios - 1);
	    }
	}
	return -1;
    }

    public void lugarLiberado(){
	lugaresDisponibles++;
	System.out.println("Lugares disponibles en el nivel : " + lugaresDisponibles);
    }
}
