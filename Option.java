package volemon;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * Classe du menu option
 * @author Volley3000
 * @version 3.0
 */
public class Option extends JFrame {
    private JRadioButton bRed = new JRadioButton("Rouge");
    private JRadioButton bYellow = new JRadioButton("Jaune");
    private JRadioButton bBlue = new JRadioButton("Bleu");
    private JRadioButton bWhite = new JRadioButton("Blanc");
    private JRadioButton bPink = new JRadioButton("Rose");
    private JRadioButton bGreen = new JRadioButton("Vert");
    private JRadioButton bOrange = new JRadioButton("Orange");
        
        
    //private GridLayout gridLayoutballe;
    //private JPanel Balle;
       
    private JRadioButton j1Red = new JRadioButton("Rouge");
    private JRadioButton j1Yellow = new JRadioButton("Jaune");
    private JRadioButton j1Blue = new JRadioButton("Bleu");
    private JRadioButton j1White = new JRadioButton("Blanc");
    private JRadioButton j1Pink = new JRadioButton("Rose");
    private JRadioButton j1Green = new JRadioButton("Vert");
    private JRadioButton j1Orange = new JRadioButton("Orange");
   
    
    private JRadioButton j2Red = new JRadioButton("Rouge");
    private JRadioButton j2Yellow = new JRadioButton("Jaune");
    private JRadioButton j2Blue = new JRadioButton("Bleu");
    private JRadioButton j2White = new JRadioButton("Blanc");
    private JRadioButton j2Pink = new JRadioButton("Rose");
    private JRadioButton j2Green = new JRadioButton("Vert");
    private JRadioButton j2Orange = new JRadioButton("Orange");
    
    
    private JRadioButton j3Red = new JRadioButton("Rouge");
    private JRadioButton j3Yellow = new JRadioButton("Jaune");
    private JRadioButton j3Blue = new JRadioButton("Bleu");
    private JRadioButton j3White = new JRadioButton("Blanc");
    private JRadioButton j3Pink = new JRadioButton("Rose");
    private JRadioButton j3Green = new JRadioButton("Vert");
    private JRadioButton j3Orange = new JRadioButton("Orange");
    
    
    private JRadioButton j4Red = new JRadioButton("Rouge");
    private JRadioButton j4Yellow = new JRadioButton("Jaune");
    private JRadioButton j4Blue = new JRadioButton("Bleu");
    private JRadioButton j4White = new JRadioButton("Blanc");
    private JRadioButton j4Pink = new JRadioButton("Rose");
    private JRadioButton j4Green = new JRadioButton("Vert");
    private JRadioButton j4Orange = new JRadioButton("Orange");
   

    public static Color cb;
    public static Color cj1;
    public static Color cj2;
    public static Color cj3;
    public static Color cj4;
    private JButton jButtonRetour=new JButton("Menu");
    /**
         * Constructeur du menu option
         * @author Volley3000
         */

