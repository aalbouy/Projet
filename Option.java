package volemon;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
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
        private ButtonGroup balle = new ButtonGroup();
        
    private GridLayout gridLayoutballe;
    private JPanel Balle;
       
    private  JRadioButton j1Red = new JRadioButton("Rouge");
     private JRadioButton j1Yellow = new JRadioButton("Jaune");
     private JRadioButton j1Blue = new JRadioButton("Bleu");
     private JRadioButton j1White = new JRadioButton("Blanc");
    private JRadioButton j1Pink = new JRadioButton("Rose");
    private JRadioButton j1Green = new JRadioButton("Vert");
    private JRadioButton j1Orange = new JRadioButton("Orange");
    private ButtonGroup j1 = new ButtonGroup();
    private GridLayout gridLayoutJ1;
    private JPanel J1;
    
   private  JRadioButton j2Red = new JRadioButton("Rouge");
    private JRadioButton j2Yellow = new JRadioButton("Jaune");
    private JRadioButton j2Blue = new JRadioButton("Bleu");
   private  JRadioButton j2White = new JRadioButton("Blanc");
    private JRadioButton j2Pink = new JRadioButton("Rose");
    private JRadioButton j2Green = new JRadioButton("Vert");
    private JRadioButton j2Orange = new JRadioButton("Orange");
    private ButtonGroup j2 = new ButtonGroup();
    private GridLayout gridLayoutJ2;
    private JPanel J2;
    
    private GridLayout gridLayoutPrincipal;
   
    public Option() {
        
        gridLayoutPrincipal = new GridLayout(3,1);
        this.getContentPane().setLayout(gridLayoutPrincipal);
        this.setLocationRelativeTo(null);
        this.setSize( new Dimension(1000, 600) );
        this.setTitle( "Options" ); 
        
        JPanel Balle = new JPanel();
        Balle.setLayout(new GridLayout());

        Balle.add(bRed);
        Balle.add(bYellow);
        Balle.add(bBlue);
        Balle.add(bWhite);
        Balle.add(bPink);
        Balle.add(bGreen);
        Balle.add(bOrange);
        this.add(Balle);
              
        
        
        JPanel J1 = new JPanel();
        J1.setLayout(new GridLayout());
        
        j1.add(j1Red);
        j1.add(j1Yellow);
        j1.add(j1Blue);
        j1.add(j1White);
        j1.add(j1Pink);
        j1.add(j1Green);
        j1.add(j1Orange);
        this.add(J1);
       
       
        
        
        JPanel J2 = new JPanel();
        J2.setLayout(new GridLayout());
        j2.add(j2Red);
        j2.add(j2Yellow);
        j2.add(j2Blue);
        j2.add(j2White);
        j2.add(j2Pink);
        j2.add(j2Green);
        j2.add(j2Orange);
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
          
            }
            else if (e.getSource()==bYellow) {
           
            }
            else if (e.getSource()==bBlue) {
           
            }
            else if (e.getSource()==bWhite) {
           
            }
                else if (e.getSource()==bPink) {
               
                }
                else if (e.getSource()==bGreen) {
               
                }
                else if (e.getSource()==bOrange) {
                
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
 
    public static void main(String[] args) {
            new Option();
        }
}
