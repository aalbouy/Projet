import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public class Balle {

	public int x, y, rayon;
    public double vx, vy;
    public boolean rebond;
    
    /* public Rectangle limites;
    public Rectangle limitesframe;
    public Rectangle frame; */
    
    public Balle(int ax, int ay, float avx, float avy){
    	x = ax;
    	y = ay;
    	vx = avx;
    	vy = avy;
    	rebond = false;
    	rayon = 20;
    }
    
    public void draw (long t, Graphics g){
    	g.setColor(Color.yellow);
    	g.fillOval(x,y,rayon, rayon);
    }
    
    public void move(){
    	if(rebond = true){
    		vx++;
    		vy = -1.8*vx;
    	}
    	vy = y + vy;
    }
}
