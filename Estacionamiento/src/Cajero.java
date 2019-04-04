/**
 *Clase para generar boletos para acceso al metro
 */
public class Boleto{
    private final double precio;

    /**
     *Constructor que inicializa el precio del boleto en la cantidad indicada
     *@param valor - costo del boleto
     */
    public Boleto(double valor){
	precio = valor;
    }
    /**
     *Metodo que devuelve el precio del boleto
     *@return precio
     */
    public double obtenerPrecio(){
	return precio;
    }
    /**
     *Metodo para expendir el boleto
     */
    public void expendir(){
	System.out.println(this);
    }
    /**
     *Metodo para obtener el boleto como una cadena de caracteres
     */
    public String toString(){
	return "+------------------------------+\n" +
	       "|    Boleto de estacionamiento |\n" +
	       "+------------------------------+\n" ;
    }
}
