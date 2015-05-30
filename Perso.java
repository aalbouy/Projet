

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

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
    
    
    
    
    //Méthodes
    
    // Constructeur
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
    }
	
	public int getXCentre(){
		return x + rayon;
	}
	
	public int getYCentre(){
		return y + rayon;
	}


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
        
        //Collision filet joueur 1
        if(numJoueur == 1 && x>frame.width/2 - 10 - (2*rayon)){
        	x=490-(2*rayon);
        }
        
        //Collision filet joueur 2
        if(numJoueur == 2 && x<frame.width/2 + 10){
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

