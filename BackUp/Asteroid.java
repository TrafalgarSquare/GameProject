import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;


public class Asteroid {
	static ArrayList asteroids;
	
	int x,y;
	Image img;
	Random number;
	boolean destroyed = false;
	int hp=100;
	
	public Asteroid(){
		ImageIcon asteroidImage = new ImageIcon("Asteroid.png");
		img = asteroidImage.getImage(); 
		x=RandomPos.randomPosition(30, 630);
		y=RandomPos.randomPosition(-200,0);
		destroyed = false;
		
		
		
	}
	
	
	public void move(){
		y+=1;
		if(y>500){
			y=-100;
		}
	}
	
	public void playerCollision(int playerX,int playerY){
		if((playerX-10<=x&&playerX+10>=x)&&(playerY-10<=y&&playerY+10>=y)){
			hp-=50;
			if(hp==0){
				destroyed=true;
			}
		}
	}
	public void bulletCollision(int bulletX,int bulletY){
		if((bulletX-10<=x&&bulletX+10>=x)&&(bulletY-10<=y&&bulletY+10>=y)){
			hp-=50;
			if(hp==0){
			destroyed=true;
			}
		}
	}
	
	
	
	
	
	public static ArrayList getAsteroids() {
		return asteroids;
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
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
			Asteroid ast = new Asteroid();
			asteroids.add(ast);
			
		}
	}
	
}
