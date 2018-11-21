/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import static javafx.application.Application.launch;

/**
 * Simulación del sistema solar utilizando JavaFX
 * https://docs.oracle.com/javase/8/javafx/api/index.html
 * @author blackzafiro
 */
public class SistemaSolar extends Application {
	
    private final static int ANCHO_VENTANA_INICIAL = 1200;
    private final static int ALTO_VENTANA_INICIAL = 800;
    private final static int RADIO_SOL = 30;

    private String linkSun="https://images.pexels.com/photos/87611/sun-fireball-solar-flare-sunlight-87611.jpeg?auto=compress&cs=tinysrgb&h=350";
    private String linkEarth="https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/North_America_from_low_orbiting_satellite_Suomi_NPP.jpg/220px-North_America_from_low_orbiting_satellite_Suomi_NPP.jpg";
    private String linkMoon="https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Full_Moon_Luc_Viatour.jpg/280px-Full_Moon_Luc_Viatour.jpg";
    private String linkMercury="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Mercury_Globe-MESSENGER_mosaic_centered_at_0degN-0degE.jpg/220px-Mercury_Globe-MESSENGER_mosaic_centered_at_0degN-0degE.jpg";
    private String linkVenus="https://s3.eestatic.com/2016/10/24/ciencia/investigacion/Investigacion_165495235_19838641_1706x960.jpg";
    private String linkMars="https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg";
    private String linkJupiter="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Jupiter_by_Cassini-Huygens.jpg/280px-Jupiter_by_Cassini-Huygens.jpg";
    private String linkIo="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Io_highest_resolution_true_color.jpg/800px-Io_highest_resolution_true_color.jpg";
    private String linkEuropa="https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Europa-moon.jpg/800px-Europa-moon.jpg";
    private String linkGanymede="https://upload.wikimedia.org/wikipedia/commons/7/7f/Ganymede-moon.jpg";
    private String linkCallisto="https://upload.wikimedia.org/wikipedia/commons/e/e9/Callisto.jpg";
    private String linkSaturn="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Jupiter_by_Cassini-Huygens.jpg/280px-Jupiter_by_Cassini-Huygens.jpg";
    private String linkUranus="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Uranus2.jpg/1200px-Uranus2.jpg";
    private String linkNeptune="https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Neptune_Full.jpg/1200px-Neptune_Full.jpg";

    private Astro sol;
    private Satelite tierra;
    private Satelite luna;
    private Satelite mercury;
    private Satelite venus;
    private Satelite mars;
    private Satelite jupiter;
    private Satelite io;
    private Satelite europa;
    private Satelite ganymede;
    private Satelite callisto;
    private Satelite saturn;
    private Satelite uranus;
    private Satelite neptune;
	
	public static int getSolCentroX() {
		return ANCHO_VENTANA_INICIAL/2;
	}
	
	public static int getSolCentroY() {
		return ALTO_VENTANA_INICIAL/2;
	}
	
	/**
	 * Crea al sol, los planteas y sus satélites, asignando quien gira
	 * alrededor de quien.
	 */
	private void creaAstros() {
	    sol = new Astro(RADIO_SOL,linkSun);
	    mercury = new Satelite(Satelite.DatosSatelite.MERCURY, sol,linkMercury);
	    venus = new Satelite(Satelite.DatosSatelite.VENUS, sol,linkVenus);
	    tierra = new Satelite(Satelite.DatosSatelite.TIERRA, sol,linkEarth);
	    luna = new Satelite(Satelite.DatosSatelite.LUNA, tierra,linkMoon);
	    mars = new Satelite(Satelite.DatosSatelite.MARS, sol,linkMars);
	    jupiter = new Satelite(Satelite.DatosSatelite.JUPITER, sol,linkJupiter);
	    io = new Satelite(Satelite.DatosSatelite.IO, jupiter, linkIo);
	    europa = new Satelite(Satelite.DatosSatelite.EUROPA, jupiter, linkEuropa);
	    ganymede = new Satelite(Satelite.DatosSatelite.GANYMEDE, jupiter, linkGanymede);
	    callisto = new Satelite(Satelite.DatosSatelite.CALLISTO, jupiter, linkCallisto);
	    saturn = new Satelite(Satelite.DatosSatelite.SATURN, sol,linkSaturn);
	    uranus = new Satelite(Satelite.DatosSatelite.URANUS, sol,linkUranus);
	    neptune = new Satelite(Satelite.DatosSatelite.NEPTUNE, sol,linkNeptune);
	}
	
	/**
	 * Crea la escena y agrega los primeros nodos, sobre los cuales
	 * se han agregado a los demás astros.
	 * @return la escena con el sol, planetas y satélites.
	 */
	private Scene montaNodos() {
		AnchorPane root = new AnchorPane();
		root.setLayoutX(getSolCentroX() - RADIO_SOL);
		root.setLayoutY(getSolCentroY() - RADIO_SOL);
		
		root.getChildren().add(sol.getNodo());
		
		Scene scene = new Scene(root, ANCHO_VENTANA_INICIAL, ALTO_VENTANA_INICIAL, Color.BLACK);
		return scene;
	}
	
	/**
	 * Acomoda los elementos en la intefaz e inicia la animación.
	 * @param primaryStage
	 * @throws Exception 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		creaAstros();
		
		Scene scene = montaNodos();
		primaryStage.setTitle("Sistema solar");
		primaryStage.setScene(scene);
		primaryStage.show();

		
       
	}
	
	/**
	 * Inicia la simulación.
	 * @param args 
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
