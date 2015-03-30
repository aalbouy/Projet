import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Jeu extends JFrame {
    
    //Attributs
    Timer timer;
    long temps;
    BufferedImage ArrierePlan;
    Graphics buffer;
    boolean ToucheGauche;
    boolean ToucheDroite;
    boolean ToucheHaut;
    Rectangle Ecran;
    Perso res;
    int scoreP1;
    int scoreP2;
    Boolean finjeu;
    
    // Liste de tous les objets du jeu (joueur1, joueur 2, balle, filet ?)
    
    public static void main(String[] args) {
        Jeu Monjeu = new Jeu();
    }
    //Constructeur
    public Jeu() {
        super();

        setSize(1020,680);
        
        scoreP1 = 0;
        scoreP2 = 0;
        finjeu = false;
        temps = 0;
        Ecran = new Rectangle(getInsets().left,getInsets().top,getSize().width-getInsets().right-getInsets().left,getSize().height-getInsets().bottom-getInsets().top);
        
        ArrierePlan = new BufferedImage(getSize().width,getSize().height,BufferedImage.TYPE_INT_RGB);
        buffer = ArrierePlan.getGraphics();
        
        timer = new Timer(20, new TimerAction());
        res = new Perso(Ecran.width-100,Ecran.height-50,(float)(0),(float)(0),(float)(10),"Volemon.png",Ecran);
          
        timer.start();
        this.addKeyListener(new GestionTouche());
        
       
     
      
        
        
        setLocation(300,10);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public class Jeu_this_keyAdapter extends KeyAdapter{
        
        
        }
    
    public void paint( Graphics g ) {
        // remplire le buffer de noir
        buffer.setColor(Color.black);
        buffer.fillRect(Ecran.x,Ecran.y,Ecran.x+Ecran.width,
        Ecran.y+Ecran.height);
        // dessine TOUS les objets dans le buffer
       
        res.draw(temps, buffer);
        
        // dessine une seule fois le buffer dans le Panel
        g.drawImage(ArrierePlan,0,0,this);
        
            buffer.setColor(Color.white);
           
        }
        

    
    
    
    private class TimerAction implements ActionListener {
            // ActionListener appelee toutes les 100 millisecondes
        public void actionPerformed(ActionEvent e) {
                boucle_principale_jeu();
                temps++;
        }
    }
    
    
    public void boucle_principale_jeu(){
        
        // déplacement lateral du volemon
        if (ToucheGauche) { res.dx = -1; res.dy= 0; }
        else 
        if (ToucheDroite) { res.dx = 1; res.dy = 0; }
        else{
        	res.dx=0; 
        	res.dy=0;
        }
        // déplace le volemon sans le dessiner
        res.move(temps);
        // force le rafraÃ®chissement de l'image et le dessin de l'objet
        repaint();
        
        
        
        // Sauter
            
        }
        
        
        
        
    
    
    public class GestionTouche implements KeyListener {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            
        if(code == KeyEvent.VK_SPACE){
          ToucheHaut = true;  
        }
        
        if(code == KeyEvent.VK_LEFT){
          ToucheGauche = true;  
        }
        
        if(code == KeyEvent.VK_RIGHT){
          ToucheDroite = true;  
        }
                
        if(code == KeyEvent.VK_ENTER){
            if (timer.isRunning()) timer.stop();
            else timer.start();
        }
        
        
        this.setTitle("Code clavier : "+Integer.toString(code));
        
    }
        
        public void keyReleased(KeyEvent e) {
            int code = e.getKeyCode();
            
        if(code == KeyEvent.VK_SPACE){
          ToucheHaut = false;  
        }
        
        if(code == KeyEvent.VK_LEFT){
          ToucheGauche = false;  
        }
        
        if(code == KeyEvent.VK_RIGHT){
          ToucheDroite = false;  
        }
        }
        
        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Implement this method
        }

        private void setTitle(String string) {
        }
        
    }
    
    
    
}
