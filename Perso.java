import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;

import javax.imageio.ImageIO;

public class Perso{
    
    //Attributs
    public int x, y;
    public int h, l;
    public float dx, dy;
    public float vitesse;
    public Image image;
    public Rectangle limites;
    public Rectangle limitesframe;
    public Rectangle frame;
    public int numJoueur;
    public String color;	//LOL
    public double vy, vx;
    public boolean Jump, EnLAir;
    
    
    
    
    //Méthodes
    
    // Constructeur
    public Perso(int ax,int ay, float adx, float ady, float avitesse, String NomImage, Rectangle aframe, int joueur, String acolor){
        x = ax;
        y = ay;
        dx = adx;
        dy = ady;
        vitesse = avitesse ;
        frame = aframe;
        numJoueur = joueur;
        color = acolor;
        Jump = false;
        EnLAir = false;
        vy = 0;
        vx = -11.2;
    }
     


	public void draw (long t, Graphics g){
		if(numJoueur == 1){
			g.setColor(Color.red);
			g.fillArc(x, y, 100, 100, 0, 180);
		}
		if(numJoueur == 2){
			g.setColor(Color.red);
			g.fillArc(x, y, 100, 100, 0, 180);
		}
		
    }


    public void move(long t){
        x=x+(int)(vitesse*dx);
        y=y+(int)(vitesse*dy);
        
        //Collisions avec le bord de l'ecran
        if (x<frame.x){
        	x= frame.x;
        }
        else{
        	if (x+l>frame.x+frame.width){
        		x=frame.x+frame.width-l;
        	}
        }
        
        //Collision filet joueur 1
        if(numJoueur == 1){
        	if(x>390){
        		x=390;
        	}
        }
        
        //Collision filet joueur 2
        if(numJoueur == 2){
        	if(x<510){
        		x=510;
        	}
        }
        
        //Tentative saut 
        if(Jump == true){
        	EnLAir = true;
        }
        if (EnLAir == true && vx<11.2){
        	vx++;
        	vy = -1.8*vx;
        }
        else{ vx = -11.2; vy = 0; EnLAir = false;}
       
        y = y - (int)vy;
        if(y>frame.height-50){
        	y = frame.height-50;
        }
        
        
        limites.setLocation((int)x,(int)y);
        
        
    }
    
    
    
    
}

