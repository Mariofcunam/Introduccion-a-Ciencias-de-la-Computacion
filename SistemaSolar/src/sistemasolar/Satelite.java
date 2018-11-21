/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

/**
 * Clase que describe astros que giran alrededor de otro.
 * @author blackzafiro
 */
public class Satelite extends Astro {
	
	// Escala para dibujar a los planetas
    private static final double ESCALA_RADIO = 10.0;
    private static final double ESCALA_ORBITA = 400.0;
    private static final double ESCALA_ORBITA_SATELITE = ESCALA_RADIO * 2;
    private static final double ESCALA_TIEMPO = 15.0;
	
    /**
     * Datos de cada planeta y satélite.
     * Deben ser ficticios, pues de otro modo la simulación no cabe en pantalla.
     */
    public enum DatosSatelite {
	    TIERRA(1.0, 0.46551, 0.46551, 1.1),
	    LUNA(0.273, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739),
	    MERCURY(0.382,0.1800,0.1800,0.3),
	    VENUS(0.948,0.33517,0.33517,0.74),
	    MARS(0.5319,0.60758,0.60758,1.107),
	    JUPITER(3.1126,0.790,0.790,2.0),
	    IO(0.275, ESCALA_ORBITA_SATELITE*0.00556, ESCALA_ORBITA_SATELITE* 0.0055513463, 0.0740),
	    EUROPA(0.275,ESCALA_ORBITA_SATELITE*0.0556, ESCALA_ORBITA_SATELITE * 0.0055513463, 0.0740),
	    GANYMEDE(0.275,ESCALA_ORBITA_SATELITE*0.0556, ESCALA_ORBITA_SATELITE * 0.0055513463, 0.0740),
	    CALLISTO(0.275,ESCALA_ORBITA_SATELITE*0.0556, ESCALA_ORBITA_SATELITE * 0.0055513463, 0.0740),
	    SATURN(2.9449,1.0,1.0,2.4),
	    URANUS(1.5073,1.200,1.200,3.0),
	    NEPTUNE(1.400,1.350,1.350,4.0);;
		
		
		
		private final double diametroEcuatorial;
		private final double semiejeMayor;
		private final double semiejeMenor;
		private final double periodoOrbital;
		
		
		DatosSatelite(double diametroEcuatorial,
			      double semiejeMayor, double semiejeMenor,
			      double periodoOrbital) {
		    this.diametroEcuatorial = diametroEcuatorial;
		    this.semiejeMayor = semiejeMayor;
		    this.semiejeMenor = semiejeMenor;
		    this.periodoOrbital = periodoOrbital;
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
    public Satelite(DatosSatelite datos, Astro foco,String link) {
	super(datos.diametroEcuatorial * ESCALA_RADIO);
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
