import java.awt.*;

import javax.swing.ImageIcon;

public class Bullet {
	
	int x,y;
	Image img;
	boolean visible = true;
	
	public Bullet(int startX,int startY){
		x=startX;
		y=startY-30;
		ImageIcon newBullet = new ImageIcon("Bullet.png");
		img  = newBullet.getImage();
		visible = true;
		
	}
	
	public void move(){
		y-=5;
		if(y<0){
			visible = false;
		}
	}
	public void collision(int asteroidX,int asteroidY){
		if((x-10<=asteroidX&&x+10>=asteroidX)&&(y-10<=asteroidY&&y+10>=asteroidY)){
			visible = false;
		}
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
	public boolean isVisible() {
		return visible;
	}
	public Image getImage() {
		return img;
	}
	
	
	
	
	
}