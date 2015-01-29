package MetodsForUpdatingTheGame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.*;

public class IsItTimeForANewEnemy {

	/**
     * Creates a new enemy if it's time.
     * 
     * @param gameTime Game time.
     */
    private void createNewEnemy(long gameTime)
    {
        if(gameTime - Enemy.timeOfLastCreatedEnemy >= Enemy.timeBetweenNewEnemies)
        {
            Enemy eh = new Enemy();
            int xCoordinate = Framework.frameWidth;
            int yCoordinate = random.nextInt(Framework.frameHeight - Enemy.enemyBodyImg.getHeight());
            eh.Initialize(xCoordinate, yCoordinate);
            // Add created enemy to the list of enemies.
            enemiesList.add(eh);
            
            // Speed up enemy speed and aperence.
            Enemy.speedUp();
            
            // Sets new time for last created enemy.
            Enemy.timeOfLastCreatedEnemy = gameTime;
        }
    }

}
