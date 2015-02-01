
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;


public class TestGame extends JPanel implements ActionListener,Runnable,KeyListener {
 
			Random number;
	     	Player player;
	 		Timer time;
	 		
	 		Asteroid ast = new Asteroid();
	 		Asteroid numberTwo;
	        static Font font = new Font("SanSerif", Font.BOLD, 15);
	        public TestGame() {
	                player = new Player();
	                addKeyListener(new AL());
	                setFocusable(true);
	                
	                time = new Timer(10, this);
	                time.start();
	        }
	 
	        public void actionPerformed(ActionEvent e) {
	        	if(player.isAlive==true){
	        	ArrayList bullets = Player.getBullets();
                for (int i = 0; i < bullets.size(); i++) {
					Bullet n = (Bullet) bullets.get(i);
					if(n.isVisible()==true){
					n.move();
					n.collision(ast.getX(), ast.getY());
					
//					n.collision(ast.getX(), ast.getY());
//					ast.bulletCollision(n.getX(), n.getY());
					}
					else{
						bullets.remove(i);
					}
					
						
				}
//                ArrayList asteroids = Asteroid.getAsteroids();
//                for (int i = 0; i < asteroids.size(); i++) {
//					Asteroid aster = (Asteroid)asteroids.get(i);
//					if(aster.isDestroyed()==false){
//						aster.move();
//						System.out.println("a");
//				
//						aster.playerCollision(player.getX(),player.getY());
//					}
//					else{
//						System.out.println("b");
//						asteroids.remove(i);
//					}
//                }
                
                
                	player.collision(ast.getX(),ast.getY());
                	
                	
                	ast.move();
	                player.move();
	                repaint();
	        	}
	        }
	 
	        public void paint(Graphics g) {
	                super.paint(g);
	                Graphics2D g2d = (Graphics2D) g;
	 
	             
	                g2d.drawImage(player.getImage(), player.getX(), player.getY(), null);
	             
	              
	        
	                ArrayList bullets = Player.getBullets();
	                for (int i = 0; i < bullets.size(); i++) {
						Bullet n = (Bullet) bullets.get(i);
						g2d.drawImage(n.getImage(),n.getX(),n.getY(),null);
					}
//	                ArrayList asteroids = Asteroid.getAsteroids();
//	                for (int i = 0; i < asteroids.size(); i++) {
//						Asteroid aster = (Asteroid)asteroids.get(i);
//						g2d.drawImage(aster.getImage(),aster.getX(),aster.getY(),null);
//						
//						}
	                g2d.drawImage(ast.getImage(), ast.getX(),ast.getY(),null);
	                g2d.setFont(font);
	                g2d.setColor(Color.BLUE);
	                g2d.drawString("Player health:"+player.hp+"/"+player.maxHp, 0, 15);
	                
	        }
	 
	        private class AL extends KeyAdapter {
	                public void keyReleased(KeyEvent e) {
	                	player.keyReleased(e);
	                }
	 
	                public void keyPressed(KeyEvent e) {
	                	player.keyPressed(e);
	                }
	        }

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void run() {
				
				
			}
	}