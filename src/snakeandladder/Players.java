
package snakeandladder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SampritBiswas
 * Roll number : 11CS10038
 */
public class Players {
    
    private String[] playerNames = new String[3];
    public int[] playerMoves = new int[3];
    private int[] playerLocations = new int[3];
    private int noOfPlayers=2;
    public int turn=0, won=0;
    customizeBoard cus=null;
    MainMenu menu;
    
    public Score newPlayersScore;
    
    public Score getNewScore(){
        return (new Score());
    }
    
    public Players() {
        for(int i=0;i<3;i++){
            playerNames[i] = new String();
            playerNames[i]="Player "+i;
            playerMoves[i]=0;
            playerLocations[i]=1;
        }
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }
    
    public void setPlayer1(String p1){
        playerNames[0]=new String(p1);
    }
    public void setPlayer2(String p2){
        playerNames[1]=new String(p2);
    }
    public void setPlayer3(String p3){
        playerNames[2]=new String(p3);
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
    public String getPlayerName(int i){
        return playerNames[i];
    }
    public int getLocation(int i){
        return ((cus.getColumns()*cus.getRows())-playerLocations[i]);
    }
    public void setLocation(int i, int n){
        if(checkValidity(i, n)==1){
            playerLocations[i]+=n;
        }
    }
    public int checkValidity(int i, int n){
        
        if(won==1){
            return 1;
        }
        
        playerLocations[i]+=n;
        if((playerLocations[i])>(cus.getColumns()*cus.getRows())){
            playerLocations[i]-=n;
            int tot=cus.getColumns()*cus.getRows()-playerLocations[i];
            JOptionPane.showMessageDialog(new JFrame(),"You need "+tot+" to Win", "Retry", JOptionPane.INFORMATION_MESSAGE);
            return 0;
        }
        if((playerLocations[i])==(cus.getColumns()*cus.getRows())){
            playerLocations[i]-=n;
            JOptionPane.showMessageDialog(new JFrame(),"Congratulations "+playerNames[turn]+"!!!. You have won in "+playerMoves[turn]+" turns.","Victory", JOptionPane.INFORMATION_MESSAGE);
            won=1;
            saveHighScore();
            congratulate();
            return 1;
        }
        playerLocations[i]-=n;
        return 1;
    }
    public void setMoves(int i){
        playerMoves[i]++;
    }
    public void setTurn(){
        turn++;
        turn = turn %noOfPlayers;
    }
    public void setClasses(customizeBoard c,MainMenu m){
        cus = c;
        menu=m;
    }
    public void saveHighScore(){
        Score newScore =new Score();
        ArrayList<Score> oldScores = new ArrayList<>();        
        newScore.name=playerNames[turn];
        newScore.playerMoves=playerMoves[turn];
        newScore.dimension=cus.setColumns;
        
        try {
            FileInputStream fileStream = new FileInputStream("HighScoreList.ser");
            try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                Object one = os.readObject();
                oldScores = (ArrayList<Score>)one;
            }
        } catch (IOException ex) {
            try {
                FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(oldScores);            
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }
        }catch(ClassNotFoundException ec){
            System.out.println("\nClass Not Found!!!");
            ec.printStackTrace();
        }
        oldScores.add(newScore);
        Collections.sort(oldScores);        
        
        int maxMin=0, i=1;
        for(Score score : oldScores){
            if(score.playerMoves>maxMin){
                maxMin=score.playerMoves;
            }
            i++;
            if(i>=10){
                break;
            }
        }
        menu.highScoreValue=maxMin;
        if(i<10){
            menu.highScoreValue=1000;
        }
        
        try {
            FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(oldScores);            
            os.close();
        } catch (IOException ef) {
            System.out.println("\nFile Not Found!!!");
            ef.printStackTrace();
        }      
    }
    public void congratulate(){
        if(menu.highScoreValue>playerMoves[turn]){
            JOptionPane.showMessageDialog(new JFrame(),"You are our new High Scorer", "New High Score", JOptionPane.INFORMATION_MESSAGE);
            menu.setScoreCardFrameVisible(true);
            menu.printHighScores();            
            
        }
    }
}
