import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame implements ActionListener {
	
	
	
   //fenetre principale
    private JButton jButtonDeuxJoueurs= new JButton("2 Joueurs");
    private JButton jButtonQuatreJoueurs= new JButton("4 Joueurs");
    private JButton jButtonOptions =new JButton("Options"); 
    private JButton jButtonQuitter=new JButton("Quitter");
    private ImageFond JPanel_fond ;
    GridBagConstraints c = new GridBagConstraints();
    
    
    //private ImageIcon wallpaper = new ImageIcon("C:/tennis.jpg");
    
    
    public MenuPrincipal() {
    	super();
    	this.setTitle("Menu Principal");
    	this.setLocationRelativeTo(null);
    	JPanel_fond = new ImageFond("C:/tennis.jpg");
    	JPanel_fond.setLayout(new GridBagLayout());
    	GridBagConstraints c = new GridBagConstraints();
        jButtonDeuxJoueurs.setForeground(Color.yellow);
    	jButtonDeuxJoueurs.setFont(new java.awt.Font("Impact", 1, 24));
    	jButtonDeuxJoueurs.setBackground(Color.black);

    	jButtonQuatreJoueurs.setForeground(Color.yellow);
    	jButtonQuatreJoueurs.setFont(new java.awt.Font("Impact", 1, 24));
    	jButtonQuatreJoueurs.setBackground(Color.black);

    	jButtonOptions.setForeground(Color.yellow);
    	jButtonOptions.setFont(new java.awt.Font("Impact", 1, 24));
    	jButtonOptions.setBackground(Color.black);
    	
    	
    	jButtonQuitter.setForeground(Color.yellow);
    	jButtonQuitter.setFont(new java.awt.Font("Impact", 1, 24));
    	jButtonQuitter.setBackground(Color.black);
    	
    	c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(20, 20, 20, 20);
        JPanel_fond.add(jButtonDeuxJoueurs, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 20, 10, 20);
        JPanel_fond.add(jButtonQuatreJoueurs, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 20, 10, 20);
        JPanel_fond.add(jButtonOptions, c);
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(20, 20, 20, 20);
        JPanel_fond.add(jButtonQuitter, c);
        
        this.setContentPane(JPanel_fond);
        this.pack();
        this.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
      //action listener
        jButtonQuitter.addActionListener(this);
    
        // gestion des événements: "addActionListener"
           GestionBouton gb = new GestionBouton();
           jButtonDeuxJoueurs.addActionListener(gb);
           jButtonQuatreJoueurs.addActionListener(gb);
           jButtonOptions.addActionListener(gb);  	



    }
    
    
    //classe interne d'écoute
       public class GestionBouton implements ActionListener { 
           public void actionPerformed(ActionEvent e) { 
               // test des valeur de e.getSource()
               
              
               if (e.getSource()==jButtonDeuxJoueurs) {
               // lance le jeu avec 2 joueurs
               JFrame jeu1=new Jeu();
               }
               else if (e.getSource()==jButtonQuatreJoueurs) {
               // lance le jeu avec 4 joueurs
            	   /*Thread playWave = AePlayWave("Chemin d'accès");
            	   playWave.start();*/
               }
               else if (e.getSource()==jButtonOptions) {
               // ouvre un menu d'options : choix des touches, couleur de perso, fond d'ecran, volume de la musique (à réfléchir)
            	   JFrame option = new Option();
            	   setVisible(false);
            	   dispose();
               }
               
               }
            }
    public void actionPerformed(ActionEvent e){
    	   
           
    	   if(e.getSource()==jButtonQuitter){
    	      this.setVisible(false);
    	      this.dispose();
    	   }
    	}
   
   
}
