/**
*Automatas
*/
package automatas;

import java.util.Random;
/**
 *
 *@author blackzafiro
 */
public class Celula{
    int[][] array;
    int M;

    public Celula(int renglones, int columnas, int M){
	array = new int[renglones][columnas];
	this.M=M;
    }
    public void next(){
	Random rdm = new Random();
	for( int i = 0; i<array.length;i++){
	    for(int j = 0; j<array.length;j++){
		array[i][j] = rdm.nexInt(M+1);
	    }
	}
    }
}
