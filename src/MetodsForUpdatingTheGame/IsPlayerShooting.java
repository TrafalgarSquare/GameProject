package MetodsForUpdatingTheGame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.*;


public class IsPlayerShooting {

	/**
     * Checks if the player is shooting with the machine gun and creates bullets if he shooting.
     * 
     * @param gameTime Game time.
     */
    private void isPlayerShooting(long gameTime, Point mousePosition)
    {
        if(player.isShooting(gameTime))
        {
            Bullet.timeOfLastCreatedBullet = gameTime;
            player.numberOfAmmo--;
            
            Bullet b = new Bullet(player.machineGunXcoordinate, player.machineGunYcoordinate, mousePosition);
            bulletsList.add(b);
        }
    }
}
