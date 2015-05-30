

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Jeu extends JFrame {
    
    //Attributs
    Timer timer;
    long temps;
    BufferedImage ArrierePlan;
    Graphics buffer;
    boolean ToucheGaucheJ1, ToucheGaucheJ2;
    boolean ToucheDroiteJ1, ToucheDroiteJ2;
    boolean ToucheHautJ1, ToucheHautJ2;
    Rectangle Ecran;
    Perso j1, j2;
    boolean Exit;
    Balle balle;
    int scoreP1;
    int scoreP2;
    boolean finjeu, colJ1, colJ2, colFilet1, colFilet2;
    
    
    
    public static void main(String[] args) {
        Jeu Monjeu = new Jeu();
    }
    
    
    //Constructeur
    public Jeu() {        
        setSize(1000,600);
        
        scoreP1 = 0;
        scoreP2 = 0;
        finjeu = false;
        temps = 0;
        Ecran = new Rectangle(getInsets().left,getInsets().top,getSize().width-getInsets().right-getInsets().left,getSize().height-getInsets().bottom-getInsets().top);
        
        ArrierePlan = new BufferedImage(getSize().width,getSize().height,BufferedImage.TYPE_INT_RGB);
        buffer = ArrierePlan.getGraphics();
        
        timer = new Timer(15, new TimerAction());
        
        j1 = new Perso(200, (float)(8), Ecran, 1);
        j2 = new Perso(700, (float)(8), Ecran, 2);
        
        balle = new Balle(240, Ecran.height-60, Ecran);
          
        timer.start();
        this.addKeyListener(new GestionTouche());
        
        setTitle("Volley3000");
        setLocation(300,10);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paint( Graphics g ) {
        // remplir le buffer de noir
        buffer.setColor(Color.black);
        buffer.fillRect(Ecran.x,Ecran.y,Ecran.x+Ecran.width, Ecran.y+Ecran.height);
		
        
        // Filet
        buffer.setColor(Color.green);
        buffer.fillRect(Ecran.width/2 - 10,Ecran.height-100,20,100);
        
        
        
		// Joueurs
		j1.draw(temps, buffer);
        j2.draw(temps, buffer);
        
        // Balle
        balle.draw(temps,  buffer);
        
        //Score
        buffer.setColor(Color.white);
        buffer.drawString("SCORE J1 : " + scoreP1,10,Ecran.height-550);
        buffer.drawString("SCORE J2 : " + scoreP2, Ecran.width-100,Ecran.height-550);
        
         //Fin jeu
        if(scoreP1==10){
            timer.stop();
            buffer.drawString("JOUEUR 1 GAGNE " + scoreP1 + " À " + scoreP2,Ecran.width/2-60,Ecran.height/2);
            finjeu = true;
        }
            
        if(scoreP2==10){
            timer.stop();
            buffer.drawString("JOUEUR 2 GAGNE " + scoreP2 + " À " + scoreP1,Ecran.width/2-60,Ecran.height/2);
            finjeu = true;
        }
        
        // dessine une seule fois le buffer dans le Panel
        g.drawImage(ArrierePlan,0,0,this);
        
        buffer.setColor(Color.white);          
    }
        

    
    
    
    private class TimerAction implements ActionListener {
            // ActionListener appelee toutes les 15 millisecondes
        public void actionPerformed(ActionEvent e) {
                boucle_principale_jeu();
                temps++;
        }
    }
    
    
    public void boucle_principale_jeu(){
        //init
        
    	colJ1 = false;
    	colJ2 = false;
    	colFilet1 = false;
    	colFilet2=false;
        // déplacement lateral du volemon
    	if (ToucheGaucheJ1) { j1.dx = -1; j1.dy= 0; }
        else 
        if (ToucheDroiteJ1) { j1.dx = 1; j1.dy = 0; }
        else{
        	j1.dx=0; 
        	j1.dy=0;
        }
        
    	if (ToucheGaucheJ2) { j2.dx = -1; j2.dy= 0; }
        else 
        if (ToucheDroiteJ2) { j2.dx = 1; j2.dy = 0; }
        else{
        	j2.dx=0; 
        	j2.dy=0;
        }
    	

	// Sauter
        if (ToucheHautJ1) { j1.Jump = true; }
        else { j1.Jump = false; }
        if (ToucheHautJ2) { j2.Jump = true; }
        else { j2.Jump = false; }
        
        //Collision
        colJ1 = collisionJoueur(j1, balle);
        colJ2 = collisionJoueur(j2, balle);
        
        //rebond s'il y a
        if(colJ1 == true){
        	balle.dx = rebondX(angle(j1,balle), balle);
        	balle.dy = rebondY(angle(j1, balle), balle);
        }
        if(colJ2 == true){
        	balle.dx = rebondX(angle(j2,balle), balle);
        	balle.dy = rebondY(angle(j2, balle), balle);
        }
        
        //collision mur
        rebondMur(balle);
        
        //collision filet
        colFilet1 = rebondFilet1(balle);
        if(colFilet1){
        	balle.vx = -34;
            balle.dy = -balle.dy;
        }
        colFilet2 = rebondFilet2(balle);
        if(colFilet2){
            balle.vy = -34;
            balle.dx = -balle.dx;
        }
        
        
        
        // déplace le volemon sans le dessiner
        j1.move(temps);
        j2.move(temps);
        
        // déplace la balle
        balle.move(temps);
        
        //score
        int y= balle.y;
        if(y>=Ecran.height && balle.x>500){
            scoreP1++;
            balle = new Balle(740, Ecran.height-60, Ecran);
            j1 = new Perso(200, (float)(8), Ecran, 1);
            j2 = new Perso(700, (float)(8), Ecran, 2);
            
        }
        if(y>=Ecran.height && balle.x<500){
            scoreP2++;
            balle = new Balle(240, Ecran.height-60, Ecran);
            j1 = new Perso(200, (float)(8), Ecran, 1);
            j2 = new Perso(700, (float)(8), Ecran, 2);
            
        }

        // force le rafraichissement de l'image et le dessin de l'objet
        repaint();
        }
        
    	
    	
    public boolean collisionJoueur (Perso j, Balle ball){
		boolean collision = false;
		double d = Math.pow(ball.getXCentre()-j.getXCentre(), 2) +  Math.pow(ball.getYCentre()-j.getYCentre(), 2);
		if((d <= (ball.rayon+j.rayon)*(ball.rayon+j.rayon)) && (ball.getYCentre()<j.getYCentre())){
			ball.vx = -34;
			ball.vy = 0;
			collision = true;
			//System.out.println("collision");
		}
		return collision;
	}
               
        public double angle (Perso j, Balle balle){
            double dx = balle.vx;
            double dy = balle.vy;
            double x1 = (balle.getXCentre()+balle.rayon-j.getXCentre());
            double y1 = (balle.getYCentre()-j.getYCentre());
            double teta = Math.acos((x1*dx+y1*dy)/(Math.sqrt(x1*x1+y1*y1)*Math.sqrt(dx*dx+dy*dy)))+10;
            return teta;
    }
        
        public double rebondX (double teta, Balle balle){
            double vx= balle.vx;
            double dx = -(Math.cos(2*teta)*vx);
            return dx;
        }
        
            public double rebondY (double teta, Balle balle){
                double vy= balle.vy;
                double dy = -(Math.cos(2*teta)*vy);            
                return dy;
            }
        
           public void rebondMur (Balle balle){
        	   if(balle.getXCentre() < balle.rayon || balle.getXCentre() > Ecran.width - balle.rayon){
        		   balle.dx = -balle.dx;
        	   }
           }
           
           public boolean rebondFilet1 (Balle balle){
               
               if ((balle.x + 2*balle.rayon > 491 ) && (balle.x < 509) && ((Ecran.height-80 >balle.y+2*balle.rayon)&& (balle.y+2*balle.rayon > Ecran.height-100))){
            	   //System.out.println("filet");
            	   return true;
               }
               else{
            	   return false;
               }
           }
           
           public boolean rebondFilet2 (Balle balle){
               if((balle.x + 2*balle.rayon > 491 ) && (balle.x < 509)&&(balle.y+2*balle.rayon >Ecran.height-80)){
                   return true;
               }
               else{
                   return false;
               }
           }
           
           public class GestionTouche implements KeyListener {
        	   public void keyPressed(KeyEvent e) {
        		   int code = e.getKeyCode();
            
        		   if(code == KeyEvent.VK_UP){
        			   ToucheHautJ2 = true;  
        		   }
        
        		   if(code == KeyEvent.VK_LEFT){
        			   ToucheGaucheJ2 = true;  
        		   }
        
        		   if(code == KeyEvent.VK_RIGHT){
        			   ToucheDroiteJ2 = true;  
        		   }
        
        		   if(code == KeyEvent.VK_Q){
        			   ToucheGaucheJ1 = true;
        		   }
        
        		   if(code == KeyEvent.VK_D){
        			   ToucheDroiteJ1 = true;
        		   }
        
        		   if(code == KeyEvent.VK_Z){
        			   ToucheHautJ1 = true;
        		   }
        
        		   if(code == KeyEvent.VK_ENTER && finjeu == false){
        			   if (timer.isRunning()) timer.stop();
        			   else timer.start();
        		   }
        
        		   if(code == KeyEvent.VK_ESCAPE){
        			   timer.stop();
        			   setVisible (false); 
        			   dispose();
        			   JFrame MonEcran = new MenuPrincipal();
        			   MonEcran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        			   MonEcran.setVisible(true);
        		   }
        	   }
        
        	   public void keyReleased(KeyEvent e) {
        		   int code = e.getKeyCode();
            
        		   if(code == KeyEvent.VK_UP){
        			   ToucheHautJ2 = false;  
        		   }
        
        		   if(code == KeyEvent.VK_LEFT){
        			   ToucheGaucheJ2 = false;  
        		   }
        
        		   if(code == KeyEvent.VK_RIGHT){
        			   ToucheDroiteJ2 = false;  
        		   }
        
        		   if(code == KeyEvent.VK_Q){
        			   ToucheGaucheJ1 = false;
        		   }
        
        		   if(code == KeyEvent.VK_D){
        			   ToucheDroiteJ1 = false;
        		   }
        
        		   if(code == KeyEvent.VK_Z){
        			   ToucheHautJ1 = false;
        		   }
        
        	   }
        	   
        	   public void keyTyped(KeyEvent e) {
                   // TODO Implement this method
               }
           }

	}
    
    