import javax.swing.*;
 
public class Display {
 
        public Display(){
                JFrame frame = new JFrame();
                frame.add(new TestGame());
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