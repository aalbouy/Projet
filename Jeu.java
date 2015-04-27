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
    boolean ToucheGaucheJ1, ToucheGaucheJ2;
    boolean ToucheDroiteJ1, ToucheDroiteJ2;
    boolean ToucheHautJ1, ToucheHautJ2;
    Rectangle Ecran;
    Perso j1, j2;
    boolean Exit;
    Balle balle;
    int scoreP1;
    int scoreP2;
    Boolean finjeu;
    
    
    
    public static void main(String[] args) {
        Jeu Monjeu = new Jeu();
    }
    
    
    //Constructeur
    public Jeu() {
        super();

        setSize(1000,600);
        
        scoreP1 = 0;
        scoreP2 = 0;
        finjeu = false;
        temps = 0;
        Ecran = new Rectangle(getInsets().left,getInsets().top,getSize().width-getInsets().right-getInsets().left,getSize().height-getInsets().bottom-getInsets().top);
        
        ArrierePlan = new BufferedImage(getSize().width,getSize().height,BufferedImage.TYPE_INT_RGB);
        buffer = ArrierePlan.getGraphics();
        
        timer = new Timer(20, new TimerAction());
        j1 = new Perso(200,Ecran.height-50,(float)(0),(float)(0),(float)(10),"Volemon.png",Ecran, 1, "Color.GREEN");
        j2 = new Perso(700,Ecran.height-50,(float)(0),(float)(0),(float)(10),"Volemon.png",Ecran, 2, "Color.RED");
        
        balle = new Balle(3, 26, 0, 0);
          
        timer.start();
        this.addKeyListener(new GestionTouche());
        
        setTitle("Volley3000");
        setLocation(300,10);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public class Jeu_this_keyAdapter extends KeyAdapter{
        
        
        }
    
    public void paint( Graphics g ) {
        // remplir le buffer de noir
        buffer.setColor(Color.black);
        buffer.fillRect(Ecran.x,Ecran.y,Ecran.x+Ecran.width, Ecran.y+Ecran.height);
        // dessine TOUS les objets dans le buffer
		// Filet
        buffer.setColor(Color.green);
		buffer.fillRect(490,Ecran.height-100,20,100);
        
		// Joueurs
		j1.draw(temps, buffer);
        j2.draw(temps, buffer);
        
        // Balle
        balle.draw(temps,  buffer);
        
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
    	if (ToucheGaucheJ1) { j1.dx = -1; j1.dy= 0; }
        else 
        if (ToucheDroiteJ1) { j1.dx = 1; j1.dy = 0; }
        else{
        	j1.dx=0; 
        	j1.dy=0;
        }
        
    	if (ToucheGaucheJ2) { j2.dx = -1; j2.dy= 0; }
        else 
        if (ToucheDroiteJ2) { j2.dx = 1; j2.dy = 0; }
        else{
        	j2.dx=0; 
        	j2.dy=0;
        }
    	

	// Sauter
        if (ToucheHautJ1) { j1.Jump = true; }
        else { j1.Jump = false; }
        if (ToucheHautJ2) { j2.Jump = true; }
        else { j2.Jump = false; }
        
        // déplace le volemon sans le dessiner
        j1.move(temps);
        j2.move(temps);
        
        // déplace la balle
        //balle.move();

        // force le rafraichissement de l'image et le dessin de l'objet
        repaint();
        
        	
        }
        
        
        
        
    
    
    public class GestionTouche implements KeyListener {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            
        if(code == KeyEvent.VK_UP){
          ToucheHautJ2 = true;  
        }
        
        if(code == KeyEvent.VK_LEFT){
          ToucheGaucheJ2 = true;  
        }
        
        if(code == KeyEvent.VK_RIGHT){
          ToucheDroiteJ2 = true;  
        }
        
        if(code == KeyEvent.VK_Q){
        	ToucheGaucheJ1 = true;
        }
        
        if(code == KeyEvent.VK_D){
        	ToucheDroiteJ1 = true;
        }
        
        if(code == KeyEvent.VK_Z){
        	ToucheHautJ1 = true;
        }
        
        if(code == KeyEvent.VK_ENTER){
            if (timer.isRunning()) timer.stop();
            else timer.start();
        }
        
        if(code == KeyEvent.VK_ESCAPE){
            setVisible (false); 
            dispose (); 
            JFrame menu =new Menu();
        }
    }
        
        public void keyReleased(KeyEvent e) {
            int code = e.getKeyCode();
            
        if(code == KeyEvent.VK_UP){
          ToucheHautJ2 = false;  
        }
        
        if(code == KeyEvent.VK_LEFT){
          ToucheGaucheJ2 = false;  
        }
        
        if(code == KeyEvent.VK_RIGHT){
          ToucheDroiteJ2 = false;  
        }
        
        if(code == KeyEvent.VK_Q){
        	ToucheGaucheJ1 = false;
        }
        
        if(code == KeyEvent.VK_D){
        	ToucheDroiteJ1 = false;
        }
        
        if(code == KeyEvent.VK_Z){
        	ToucheHautJ1 = false;
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
