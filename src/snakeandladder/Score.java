
package snakeandladder;

import java.io.Serializable;

/**
 *
 * @author SampritBiswas
 * Roll : 11CS10038
 */
public class Score implements Comparable<Score>,Serializable {
    String name;
    int playerMoves;
    int dimension;

    @Override
    public int compareTo(Score o) {
        Score i = (Score)o;
        if(playerMoves>i.playerMoves){
            return 1;
        }
        else{
            return -1;
        }
    }
}
