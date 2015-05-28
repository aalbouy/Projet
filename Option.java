


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Option extends JFrame {
    private JRadioButton bRed = new JRadioButton("Rouge");
    private  JRadioButton bYellow = new JRadioButton("Jaune");
    private JRadioButton bBlue = new JRadioButton("Bleu");
    private JRadioButton bWhite = new JRadioButton("Blanc");
    private JRadioButton bPink = new JRadioButton("Rose");
    private JRadioButton bGreen = new JRadioButton("Vert");
    private JRadioButton bOrange = new JRadioButton("Orange");
        
        
    private GridLayout gridLayoutballe;
    private JPanel Balle;
       
    private  JRadioButton j1Red = new JRadioButton("Rouge");
    private JRadioButton j1Yellow = new JRadioButton("Jaune");
    private JRadioButton j1Blue = new JRadioButton("Bleu");
    private JRadioButton j1White = new JRadioButton("Blanc");
    private JRadioButton j1Pink = new JRadioButton("Rose");
    private JRadioButton j1Green = new JRadioButton("Vert");
    private JRadioButton j1Orange = new JRadioButton("Orange");
   
    private GridLayout gridLayoutJ1;
    private JPanel J1;
    
    private  JRadioButton j2Red = new JRadioButton("Rouge");
    private JRadioButton j2Yellow = new JRadioButton("Jaune");
    private JRadioButton j2Blue = new JRadioButton("Bleu");
    private  JRadioButton j2White = new JRadioButton("Blanc");
    private JRadioButton j2Pink = new JRadioButton("Rose");
    private JRadioButton j2Green = new JRadioButton("Vert");
    private JRadioButton j2Orange = new JRadioButton("Orange");
   
    private GridLayout gridLayoutJ2;
    private JPanel J2;
    
    private BoxLayout boxLayoutPrincipal;
    private JLabel balle;
    private JLabel j1;
    private JLabel j2;
    
    private ButtonGroup groupe1;
    private ButtonGroup groupe2;
    private ButtonGroup groupe3;

    public static Color cb;
    public static Color cj1;
    public static Color cj2;
    private JButton jButtonRetour=new JButton("Menu");
   
    public Option() {
        
        Box boxLayoutPrincipal = Box.createVerticalBox();
        
        this.setLocationRelativeTo(null);
        this.setSize( new Dimension(1000, 600) );
        this.setTitle( "Options" ); 
        Box panneauRadio1 = Box.createHorizontalBox();
        Box panneauRadio2 = Box.createHorizontalBox();
        Box panneauRadio3 = Box.createHorizontalBox();
        
        JLabel balle=new JLabel("Balle                     ");
        balle.setForeground( Color.black);
        JLabel j1=   new JLabel("Joueur 1              ");
        balle.setForeground(Color.black);
        JLabel j2=new JLabel("Joueur 2              ");
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
        
        jButtonRetour.addActionListener(gb);
        
        
       
        
        
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
               
      
    }
    
    public class GestionBouton implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
            // test des valeur de e.getSource()
            if (e.getSource()==jButtonRetour) {
            // lance le jeu avec 2 joueurs
            JFrame jeu1=new MenuPrincipal();
                jeu1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jeu1.setVisible(true);
                
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
            }
         }
    public static Color getCouleurB (){
        return cb;
    }
    public static Color getCouleurJ1 (){
        return cj1;
    }
    public static Color getCouleurJ2 (){
        return cj2;
    }
    public static void main(String[] args) {
            new Option();
            
        }
}
