/**
*Automatas
*/
package automatas;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 *@author blackzafiro
 */
public class Automata extends AnimationTimer{
    private Group root;
    private Text text;
    private Rectangle [][] array;

    public Automata(Group root, int ren, int col, int M){
	this.root = root;
	text = new Text(Color.WHITE);
	text.setY(200);
	root.getChildren().add(text);
	Line line = new Line(0, 210, 800, 210);
	line.setStroke(Color.WHITE);
	root.getChildren().add(line);

	array = new Rectangle[ren][col];
	for(int i = 0; i<array.length; i++){
	    for(int j = 0; j<array.length;j++){
		array[i][j] = new Rectangle();
		array[i][j].setX(10 + 10 * i);
		array[i][j].setY(10 + 10 * j);
		array[i][j].setWidth(9);
		array[i][j].setHeight(9);
		array[i][j].setArcWidth(0);
		Color c = Color.web("rgb(0,0,225)");
		array[i][j].setFill(c);
		root.getChildren().add(array[i][j]);
	    }
	}
    }
    @Override
    public void handle(long now){
	text.setText("tiempo" + now);
    }
}
				       
