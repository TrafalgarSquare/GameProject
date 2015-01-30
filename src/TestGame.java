
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Set;


public class TestGame extends JFrame implements Runnable,KeyListener {
 
 private static final long serialVersionUID = 1L;
 
 //Timer for Enemy Spaceships to move
 public TestGame(){
	 timer = new Timer(80, new ActionListener() {  
         public void actionPerformed(ActionEvent e) {
             astr1Y += OFFSET; 
             astr2Y += OFFSET;
             astr3Y += OFFSET;
             //Painting bullet
             if(playerShot==true){
            	 
            	 bulletTemp = bullet1.getPosY();
            	 bulletTemp-= BULLETOFFSET;
            	 bullet1.setPosY(bulletTemp);
            	 if(bulletTemp<0){
            		 playerShot=false;
            	 }
             }
             //checking is the collision between bullet and enemy ship
             bulletTempX=bullet1.getPosX();
             bulletTempY=bullet1.getPosY();
             if((bulletTempX-10<=astr1X&&bulletTempX+10>=astr1X)&&(bulletTempY-10<=astr1Y&&bulletTempY+10>=astr1Y)){
            	System.out.println("Collision"); 
             }

             repaint();
         }
     });
     timer.start();

 
 }
 //variables
 
 Bullet bullet1 = new Bullet();
 int astr1X=randomPosition();
 int astr1Y = 30;
 int astr2X=randomPosition();    
 int astr2Y = 60;
 int astr3X=randomPosition();
 int astr3Y = 45;
 private final static int BULLETOFFSET = 5;
 private final static int OFFSET = 5;
 private final static int WIDTH = 20;
 private final static int HEIGHT = 20;
 private Timer timer = null;

 BufferedImage heroImage;
 BufferedImage enemyPlane;
 BufferedImage bulletImage;
 Graphics g;
 boolean playerShoot;
 boolean playerShot;
 public int playerX = 300;
 public int playerY = 460;
 public int bulletStartingX;
 public int bulletTemp;
 public int bulletTempX;
 public int bulletTempY;
 public int bulletX;
 public int bulletY;
 //run method
 public void run() {
  config();
  this.setTitle("Game Launcher");
  this.setSize(700, 500);
  
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  //Trying to load images
  try {
	  bulletImage = ImageIO.read(new File("Bullet.png"));
	  enemyPlane = ImageIO.read(new File("EnemyPlane.png"));
   heroImage = ImageIO.read(new File("Plane.jpg"));
   g = heroImage.getGraphics();
  } catch (IOException e) {
   e.printStackTrace();
  }
  this.setVisible(true);
 }
 
 //Display
 private void config() {
  JPanel panel = new JPanel();
  
  panel.setFocusable(true);
  panel.requestFocusInWindow();
  panel.addKeyListener(this);
  panel.setBackground(Color.WHITE);
  this.add(panel);
 }
 //Method for painting images on screen
 public void paint(Graphics aGraphics) {
	 super.paint(aGraphics);
  
  if (astr1Y > 590)  
      astr1Y = 10;      
  if (astr2Y > 590)     
      astr2Y = 10;
  if (astr3Y > 590) 
      astr3Y = 10;

  aGraphics.drawImage(heroImage, playerX, playerY, this);
  aGraphics.drawImage(enemyPlane,astr1X, astr1Y, this);
  aGraphics.drawImage(enemyPlane,astr2X, astr2Y, this);
  aGraphics.drawImage(enemyPlane,astr3X, astr3Y, this);
  if(playerShoot==true||playerShot==true){
	  aGraphics.drawImage(bulletImage,bullet1.getPosX()+2, bullet1.getPosY()-5, this);
	  playerShoot=false;
	  playerShot=true;
  }
 
 }
 
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
//Input
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT){
    	playerX=playerX-7;
    	if(playerX<0){
    		playerX=0;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_RIGHT){
    	playerX=playerX+7;
    	if(playerX>665){
    		playerX=665;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_UP){
    	playerY=playerY-7;
    	if(playerY<17){
    		playerY=17;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_DOWN){
    	playerY=playerY+7;
    	if(playerY>460){
    		playerY=460;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_SPACE){
    	playerShot = true;  	
       	bullet1.setPosX(playerX);
       	bullet1.setPosY(playerY-30);
    }
}









@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
public int randomPosition(){
	Random rand = new Random();
	int n = rand.nextInt(700)+50;
	return n;
}
 
}
