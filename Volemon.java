package volemon;

import javax.swing.JFrame;

/**
 * Classe qui permet de lancer le jeu
 * @author Volley3000
 * @version 3.0
 */

public class Volemon {
    public static void main(String[] args) {        
        JFrame MonEcranPrincipal = new MenuPrincipal();
        MonEcranPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MonEcranPrincipal.setVisible(true);
        
    }
}
