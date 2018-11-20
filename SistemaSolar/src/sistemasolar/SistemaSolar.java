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
	
    private Astro sol;
    private Satelite tierra;
    private Satelite luna;
    private Satelite mercurio;
    private Satelite venus;
    private Satelite marte;
    private Satelite jupiter;
    private Satelite saturno;
    private Satelite urano;
    private Satelite neptuno;
	
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
		sol = new Astro(RADIO_SOL);
		mercurio = new Satelite(Satelite.DatosSatelite.MERCURIO, sol);
		venus = new Satelite(Satelite.DatosSatelite.VENUS, sol);
		tierra = new Satelite(Satelite.DatosSatelite.TIERRA, sol);
		luna = new Satelite(Satelite.DatosSatelite.LUNA, tierra);
		marte = new Satelite(Satelite.DatosSatelite.MARTE, sol);
		jupiter = new Satelite(Satelite.DatosSatelite.JUPITER, sol);
	        saturno = new Satelite(Satelite.DatosSatelite.SATURNO, sol);
		urano = new Satelite(Satelite.DatosSatelite.URANO, sol);
		neptuno = new Satelite(Satelite.DatosSatelite.NEPTUNO, sol);
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
