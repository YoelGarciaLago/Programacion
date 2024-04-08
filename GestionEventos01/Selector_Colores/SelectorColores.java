package selectorcolores;
import javax.swing.SwingUtilities;
/**
 *
 * @author admin
 */
public class SelectorColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                metodo m = new metodo();
                m.setVisible(true);
            }
        });
    }
   
}