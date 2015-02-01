
public class Collision {
	
	
	
	
	
	// detect if Asteroid hits player
	public static boolean player(int playerX,int playerY,int asteroidX,int asteroidY){
		boolean isCrushed = false;
		if((playerX-10<=asteroidX&&playerX+10>=asteroidX)&&(playerY-10<=asteroidY&&playerY+10>=asteroidY)){
		isCrushed=true;
		}
		return isCrushed;
		}
	
	public static boolean bullet(int bulletX,int bulletY,int asteroidX,int asteroidY){
		boolean isCrushed = false;
		if((bulletX-10<=asteroidX&&bulletX+10>=asteroidX)&&(bulletY-10<=asteroidY&&bulletY+10>=asteroidY)){
			isCrushed = true;
		}
		return isCrushed;
	}

}
