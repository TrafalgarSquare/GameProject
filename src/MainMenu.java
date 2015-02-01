import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;




public class MainMenu extends JPanel implements ActionListener,Runnable {
	
	private JButton buttonPlay;
    public MainMenu() {
    setFocusable(true);
    buttonPlay = new JButton("Play");
    buttonPlay.setBounds(350, 200, 60, 30);
    buttonPlay.addActionListener(this);
    add(buttonPlay);
            
            
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonPlay){
			
			Display.playGame();
		}
		
	}
	

}
