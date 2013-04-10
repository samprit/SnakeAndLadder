
package snakeandladder;

/**
 *
 * @author SampritBiswas
 * Roll : 11CS10038
 */
public class SnakeAndLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        

        setLookAndFeel();
        MainMenu mainMenu = new MainMenu();
        customizeBoard cus = new customizeBoard();
        Players player = new Players();
        
        mainMenu.setClasses(cus,player);
        cus.setClasses(player,null);
        mainMenu.setVisibility(true);
        mainMenu.printHighScores();
    }
    public static void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
