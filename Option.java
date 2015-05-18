package volemon;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
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
    
    private GridLayout gridLayoutPrincipal;
    private JLabel balle;
    private JLabel j1;
    private JLabel j2;
    
    private ButtonGroup groupe1;
    private ButtonGroup groupe2;
    private ButtonGroup groupe3;

    public Color couleur;
   
    public Option() {
        
        gridLayoutPrincipal = new GridLayout(3,1);
        this.getContentPane().setLayout(gridLayoutPrincipal);
        this.setLocationRelativeTo(null);
        this.setSize( new Dimension(1000, 600) );
        this.setTitle( "Options" ); 
        Box panneauRadio1 = Box.createHorizontalBox();
        Box panneauRadio2 = Box.createHorizontalBox();
        Box panneauRadio3 = Box.createHorizontalBox();
        
        JLabel balle=new JLabel("Balle");
        balle.setForeground( Color.black);
        JLabel j1=new JLabel("Joueur 1");
        balle.setForeground(Color.black);
        JLabel j2=new JLabel("Joueur 2");
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
       
        this.add(Balle);
              
        
        
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
        
        this.add(J1);
       
       
        
        
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
        this.add(J2);
        
       
        
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
        
        
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
               
      
    }
    
    public class GestionBouton implements ActionListener { 
        public void actionPerformed(ActionEvent e) { 
            // test des valeur de e.getSource()
            
           
            if (e.getSource()==bRed) {
                couleur=Color.RED;
            }
            else if (e.getSource()==bYellow) {
                couleur=Color.YELLOW;
            }
            else if (e.getSource()==bBlue) {
                couleur=Color.BLUE;
            }
            else if (e.getSource()==bWhite) {
                couleur=Color.WHITE;
            }
                else if (e.getSource()==bPink) {
                couleur=Color.PINK;
                }
                else if (e.getSource()==bGreen) {
                couleur=Color.GREEN;
                }
                else if (e.getSource()==bOrange) {
                    couleur=Color.ORANGE;
                }
                if (e.getSource()==j1Red) {
                
                }
                else if (e.getSource()==j1Yellow) {
                
                }
                else if (e.getSource()==j1Blue) {
                
                }
                else if (e.getSource()==j1White) {
                
                }
                    else if (e.getSource()==j1Pink) {
                   
                    }
                    else if (e.getSource()==j1Green) {
                   
                    }
                    else if (e.getSource()==j1Orange) {
                    
                    }
                if (e.getSource()==j2Red) {
                
                }
                else if (e.getSource()==j2Yellow) {
                
                }
                else if (e.getSource()==j2Blue) {
                
                }
                else if (e.getSource()==j2White) {
                
                }
                    else if (e.getSource()==j2Pink) {
                   
                    }
                    else if (e.getSource()==j2Green) {
                   
                    }
                    else if (e.getSource()==j2Orange) {
                    
                    }
            }
         }
    public Color getCouleur (){
        return couleur;
    }
    public static void main(String[] args) {
            new Option();
        }
}
