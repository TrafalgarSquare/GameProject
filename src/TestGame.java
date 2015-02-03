
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
			
	//main window
			
			Random number;
	     	Player player;
	 		Timer time;
	 		Score myScore = new Score();
			public static int pointsTemp;
	        static Font fontHp = new Font("SanSerif", Font.BOLD, 15);
	        static Font fontScore = new Font("SanSerif", Font.BOLD, 15);
			public static int moneyTemp;
	        public TestGame() {
	        	
	                player = new Player();
	                addKeyListener(new AL());
	                setFocusable(true);
	                run();
	                time = new Timer(10, this);
	                time.start();
	        }
	 
	        public void actionPerformed(ActionEvent e) {
	        	//update Equipment
	        	
	        	
	        	
	        	//update Bullet
	        	ArrayList asteroidos = player.getAsteroids();
	        	int num = asteroidos.size();
	        	if(player.isAlive()==true){
	        	ArrayList bullets = Player.getBullets();
                for (int i = 0; i < bullets.size(); i++) {
					Bullet n = (Bullet) bullets.get(i);
					if(n.isVisible()==true){
					n.move();
					
					}
					else{
						bullets.remove(i);
					}
					
					
						
				}
                //Update Asteroids
                ArrayList asteroids = player.getAsteroids();
                for (int i = 0; i < asteroids.size(); i++) {
					Asteroid aster = (Asteroid)asteroids.get(i);
					if(aster.isDestroyed()==false){
					aster.move();
					aster.playerCollision(player.getX(),player.getY(),player,aster);	
					for (int j = 0; j < bullets.size(); j++) {
						Bullet bulletn = (Bullet) bullets.get(j);
						if(bulletn.isVisible()==true){
						bulletn.collision(aster.getX(),aster.getY(),player,aster);
						}
					}
					
					
					}
					else{	
						//adding score and money
						myScore.addPoints(20);
						myScore.addMoney(1);
						System.out.println(myScore.getPoints()+" "+ myScore.getMoney());
						asteroids.remove(i);
						}
                	}
                
                	if(player.getHp()<=0){
                		player.setAlive(false);
                	}
                	
                	
                	
                	
	                player.move();
	                repaint();
	        	}
	        	else{
	        	
	        		
	        	}
	        }
	 
	        public void paint(Graphics g) {
	        	//painting method
	                super.paint(g);
	                Graphics2D g2d = (Graphics2D) g;
	              
	             //painting player
	                g2d.drawImage(player.getImage(), player.getX(), player.getY(), null);
	                //painting asteroids
	                ArrayList asteroids = player.getAsteroids();
	                for (int i = 0; i < asteroids.size(); i++) {
						Asteroid aster = (Asteroid)asteroids.get(i);
						if(aster.isDestroyed()==false){
							g2d.drawImage(aster.getImage(),aster.getX(),aster.getY(),null);
							
					
							
						}
	                }
	              
	        //painting bullets
	                ArrayList bullets = Player.getBullets();
	                for (int i = 0; i < bullets.size(); i++) {
						Bullet n = (Bullet) bullets.get(i);
						g2d.drawImage(n.getImage(),n.getX(),n.getY(),null);
					}
	                
	                
                  
	                
	                //painting Window text : PlayerHp and Score
	                g2d.setFont(fontHp);
	                g2d.setColor(Color.BLUE);
	                g2d.drawString("Player health:"+player.getHp()+"/"+player.getMaxHp(), 0, 15);
	                g2d.setFont(fontScore);
	                g2d.setColor(Color.BLUE);
	                g2d.drawString("Score:"+myScore.getPoints(), 600, 15);
	                
	        }
	        //keylistener
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
			
			//making 5 asteroids
			public void run() {
				for (int i = 0; i < 5; i++) {
					player.createAsteroid();

				}
				
							
			}
		
	}