import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;


public class Asteroid {
		
	private int x,y;
	private Image img;
	private Random number;
	private boolean destroyed = false;
	private int hp=100;
	private int counter = 0;
	private int mult = counter*200;
	
	public Asteroid(){
		counter++;
		
		ImageIcon asteroidImage = new ImageIcon("Asteroid.png");
		img = asteroidImage.getImage(); 
		x=RandomPos.randomPosition(30, 630);
		y=RandomPos.randomPosition(-200-mult,0);
		destroyed = false;
	
	}

	public void move(){
		y+=1;
		
		if(y>500){
			y=-200;
		}
	}
	//Collision between player and asteroid
	public void playerCollision(int playerX,int playerY,Player player,Asteroid aster){
		if((playerX-10<=x&&playerX+10>=x)&&(playerY-10<=y&&playerY+10>=y)){
			
			int playerHp=player.getHp();
			player.setHp(playerHp-(50-player.getArmor()));
			aster.setDestroyed(true);
			
			
		}
	}
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public Image getImage() {
		return img;
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
	public boolean isDestroyed() {
		return destroyed;
	}
	
}
