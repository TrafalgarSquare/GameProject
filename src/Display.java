import java.awt.Color;

import javax.swing.*;
 
public class Display {
 
	
			static JFrame frame = new JFrame();
        public Display(){
                
                frame.add(new TestGame());
                frame.setBackground(Color.WHITE);
                frame.setTitle("Asteroid Shooter");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700,500);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
        }
        public static void main(String[] args){
                new Display();
        }
        
        
        public static void playGame(){
        	frame.add(new TestGame());
        }

}