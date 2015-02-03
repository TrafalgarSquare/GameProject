import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.text.html.parser.Entity;


public class Player{
	

	private int x,y,movingPosX,movingPosY;
	private Image player;
	private int maxHp = 100;
	private int hp = 100;
	private boolean isAlive = true;
	private int armor = 0;
	private int weaponPowerUpgrade = 0;
	
	
	//Arrays for making more than one asteroid or bullet
	
	static ArrayList<Asteroid> asteroids;
	static ArrayList bullets;
	
	

	
	
	
	
	public Player(){
		ImageIcon playerImage = new ImageIcon("Plane.jpg");
		player = playerImage.getImage();
		x=300;
		y=460;
		bullets = new ArrayList();
		asteroids = new ArrayList();
		isAlive = true;
		
	}
	
	public void shoot(){
		Bullet bullet = new Bullet(x,y);
		bullets.add(bullet);
				
	}
	
	public static void createAsteroid(){
		Asteroid aster = new Asteroid();
		asteroids.add(new Asteroid());
		
	}
	
	

	//collision between player and asteroid
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
	public static ArrayList getAsteroids(){
		return asteroids;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
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
	public int getMaxHp() {
		return maxHp;
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getWeaponPowerUpgrade() {
		return weaponPowerUpgrade;
	}

	public void setWeaponPowerUpgrade(int weaponPowerUpgrade) {
		this.weaponPowerUpgrade = weaponPowerUpgrade;
	}

	public int getArmor() {
		return armor;
	}
	
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public Image getImage() {
		return player;
	}

	//movement
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
