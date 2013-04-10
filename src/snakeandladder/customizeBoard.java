
package snakeandladder;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SampritBiswas
 * Roll : 11CS10038
 */
public class customizeBoard implements Serializable{
    int setRows=8, setColumns=8;
    ArrayList<Snakes> snakes = new ArrayList<>();
    ArrayList<Ladders> ladders = new ArrayList<>();
    Players player=null;
    PlayingBoard play = null;
    Snakes tempSnake=null;
    Ladders tempLadder = null;
    
    class Snakes{
        int from, to;

        public void setSnake(int f, int t){
            from =f;
            to = t;
        }

    }
    class Ladders{
        int from, to;

       public void setLadders(int f, int t){
           from=f;
           to=t;
       }
    }    
    
    public void setDimension(int r, int c){
        setRows=r;
        setColumns=c;
        //customBoard(r, c);
    }

    public int getColumns() {
        return setColumns;
    }

    public int getRows() {
        return setRows;
    }

    
    public customizeBoard() {
        customBoard(4,4);
    }
    public final void customBoard(int n, int m){
        snakes.clear();
        ladders.clear();
        int noOfSnakes =n; int noOfLadders=m;       
        int prevI=0;
        
        for(int i=0;i<noOfSnakes;i++){
            Snakes newSnake = new Snakes();
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            
            prevI=i;
            if(randomFrom<=randomTo){
                i--;
                continue;
            }
            
            for(Snakes findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            
            newSnake.setSnake(randomFrom, randomTo);
            snakes.add(newSnake);
        }
        
        prevI = 0;
        for(int i=0;i<noOfLadders;i++){
            
            
            Ladders newLadder= new Ladders();                
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            if(randomFrom>=randomTo){
                i--;
                continue;
            }
            
            prevI=i;
            for(Ladders findlLadders : ladders){
                if(findlLadders.from==randomFrom || findlLadders.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            
            for(Snakes findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.from==randomTo){
                    i--;
                    break;
                }
                else if(findSnake.to==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            newLadder.setLadders(randomFrom, randomTo);
            ladders.add(newLadder);
            
        }
        
    }
    public int eatenBySnake(int random, int pos){
                
        pos = setColumns*setRows-pos;
        for(Snakes findSnake : snakes){
            if(findSnake.from==pos){
                random+=findSnake.to-pos;
                String message = "Snake at position : "+findSnake.from+" caught you. Go to location : "+findSnake.to;
                String snake = "Snake for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, snake, JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        return random;
    }
    public int climbLadder(int random, int pos){
        
        pos = setColumns*setRows-pos;
        for(Ladders findLadders : ladders){
            if(findLadders.from==pos){
                random+=findLadders.to-pos;
                String message = "Ladder found at : "+findLadders.from+". Go to location : "+findLadders.to;
                String ladder = "Ladder for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, ladder, JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        return random;
    }
    public void setClasses(Players p,PlayingBoard s){
        player=p;
        play = s;
    }
    public void createSnakesAndLadder(){
        Temp t =new Temp();
        int pos = setColumns*setColumns;
        for(Snakes createSnake : snakes){
            int from=setColumns*setRows-createSnake.from;
            
            int to=setColumns*setRows-createSnake.to;
            
            play.grid[from].setIcon(t.getSnake().getIcon());
            play.grid[from].setForeground(new Color(20, 200, 20));
            play.grid[from].setText("Go to : "+(pos-to));
        }
        for(Ladders createLadder : ladders){
            
            int from=setColumns*setRows-createLadder.from;
            
            int to=setColumns*setRows-createLadder.to;
            
            play.grid[from].setIcon(t.getLadder().getIcon());
            play.grid[from].setForeground(new Color(200, 20, 20));
            play.grid[from].setText("Go to : "+(pos-to));
            
        }
        
    }
}
