import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;


public class Player {
	
	int x,y,movingPosX,movingPosY;
	Image player;
	int maxHp = 100;
	public int getMaxHp() {
		return maxHp;
	}

	public int getHp() {
		return hp;
	}
	int hp = 100;
	boolean isAlive = true;
	
	static ArrayList bullets;
	public Player(){
		ImageIcon playerImage = new ImageIcon("Plane.jpg");
		player = playerImage.getImage();
		x=300;
		y=460;
		bullets = new ArrayList();
		isAlive = true;
	}
	
	public void shoot(){
		Bullet bullet = new Bullet(x,y);
		bullets.add(bullet);
				
	}
	
	public void collision(int asteroidX,int asteroidY){
		if((x-10<=asteroidX&&x+10>=asteroidX)&&(y-10<=asteroidY&&y+10>=asteroidY)){
			hp-=50;
			if(hp==0){
				isAlive=false;
			}
			}
	}
	
	

	public void move(){
			x+=movingPosX;
			y+=movingPosY;
			if(x<0){
				x=0;
			}
			if(x>665){
	    		x=665;
			}
	    	if(y<0){
	    		y=0;
	    	}
	    	if(y>430){
	    		y=430;
	    	}
			
			
			
	}
	public static ArrayList getBullets(){
		return bullets;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getHealt() {
		return hp;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public Image getImage() {
		return player;
	}

	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT){
			movingPosX = -1;
			
		}
		if(key == KeyEvent.VK_RIGHT){
			movingPosX = 1;
		}
		if(key == KeyEvent.VK_UP){
			movingPosY = -1;
		}
		if(key == KeyEvent.VK_DOWN){
			movingPosY = 1;
		}
		if(key == KeyEvent.VK_SPACE){
			shoot();
		}
	}
		public void keyReleased(KeyEvent e){
			int key = e.getKeyCode();
			
			if(key == KeyEvent.VK_LEFT){
				movingPosX = 0;
			}
			if(key == KeyEvent.VK_RIGHT){
				movingPosX = 0;
			}
			if(key == KeyEvent.VK_UP){
				movingPosY = 0;
			}
			if(key == KeyEvent.VK_DOWN){
				movingPosY = 0;
			}
	}

}
