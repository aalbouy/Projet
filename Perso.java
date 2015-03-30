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
   
    
    
    
    
    //M�thodes
    
    // Constructeur
    public Perso(int ax,int ay, float adx, float ady, float avitesse, String NomImage, Rectangle aframe){
        x = ax;
        y = ay;
        dx = adx;
        dy = ady;
        vitesse = avitesse ;
        frame = aframe;
        String nom = "Perso";
        
        
        try {
        image= ImageIO.read(new File(NomImage));
        }
        catch(Exception err) {
        	System.out.println(NomImage+" introuvable !");
        	System.out.println("Mettre les images dans le repertoire :" + getClass().getClassLoader().getResource(NomImage));
        	System.exit(0);
        }
        // récupère une fois pour toute la hauteur et largeur de l'image
        h= image.getHeight(null);
        l= image.getWidth(null);
        // définir les limites de l'objet pour les collisions et les sorties
        limites = new Rectangle(ax,ay,l,h);
        }
        
    
    public void draw (long t, Graphics g){
        g.drawImage(image,x,y,null);
    }
    public void move(long t){
        x=x+(int)(vitesse*dx);
        y=y+(int)(vitesse*dy);
        
        if (x<frame.x) x= frame.x;
                else
            if (x+l>frame.x+frame.width)
                    x=frame.x+frame.width-l;
        if (y<frame.y) y= frame.y;
                else
            if (y+h>frame.y+frame.height)
                    y=frame.y+frame.height-h;
        
        limites.setLocation(x,y);
        
        
    }
    
    
    
    
}