    public Option() {
        
        Box boxLayoutPrincipal = Box.createVerticalBox();
        
        this.setLocationRelativeTo(null);
        this.setTitle( "Options" ); 
        Box panneauRadio1 = Box.createHorizontalBox();
        Box panneauRadio2 = Box.createHorizontalBox();
        Box panneauRadio3 = Box.createHorizontalBox();
        Box panneauRadio4 = Box.createHorizontalBox();
        Box panneauRadio5 = Box.createHorizontalBox();
        
        JLabel balle = new JLabel("Balle                     ");
        balle.setForeground( Color.black);
        JLabel j1 = new JLabel("Joueur 1              ");
        balle.setForeground(Color.black);
        JLabel j2 = new JLabel("Joueur 2              ");
        balle.setForeground(Color.black);
        JLabel j3 = new JLabel("Joueur 3              ");
        balle.setForeground(Color.black);
        JLabel j4 = new JLabel("Joueur 4              ");
        balle.setForeground(Color.black);
        
        JPanel Balle = new JPanel();
        Balle.setLayout(new GridLayout());
        ButtonGroup groupe1 = new ButtonGroup();
       
        groupe1.add(bRed);
        groupe1.add(bYellow);
        groupe1.add(bBlue);
        groupe1.add(bWhite);
        groupe1.add(bPink);
        groupe1.add(bGreen);
        groupe1.add(bOrange);
        panneauRadio1.add(balle);
        panneauRadio1.add(bRed);
        panneauRadio1.add(bYellow);
        panneauRadio1.add(bBlue);
        panneauRadio1.add(bWhite);
        panneauRadio1.add(bPink);
        panneauRadio1.add(bGreen);
        panneauRadio1.add(bOrange);
        
        
       
       
        Balle.add(panneauRadio1);
       
       boxLayoutPrincipal.add(Balle);
              
        
        
        JPanel J1 = new JPanel();
        J1.setLayout(new GridLayout());
        ButtonGroup groupe2 = new ButtonGroup();
        
       
        groupe2.add(j1Red);
        groupe2.add(j1Yellow);
        groupe2.add(j1Blue);
        groupe2.add(j1White);
        groupe2.add(j1Pink);
        groupe2.add(j1Green);
        groupe2.add(j1Orange);
        panneauRadio2.add(j1);
        panneauRadio2.add(j1Red);
        panneauRadio2.add(j1Yellow);
        panneauRadio2.add(j1Blue);
        panneauRadio2.add(j1White);
        panneauRadio2.add(j1Pink);
        panneauRadio2.add(j1Green);
        panneauRadio2.add(j1Orange);
       
        J1.add(panneauRadio2);
        boxLayoutPrincipal.add(J1);
       
       
        
        
        JPanel J2 = new JPanel();
        J2.setLayout(new GridLayout());
        ButtonGroup groupe3 = new ButtonGroup();
        
        groupe3.add(j2Red);
        groupe3.add(j2Yellow);
        groupe3.add(j2Blue);
        groupe3.add(j2White);
        groupe3.add(j2Pink);
        groupe3.add(j2Green);
        groupe3.add(j2Orange);
        panneauRadio3.add(j2);
        panneauRadio3.add(j2Red);
        panneauRadio3.add(j2Yellow);
        panneauRadio3.add(j2Blue);
        panneauRadio3.add(j2White);
        panneauRadio3.add(j2Pink);
        panneauRadio3.add(j2Green);
        panneauRadio3.add(j2Orange);
        
       
        J2.add(panneauRadio3);
        boxLayoutPrincipal.add(J2);
        
        
        JPanel J3 = new JPanel();
        J3.setLayout(new GridLayout());
        ButtonGroup groupe4 = new ButtonGroup();
        
        
        groupe4.add(j3Red);
        groupe4.add(j3Yellow);
        groupe4.add(j3Blue);
        groupe4.add(j3White);
        groupe4.add(j3Pink);
        groupe4.add(j3Green);
        groupe4.add(j3Orange);
        panneauRadio4.add(j3);
        panneauRadio4.add(j3Red);
        panneauRadio4.add(j3Yellow);
        panneauRadio4.add(j3Blue);
        panneauRadio4.add(j3White);
        panneauRadio4.add(j3Pink);
        panneauRadio4.add(j3Green);
        panneauRadio4.add(j3Orange);
        
        J3.add(panneauRadio4);
        boxLayoutPrincipal.add(J3);
        
        
        JPanel J4 = new JPanel();
        J3.setLayout(new GridLayout());
        ButtonGroup groupe5 = new ButtonGroup();
        
        
        groupe5.add(j4Red);
        groupe5.add(j4Yellow);
        groupe5.add(j4Blue);
        groupe5.add(j4White);
        groupe5.add(j4Pink);
        groupe5.add(j4Green);
        groupe5.add(j4Orange);
        panneauRadio5.add(j4);
        panneauRadio5.add(j4Red);
        panneauRadio5.add(j4Yellow);
        panneauRadio5.add(j4Blue);
        panneauRadio5.add(j4White);
        panneauRadio5.add(j4Pink);
        panneauRadio5.add(j4Green);
        panneauRadio5.add(j4Orange);
        
        J4.add(panneauRadio5);
        boxLayoutPrincipal.add(J4);
        
       
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout());
        menu.add(jButtonRetour);
        boxLayoutPrincipal.add(jButtonRetour);
        this.add(boxLayoutPrincipal);
        
        GestionBouton gb = new GestionBouton();
        bRed.addActionListener(gb);
        bYellow.addActionListener(gb);
        bBlue.addActionListener(gb);
        bWhite.addActionListener(gb);
        bPink.addActionListener(gb);
        bGreen.addActionListener(gb);
        bOrange.addActionListener(gb);
        
        j1Red.addActionListener(gb);
        j1Yellow.addActionListener(gb);
        j1Blue.addActionListener(gb);
        j1White.addActionListener(gb);
        j1Pink.addActionListener(gb);
        j1Green.addActionListener(gb);
        j1Orange.addActionListener(gb);
        
        j2Red.addActionListener(gb);
        j2Yellow.addActionListener(gb);
        j2Blue.addActionListener(gb);
        j2White.addActionListener(gb);
        j2Pink.addActionListener(gb);
        j2Green.addActionListener(gb);
        j2Orange.addActionListener(gb);
        
        j3Red.addActionListener(gb);
        j3Yellow.addActionListener(gb);
        j3Blue.addActionListener(gb);
        j3White.addActionListener(gb);
        j3Pink.addActionListener(gb);
        j3Green.addActionListener(gb);
        j3Orange.addActionListener(gb);
        
