package volemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    
    // attributs
    private JButton one_player;
    private JButton two_player;
    private JButton three_player;
    private JButton four_player;
    private JButton settings;
    
        
    // grille principale
        private GridLayout gridLayoutPrincipal;

            
    // grille de placement de la 1ere rangée de boutons 1, 2, 3, 4 joueurs    
        private GridLayout gridLayout1234;
        private JPanel jPanel1234;
        
    // grille de placement de la 2eme rangée de boutons : options    
        private GridLayout gridLayoutoptions;
        private JPanel jPaneloptions;

            
    
    public Menu (){
        gridLayoutPrincipal = new GridLayout(1,1);
        this.getContentPane().setLayout(gridLayoutPrincipal);
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Volemon" ); 
        
        
        this.one_player = new JButton("1 joueur");
        this.two_player = new JButton("2 joueurs");
        this.three_player = new JButton("3 joueurs");
        this.four_player = new JButton("4 joueurs");
        this.settings = new JButton("options");
        
        
        
        JPanel jPanel1234 = new JPanel();
        jPanel1234.setLayout(new GridLayout());
        jPanel1234.add(this.one_player);
        jPanel1234.add(this.two_player);
        jPanel1234.add(this.three_player);
        jPanel1234.add(this.four_player);
        
       
        
        JPanel jPaneloptions = new JPanel();
        jPaneloptions.setLayout(new GridLayout());
        jPaneloptions.add(this.settings);
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        // gestion des événements: "addActionListener"
        GestionBouton gb = new GestionBouton();
        one_player.addActionListener(gb);
        two_player.addActionListener(gb);
        three_player.addActionListener(gb);
        four_player.addActionListener(gb);
        settings.addActionListener(gb);
        
    }
    
    //classe interne d'écoute
       public class GestionBouton implements ActionListener { 
           public void actionPerformed(ActionEvent e) { 
               // test des valeur de e.getSource()
               
               if (e.getSource()==one_player){
               // lance le jeu avec 1 joueur (idée : pas de filet et permet
	       // seulement de faire des jongles avec la balle
               }
               else if (e.getSource()==two_player) {
               // lance le jeu avec 2 joueurs
               }
               else if (e.getSource()==three_player) {
               // lance le jeu avec 3 joueurs (2 vs 1 ?)
               }
               else if (e.getSource()==four_player) {
               // lance le jeu avec 4 joueurs
               }
               else if (e.getSource()==settings) {
               // ouvre un menu d'options : choix des touches, couleur de perso, fond d'ecran, volume de la musique (à réfléchir)
               }
               }
            }
       
       
    public static void main(String[] args) {
        Menu monMenu= new Menu();
    }
       
    
}

