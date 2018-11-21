/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;


import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Sphere;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.Scene.*;
import javafx.geometry.Insets;

/**
 * Clase que representa a todos los astros alrededor de los cuales pueden girar
 * otros astros.
 * @author blackzafiro
 */
public class Astro {
	
    /**
     * Panel sobre el cual se dibuja este astro y sus satélites.
     */
    protected Pane nodo;
	
    /**
     * Figura que representa a este astro.
     */
    protected Sphere figura;
	
    /**
     * Constructor.
     * @param diametro Pixeles de diámetro.
     */
    public Astro(double diametro,String link) {
		nodo = new StackPane();
		nodo.setBackground(new Background( new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
		nodo.setStyle("-fx-background-color: Color.TRASPARENT;");
		nodo.setMaxSize(100, 100);
		figura = new Sphere(diametro);
		nodo.getChildren().add(figura);

		String link1;
		Material material = new PhongMaterial();
		Image dmap = new Image(link1);

		mat.setDiffuseMap(dmap);
		mat.setSpecularColor(Color.YELLOW);

		figura.setMaterial(materia);
    }
	
    /**
     * Devuelve al panel sobre el cual se dibujará este astro y sus satélites.
     * @return nodo
     */
    public Pane getNodo() {
		return nodo;
    }
	
    /**
     * Devuelve el nodo figura que dibuja a este astro.
     * Sus coordenadas son relativas al panel que la contiene.
     * @return 
     */
    public Node getFigura() {
		return figura;
    }
	
}