        j4Red.addActionListener(gb);
        j4Yellow.addActionListener(gb);
        j4Blue.addActionListener(gb);
        j4White.addActionListener(gb);
        j4Pink.addActionListener(gb);
        j4Green.addActionListener(gb);
        j4Orange.addActionListener(gb);
    
        jButtonRetour.addActionListener(gb); 
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
               
      
    }
    /**
        *  Mise en place des commandes boutons
        * @author Volley3000
        */
    public class GestionBouton implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
            // test des valeur de e.getSource()
            if (e.getSource()==jButtonRetour) {
            // lance le menu principal
            	JFrame Menu=new MenuPrincipal();
                Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.setVisible(true);
                setVisible(false);
                dispose();
            }
           
            if (bRed.isSelected()) {
                cb=Color.RED;
            }
            else if (bYellow.isSelected()) {
                cb=Color.YELLOW;
            }
            else if (bBlue.isSelected()) {
                cb=Color.BLUE;
            }
            else if (bWhite.isSelected()) {
                cb=Color.WHITE;
            }
            else if (bPink.isSelected()) {
                cb=Color.PINK;
            }
            else if (bGreen.isSelected()) {
                cb=Color.GREEN;
            }
            else if (bOrange.isSelected()) {
                cb=Color.ORANGE;
            }
            
            
            if (e.getSource()==j1Red) {
                cj1=Color.RED;
            }
            else if (j1Yellow.isSelected()) {
                cj1=Color.YELLOW;
            }
            else if (j1Blue.isSelected()) {
                 cj1=Color.BLUE;        
            }
            else if (j1White.isSelected()) {
                 cj1=Color.WHITE;
            }
            else if (j1Pink.isSelected()) {
                 cj1=Color.PINK;    
            }
            else if (j1Green.isSelected()) {
                 cj1=Color.GREEN;
            }
            else if (j1Orange.isSelected()) {
                 cj1=Color.ORANGE;
            }
            
            
            if (j2Red.isSelected()) {
                 cj2=Color.RED;
            }
            else if (j2Yellow.isSelected()) {
                 cj2=Color.YELLOW;
            }
            else if (j2Blue.isSelected()) {
                 cj2=Color.BLUE;
            }
            else if (j2White.isSelected()) {
                 cj2=Color.WHITE;
            }
            else if (j2Pink.isSelected()) {
                 cj2=Color.PINK;   
            }
            else if (j2Green.isSelected()) {
                 cj2=Color.GREEN;   
            }
            else if (j2Orange.isSelected()) {
                 cj2=Color.ORANGE;
            }
            
            
              if (j3Red.isSelected()) {
                   cj3=Color.RED;
              }
              else if (j3Yellow.isSelected()) {
                   cj3=Color.YELLOW;
              }
              else if (j3Blue.isSelected()) {
                   cj3=Color.BLUE;
              }
              else if (j3White.isSelected()) {
                   cj3=Color.WHITE;
              }
              else if (j3Pink.isSelected()) {
                   cj3=Color.PINK;   
              }
              else if (j3Green.isSelected()) {
                   cj3=Color.GREEN;   
              }
              else if (j3Orange.isSelected()) {
                   cj3=Color.ORANGE;
              }
              
              
              if (j4Red.isSelected()) {
                   cj4=Color.RED;
              }
              else if (j4Yellow.isSelected()) {
                   cj4=Color.YELLOW;
              }
              else if (j4Blue.isSelected()) {
                   cj4=Color.BLUE;
              }
              else if (j4White.isSelected()) {
                   cj4=Color.WHITE;
              }
              else if (j4Pink.isSelected()) {
                   cj4=Color.PINK;   
              }
              else if (j4Green.isSelected()) {
                   cj4=Color.GREEN;   
              }
              else if (j4Orange.isSelected()) {
                   cj4=Color.ORANGE;
              }
          }
         }
    /**
         * Méthode qui retourne la couleur choisie pour la balle 
         * @author Volley3000
         * @return la couleur choisie
         */
    public static Color getCouleurB (){
        return cb;
    }
    /**
         *  Méthode qui retourne la couleur choisie pour le joueur 1
         * @author Volley3000
         * @return la couleur choisie
         */


    public static Color getCouleurJ1 (){
        return cj1;
    }
    /**
         *  Méthode qui retourne la couleur choisie pour le joueur 3
         * @author Volley3000
         * @return la couleur choisie
         */
    public static Color getCouleurJ2 (){
        return cj2;
    }
    /**
         *  Méthode qui retourne la couleur choisie pour le joueur 3
         * @author Volley3000
         * @return la couleur choisie
         */
    public static Color getCouleurJ3 (){
        return cj3;
    }
    /**
         *  Méthode qui retourne la couleur choisie pour le joueur 4
         * @author Volley3000
         * @return la couleur choisie
         */
    public static Color getCouleurJ4 (){
        return cj4;
    }
    public static void main(String[] args) {
            new Option();
            
        }
}
