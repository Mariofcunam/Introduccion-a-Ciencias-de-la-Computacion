/**
*Clase para simular el funcionamiento de una caja
*/
public class Caja{
    private double totalAcomulado;
    private double cantidadInicial;

    /**
     *Constructor que inicializa una caja poniendo cero en cantidad inicial
     *y dando un total acomulado inicial
     *@param inicial - cantidad de dinero con que abrira la caja
     */
    public Caja(double inicla){
	inicial = Math.abs(inicial);
	totalAcomulado=inicial;
	cantidadInicial=inicial;
    }

    /**
     *Metodo que guarda en la caja el dinero recbido
     *@param importe - cantidad de dinero que se guardara en la caja
     */
    public void guardarDinero(double importe){
	totalAcomulado += importe;
    }
    /**
     *Metodo para extraer dinero de la caja
     *@param importe
     */
    public void retirarDinero(double importe){
	totalAcomulado -= importe;
    }
    /**
     *Metodo para obtener la cantidad de dinero acomulado en la caja
     *@return double - cantidad acomulada
     */
    public double obtenerTotalAcomulado(){
	return totaAcomulado - cantidadInicial;
    }
    
