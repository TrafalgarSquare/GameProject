import java.awt.*;

import javax.swing.ImageIcon;

public class Bullet {
	
	private int x,y;
	private Image img;
	private boolean visible = true;
	Score myScore = new Score();
	public int pointsTemp = 0;
	public int points = 0;
	
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
	//Collision between bullet and asteroid
	public void collision(int asteroidX,int asteroidY,Player player,Asteroid aster){
		if((x-10<=asteroidX&&x+10>=asteroidX)&&(y-10<=asteroidY&&y+10>=asteroidY)){
			visible = false;
				points += pointsTemp;
			int hpOfAster = aster.getHp();
			int dmgDone = 20+player.getWeaponPowerUpgrade();
			aster.setHp(hpOfAster-dmgDone);
			if(aster.getHp()<=49){
				aster.setDestroyed(true);
			}
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