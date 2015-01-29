
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class TestGame extends JFrame implements Runnable,KeyListener {
 
 private static final long serialVersionUID = 1L;
 
 public static void main(String[] args) {
		SwingUtilities.invokeLater(new TestGame());
	}

 BufferedImage heroImage;
 Graphics g;
 public int x = 300;
 public int y = 460;
 public void run() {
  config();
  this.setTitle("Game Launcher");
  this.setSize(700, 500);
  
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  try {
   heroImage = ImageIO.read(new File("Plane.jpg"));
   g = heroImage.getGraphics();
  } catch (IOException e) {
   e.printStackTrace();
  }
  this.setVisible(true);
 }
 
 private void config() {
  JPanel panel = new JPanel();
  panel.setFocusable(true);
  panel.requestFocusInWindow();
  panel.addKeyListener(this);
  panel.setBackground(Color.WHITE);
  this.add(panel);
 }
 
 public void paint(Graphics aGraphics) {
	 super.paint(aGraphics);
  aGraphics.drawImage(heroImage, x, y, this);
 }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT){
    	x=x-7;
    	if(x<0){
    		x=0;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_RIGHT){
    	x=x+7;
    	if(x>665){
    		x=665;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_UP){
    	y=y-7;
    	if(y<17){
    		y=17;
    	}
    	repaint();
    }
    else if (key == KeyEvent.VK_DOWN){
    	y=y+7;
    	if(y>460){
    		y=460;
    	}
    	repaint();
    }
}







@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
 
}