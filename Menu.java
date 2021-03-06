

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame {
    
    // attributs
  
    private JButton two_player;
    private JButton three_player;
    private JButton four_player;
    private JButton settings;
    
        
    // grille principale
        private GridLayout gridLayoutPrincipal;

            
    // grille de placement de la 1ere rang�e de boutons 1, 2, 3, 4 joueurs    
        private GridLayout gridLayout1234;
        private JPanel jPanel1234;
        
    // grille de placement de la 2eme rang�e de boutons : options    
        private GridLayout gridLayoutoptions;
        private JPanel jPaneloptions;

            
    
    public Menu (){
        gridLayoutPrincipal = new GridLayout(2,1);
        this.getContentPane().setLayout(gridLayoutPrincipal);
        this.setLocationRelativeTo(null);
        this.setSize( new Dimension(1000, 600) );
        this.setTitle( "Volley3000" ); 
        
        
    
        this.two_player = new JButton("2 joueurs");
        this.three_player = new JButton("3 joueurs");
        this.four_player = new JButton("4 joueurs");
        this.settings = new JButton("Options");
        
        
        
        JPanel jPanel1234 = new JPanel();
        jPanel1234.setLayout(new GridLayout());
        jPanel1234.add(this.two_player);
        jPanel1234.add(this.three_player);
        jPanel1234.add(this.four_player);
        this.add(jPanel1234);
       
        
        JPanel jPaneloptions = new JPanel();
        jPaneloptions.setLayout(new GridLayout());
        jPaneloptions.add(this.settings);
        this.add(jPaneloptions);
        
     // gestion des �v�nements: "addActionListener"
        GestionBouton gb = new GestionBouton();
        two_player.addActionListener(gb);
        three_player.addActionListener(gb);
        four_player.addActionListener(gb);
        settings.addActionListener(gb);
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    //classe interne d'�coute
       public class GestionBouton implements ActionListener { 
           public void actionPerformed(ActionEvent e) { 
               // test des valeur de e.getSource()
               
              
               if (e.getSource()==two_player) {
               // lance le jeu avec 2 joueurs
               JFrame jeu1=new Jeu();
               }
               else if (e.getSource()==three_player) {
               // lance le jeu avec 3 joueurs (2 vs 1 ?)
               }
               else if (e.getSource()==four_player) {
               // lance le jeu avec 4 joueurs
               }
               else if (e.getSource()==settings) {
               // ouvre un menu d'options : choix des touches, couleur de perso, fond d'ecran, volume de la musique (� r�fl�chir)
               }
               }
            }
       
       
    public static void main(String[] args) {
        Menu monMenu= new Menu();
    }
       
    
}

