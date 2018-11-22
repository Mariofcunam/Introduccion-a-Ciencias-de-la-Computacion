/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
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
    private final static int RADIO_SOL = 60;

    



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
    private Satelite pluton;
    private Satelite planetaX;
   
	
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
	    sol = new Astro(RADIO_SOL,0);
	    mercury = new Satelite(Satelite.DatosSatelite.MERCURY, sol,1);
	    venus = new Satelite(Satelite.DatosSatelite.VENUS, sol,2);
	    tierra = new Satelite(Satelite.DatosSatelite.TIERRA, sol,3);
	    luna = new Satelite(Satelite.DatosSatelite.LUNA, tierra,7572);
	    mars = new Satelite(Satelite.DatosSatelite.MARS, sol,4);
	    jupiter = new Satelite(Satelite.DatosSatelite.JUPITER, sol,5);
	    io = new Satelite(Satelite.DatosSatelite.IO, jupiter,5787);
	    europa = new Satelite(Satelite.DatosSatelite.EUROPA, jupiter,784);
	    ganymede = new Satelite(Satelite.DatosSatelite.GANYMEDE, jupiter,4554);
	    callisto = new Satelite(Satelite.DatosSatelite.CALLISTO, jupiter,5565);
	    saturn = new Satelite(Satelite.DatosSatelite.SATURN, sol,6);
	    uranus = new Satelite(Satelite.DatosSatelite.URANUS, sol,7);
	    neptune = new Satelite(Satelite.DatosSatelite.NEPTUNE, sol,8);
	    pluton = new Satelite(Satelite.DatosSatelite.PLUTON, sol,9);

	    for(int i=0; i <100;i++){
		new Satelite(Satelite.DatosSatelite.PLANETAX,sol,10);
	    }
	    for(int i=0; i<50;i++){
		new Satelite(Satelite.DatosSatelite.PLANETAY,sol,10);
	    }
	    for(int i=0; i<50;i++){
		new Satelite(Satelite.DatosSatelite.PLANETAZ,sol,10);
	    }
	    
	    
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
