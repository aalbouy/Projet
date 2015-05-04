import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Balle {

	public int x, y, rayon;
    public double vx, vy, theta;
    public boolean rebond;
    
    /* public Rectangle limites;
    public Rectangle limitesframe; */
    public Rectangle frame; 
    
    public Balle(int ax, int ay, float avx, float avy, Rectangle aframe){
    	x = ax;
    	y = ay;
    	vx = -34;
    	vy = avy;
    	frame = aframe;
    	rebond = false;
    	rayon = 20;
    }
    
    public void draw (long t, Graphics g){
    	g.setColor(Color.yellow);
    	g.fillOval(x,y,rayon, rayon);
    }
    
    public void move(long t){
    	if(y>frame.height){
    		vx=-34;
    		vy=0;
    		y=frame.height;
    	}
    	
    	vx++;
		vy = -0.5*vx;
    	y = y - (int)vy;
    }
}
