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
   
    
    
    
    
    //MÈthodes
    
    // Constructeur
    public Perso(int ax,int ay, float adx, float ady, float avitesse, String NomImage, Rectangle aframe, int joueur){
        x = ax;
        y = ay;
        dx = adx;
        dy = ady;
        vitesse = avitesse ;
        frame = aframe;
        numJoueur = joueur;
        
        
        
        try {
        	image= ImageIO.read(new File(NomImage));
        }
        catch(Exception err) {
        	System.out.println(NomImage+" introuvable !");
        	System.out.println("Mettre les images dans le repertoire :" + getClass().getClassLoader().getResource(NomImage));
        	System.exit(0);
        }
        // r√©cup√®re une fois pour toute la hauteur et largeur de l'image
        h= image.getHeight(null);
        l= image.getWidth(null);
        // d√©finir les limites de l'objet pour les collisions et les sorties
        limites = new Rectangle(ax,ay,l,h);
    }
        
    
    public void draw (long t, Graphics g){
        g.drawImage(image,x,y,null);
    }
    public void move(long t){
        x=x+(int)(vitesse*dx);
        y=y+(int)(vitesse*dy);
        
        //Collisions bord de l'Ècran
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
        
        
        limites.setLocation(x,y);
        
        
    }
    
    
    
    
}

