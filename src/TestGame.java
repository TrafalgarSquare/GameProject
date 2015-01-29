package Game;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TestGame extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 1L;
	
	BufferedImage heroImage;
	Graphics g;
	
	public void run() {
		config();
		this.setTitle("Game Launcher");
		this.setSize(700, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			heroImage = ImageIO.read(new File("C:\\Users\\Vladi\\workspace\\Programs\\src\\Game\\ball.jpg"));
			g = heroImage.getGraphics();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
	}
	
	private void config() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		this.add(panel);
	}
	
	public void paint(Graphics aGraphics) {
		aGraphics.drawImage(heroImage, 50, 50, this);
	}
	
}
