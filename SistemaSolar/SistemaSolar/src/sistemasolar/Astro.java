/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Sphere;
import javafx.scene.paint.*;
import javafx.scene.image.Image;

import java.io.FileInputStream;

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

    private boolean isPluton = false;
	
    /**
     * Constructor.
     * @param diametro Pixeles de diámetro.
     *@param numero -- numero del case 
     */
    public Astro(double diametro, int numero) {
	try{
		nodo = new StackPane();
		nodo.setStyle("-fx-background-color: Color.TRASPARENT;");
		nodo.setMaxSize(100, 100);
		figura = new Sphere(diametro);
		PhongMaterial phongMaterial = new PhongMaterial();
		FileInputStream input = new FileInputStream(getRelieve(numero));
		Image image = new Image(input);
		phongMaterial.setDiffuseMap(image);
		figura.setMaterial(phongMaterial);
		nodo.getChildren().add(figura);
	}
	catch(Exception e){e.printStackTrace();}
    }
    /**
     *Metodo que nos devuelve las imagenes para los astros
     *@param numero - numero del caso
     *@return String -- imagen
     */
    public String getRelieve(int numero){
	switch(numero){
	case 0:
	    return "sun.png";
	case 1:
	    return "mercurio.png";
	case 2:
	    return "venus.png";
	case 3:
	    return "tierra.png";
	case 4:
	    return "marte.png";
	case 5:
	    return "jupiter.png";
	case 6:
	    return "saturn.png";
	case 7:
	    return "urano.pgn";
	case 8:
	    return "neptuno.png";
	case 9:
	    setIsPluton(true);
	    return "pluton.png";
	case 10:
	    return "asteroid.png";
	default:
	    return "luna.png";
	}
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
    /**
     *Metodo para asignar si es el planeta es pluton
     *@param ispluton--planeta que se verificara si es plutoon
     */
    public void setIsPluton(boolean ispluton){
	this.isPluton = ispluton;
    }
    /**
     *Metodo para verificar si es pluton
     *@return 
     */
    public boolean getIsPluton(){
	return this.isPluton;
    }
	
}
