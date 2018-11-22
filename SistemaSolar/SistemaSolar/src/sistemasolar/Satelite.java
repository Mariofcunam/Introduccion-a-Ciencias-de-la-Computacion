
/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

import java.util.Random;
/**
 * Clase que describe astros que giran alrededor de otro.
 * @author blackzafiro
 */
public class Satelite extends Astro {

	// Escala para dibujar a los planetas
	private static final double ESCALA_RADIO = 10.0;
	private static final double ESCALA_ORBITA = 200.0;
	private static final double ESCALA_ORBITA_SATELITE = ESCALA_RADIO * 2;
	private static final double ESCALA_TIEMPO = 15.0;

	/**
	 * Datos de cada planeta y satélite.
	 * Deben ser ficticios, pues de otro modo la simulación no cabe en pantalla.
	 */
	public enum DatosSatelite {
		MERCURY(0.5,0.3, 0.3,0.1),
		VENUS(0.7,0.47777, 0.47775,0.3),
		TIERRA(0.9,0.7,0.7,0.3999997),
		MARS(0.5, 0.89999, 0.8998, 0.6555556669),
		JUPITER(3.0,1.222,1.221,1.2),
		SATURN(2.5,1.57777,1.574332,2.0),
		URANUS(2.5,1.999,1.998,3.0),
		NEPTUNE(2.000011113,2.2555,2.25,3.5),
		PLUTON(1,2,2,1),
		PLANETAX('x'),
		PLANETAY('y'),
		PLANETAZ('z'),
		IO(0.273,ESCALA_ORBITA_SATELITE*0.00715, ESCALA_ORBITA_SATELITE*0.0071444,0.09),
		EUROPA(0.265,ESCALA_ORBITA_SATELITE*0.010099,ESCALA_ORBITA_SATELITE*0.01008,0.1112),
		GANYMEDE(0.5,ESCALA_ORBITA_SATELITE*0.01193,ESCALA_ORBITA_SATELITE*0.01183,0.3221),
		CALLISTO(0.455,ESCALA_ORBITA_SATELITE*0.0131,ESCALA_ORBITA_SATELITE*0.0130,0.4221),
		LUNA(0.273, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739);;

		private  double diametroEcuatorial;
		private  double semiejeMayor;
		private  double semiejeMenor;
		private  double periodoOrbital;


		DatosSatelite(double diametroEcuatorial,
			      double semiejeMayor, double semiejeMenor,
			      double periodoOrbital) {
			this.diametroEcuatorial = diametroEcuatorial;
			this.semiejeMayor = semiejeMayor;
			this.semiejeMenor = semiejeMenor;
			this.periodoOrbital = periodoOrbital;
		}
		/**
		 *constructor para la genereacion de asteroides
		 *@param x -- char que se pasado como al rotacion
		 **/
		DatosSatelite(char  x) {
			double maximum = 1.0;
			double minimum = 0.8;
			Random rdm = new Random();
			double n = (rdm.nextInt((int)((0.4-0.14)*10+1))+0.14*10) / 10.0;
    	double n1 = (rdm.nextInt((int)((maximum-minimum)*10+1))+minimum*10) / 10.0;
			double n2 = (rdm.nextInt((int)((1.2-1)*10+1))+1*10) / 10.0;
			this.diametroEcuatorial = n;

			if(x=='x') { 	 //Cambia la rotacion de los asteroides
					this.semiejeMayor = -1.022;
					this.semiejeMenor = -1.021;
				}else if (x=='y') {
					this.semiejeMayor = 1.022;
					this.semiejeMenor = 1.021;
				} else if (x =='z'){
					this.semiejeMayor = 1.02223;
					this.semiejeMenor = -1.221;
				}

			this.periodoOrbital = n1;
		}

	}

	/// Inician atributos

	private final DatosSatelite datos;
	private OrbitaTransition orbita;
	private Astro foco;


	/// Inician métodos

	/**
	 * Astro alrededor del cual gira este satélite.
	 * @return astro alrededor del cual girar este satélite.
	 */
	public Astro getFoco() {
		return foco;
	}

	/**
	 * Crea la órbita de este planea y lo pone a girar alrededor del foco.
	 */
	private void creaOrbita(Astro foco) {
		foco.getNodo().getChildren().add(this.nodo);
		this.foco = foco;

		orbita = new OrbitaTransition(this,
									  datos.semiejeMayor * ESCALA_ORBITA,
									  datos.semiejeMenor * ESCALA_ORBITA,
									  datos.periodoOrbital * ESCALA_TIEMPO
		);
		orbita.play();
	}

	/**
	 * Constructor.
	 * @param datos información del astro y su órbita.
	 * @param foco astro alrededor del cual gira este satélite.
	 */
	public Satelite(DatosSatelite datos, Astro foco,int numero) {
		super(datos.diametroEcuatorial * ESCALA_RADIO,numero);
		this.datos = datos;
		creaOrbita(foco);
	}



	/**
	 * Devuelve el nombre de este satélite.
	 * @return nombre
	 */
	public String getNombre() {
		return this.datos.toString();
	}
}
