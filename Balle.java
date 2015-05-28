

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Balle {

	public int x, y, rayon;
    public double vx, vy, theta;
    public double dx,dy;
    public boolean rebond;
    public Rectangle frame; 
    public Color z =Option.getCouleurB();
    
    
    
    public Balle(int ax, int ay, float avx, float avy, Rectangle aframe){
    	x = ax;
    	y = ay;
    	dx = 0;
    	dy = 0;
    	vx = -34;
    	vy = avy;
    	frame = aframe;
    	rebond = false;
    	rayon = 10;
    	//tab[6] = Color.red;
       
    }
    
    public void draw (long t, Graphics g){
    	g.setColor(z);
    	g.fillOval(x,y,rayon*2, rayon*2);
    	g.setColor(Color.green);
    	g.fillOval(this.getXCentre()-1, this.getYCentre()-1, 2, 2);
    }
    
    public int getXCentre(){
		return x + rayon+10;
	}
	
	public int getYCentre(){
		return y + rayon;
	}
    
    public void move(long t){
    	if(y>frame.height){
    		vx=-34;
    		vy=0;
    		y=frame.height;
    	}
    	
    	vx++;
		vy = -0.5*vx;
    	y = y - (int)vy + (int)dy/2;
    	x = x + (int)dx/2;
    }
}
