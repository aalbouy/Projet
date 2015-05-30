package volemon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * Classe qui permet la création des joueurs 
 * @author Volley3000
 * @version 3.0
 */
public class Perso{
    
    //Attributs
    public int x, y, rayon;
    public float dx, dy;
    public float vitesse;
    public Rectangle frame;
    public int numJoueur;
    public String color;
    public double vy, vx;
    public boolean Jump, EnLAir;
    public Color ColJ1=Option.getCouleurJ1();
    public Color ColJ2=Option.getCouleurJ2();
    public Color ColJ3=Option.getCouleurJ3();
    public Color ColJ4=Option.getCouleurJ4();
    
    
    
    
    /**
        * Constructeur des joueurs 
        * @author Volley3000
        * @version 3.0
        * @param ax
        * @param avitesse
        * @param aframe
        * @param joueur
        */
    public Perso(int ax, float avitesse, Rectangle aframe, int joueur){
        x = ax;
        y = aframe.height-50;
        vitesse = avitesse;
        frame = aframe;
        numJoueur = joueur;
        Jump = false;
        EnLAir = false;
        vy = 0;
        vx = -11.2;
        rayon = 50;
    }
     

    /**
         * Méthode qui permet d'afficher les joueurs
         * @author Volley3000
         * @param t
         * @param g
         */

	public void draw (long t, Graphics g){
		if(numJoueur == 1){
			g.setColor(Color.blue);
			g.setColor(ColJ1);
			g.fillArc(x, y, rayon*2, rayon*2, 0, 180);
		}
                
		if(numJoueur == 2){
			g.setColor(Color.red);
			g.setColor(ColJ2);
			g.fillArc(x, y, rayon*2, rayon*2, 0, 180);
		}
                
                if(numJoueur == 3){
                        g.setColor(Color.orange);
                        g.setColor(ColJ3);
                        g.fillArc(x, y, rayon*2, rayon*2, 0, 180);
                }
                
                if(numJoueur == 4){
                        g.setColor(Color.pink);
                        g.setColor(ColJ4);
                        g.fillArc(x, y, rayon*2, rayon*2, 0, 180);
                }
    }
    /**
        * Permet de récupérer la coordonnée en x du centre du joueur
        * @author Volley3000
        * @return la coordonnée en x
        */
	public int getXCentre(){
		return x + rayon;
	}
    /**
         * Permet de récupérer la coordonnée en y du centre du joueur
         * @author Volley3000
         * @return la coordonnée en y
         */
	public int getYCentre(){
		return y + rayon;
	}


    /**
        * Méthode qui permet le déplacement des joueurs 
        * @author Volley3000
        * @param t
        */
    public void move(long t){
    	//Mouvement horizontal
        x=x+(int)(vitesse*dx);
        y=y+(int)(vitesse*dy);
        
        //Collisions avec le bord de l'ecran
        if (x<frame.x+1){
        	x = frame.x+1;
        }
        else if(x>frame.x+frame.width-(2*rayon+2)){
        	x = frame.x+frame.width-(2*rayon+2);
        }
        
        //Collision filet joueur 1 et 3
        if((numJoueur == 1 || numJoueur==3) && x>490-(2*rayon)){
        	x=490-(2*rayon);
        }
        
        //Collision filet joueur 2 et 4
        if((numJoueur == 2 || numJoueur==4) && x<510){
        	x=510;
        }
        
        //Tentative saut 
        if(Jump == true){
        	EnLAir = true;
        }
        
        //Mouvement du saut
        if (EnLAir == true && vx<11.2){
        	vx++;
        	vy = -1.8*vx;
        }
        else{ 
        	vx = -11.2; vy = 0; EnLAir = false;
        }
        
        y = y - (int)vy;
        
        if(y>frame.height-rayon){
        	y = frame.height-rayon;
        }
    }
    
}

