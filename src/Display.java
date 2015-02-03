import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.*;
 
public class Display {
 
		
			static JFrame frame = new JFrame();
        public Display(){
        	
    	
    		
                frame.add(new startScreen());
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
        
        
        

}