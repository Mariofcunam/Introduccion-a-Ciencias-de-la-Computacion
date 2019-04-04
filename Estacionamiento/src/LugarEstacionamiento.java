public class LugarEstacionamiento{
    private Vehiculo vehiculo;
    private TamañoVehiculo tamañoLugar;
    private int carril;
    private int lugarNumero;
    private Nivel nivel1;

    public LugarEstacionamiento(Nivel nvl, int c, int ln,TamañoVehiculo t){
	nivel1 = nvl;
	carril = c;
	lugarNumero = ln;
	tamañoLugar = t;
    }
    public boolean estaDisponible(){
	return vehiculo == null;
    }
    public boolean cabeElVehiculo(Vehiculo vehiculo){
	return estaDisponible() && vehiculo.siCabe(this);
    }
    public boolean estacionar(Vehiculo v){
	if(!cabeElVehiculo(v))
	    return false;
	vehiculo = v;
	vehiculo.estacionarEnLugar(this);
	return true;
    }
    public int getCarril(){
	return carril;
    }
    public int getLugarNumero(){
	return lugarNumero;
    }
    public TamañoVehiculo getTamaño(){
	return tamañoLugar;
    }
    public void quitarVehiculo(){
	nivel1.lugarLiberado();
	vehiculo = null;
    }
}
