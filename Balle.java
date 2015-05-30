package volemon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


/**
 * Classe qui permet la cr�ation de la balle
 * @author Volley3000
 * @version 3.0
 */
public class Balle {

	public int x, y, rayon;
    public double vx, vy, theta;
    public double dx,dy;
    public boolean rebond;
    public Rectangle frame; 
    public Color z = Option.getCouleurB();
    
    
    /**
        * Constructeur de la classe Balle
        * @author Volley3000
        * @param ax
        * @param ay
        * @param aframe
        * 
        */
    public Balle(int ax, int ay, Rectangle aframe){
    	x = ax;
    	y = ay;
    	dx = 0;
    	dy = 0;
    	vx = -34;
    	frame = aframe;
    	rebond = false;
    	rayon = 10;       
    }
    /**
        * M�thode permettant l'affichage de la Balle
        * @author Volley3000
        * @param t
        * @param g
        */
    public void draw (long t, Graphics g){
		g.setColor(Color.white);
    	g.setColor(z);
    	g.fillOval(x,y,rayon*2, rayon*2);
    }
    /**
         * M�thode permettant d'obtenir la position sur l'axe x du centre de la balle
         * @author Volley3000
         * @return
         */
    public int getXCentre(){
		return x + rayon;
	}
    /**
        * M�thode permettant d'obtenir la position sur l'axe y du centre de la balle
        * @author Volley3000
        * @return
        */

	public int getYCentre(){
		return y + rayon;
	}
    /**
        * M�thode qui fait bouger la balle 
        * @author Volley3000
        * @param t
        */
    public void move(long t){
      	vx++;
		vy = 0.5*vx;
    	y = y + (int)vy + (int)dy;
    	x = x + (int)(dx/2);
    }
}
