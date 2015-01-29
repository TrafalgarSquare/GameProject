import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Objects {


    
    // Plane - plane that is managed by player.
    private Plane player;
    
    // Enemies.
    private ArrayList<Enemy> EnemiesList = new ArrayList<Enemy>();
    
    // Explosions
    private ArrayList<Animation> explosionsList;
    private BufferedImage explosionAnimImg;
    
    // List of all the machine gun bullets.
    private ArrayList<Bullet> bulletsList;
    
    // Image for the sky color.
    private BufferedImage skyColorImg;
    
    // Images for white spot on the sky.
    private BufferedImage cloudLayer1Img;
    private BufferedImage cloudLayer2Img;
    
    // Objects of moving images.
    private MovingBackground cloudLayer1Moving;
    private MovingBackground cloudLayer2Moving;
    
 // Image of mouse cursor.
    private BufferedImage mouseCursorImg;
    
    
    // Font that we will use to write statistic to the screen.
    private Font font;
    
    // Statistics (destroyed enemies, run away enemies)
    private int runAwayEnemies;
    private int destroyedEnemies;
    


}
