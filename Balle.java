

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Balle {

	public int x, y, rayon;
    public double vx, vy, theta;
    public double dx,dy;
    public boolean rebond;
    public Rectangle frame; 
    public Color z = Option.getCouleurB();
    
    
    
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
    
    public void draw (long t, Graphics g){
		g.setColor(Color.white);
    	g.setColor(z);
    	g.fillOval(x,y,rayon*2, rayon*2);
    }
    
    public int getXCentre(){
		return x + rayon;
	}
	
	public int getYCentre(){
		return y + rayon;
	}
    
    public void move(long t){
      	vx++;
		vy = 0.5*vx;
    	y = y + (int)vy + (int)dy;
    	x = x + (int)(dx/2);
    }
}
