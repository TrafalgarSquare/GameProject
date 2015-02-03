import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
public class startScreen extends JFrame implements ActionListener {
/**
*
*/
private static final long serialVersionUID = 1L;
JButton buttonStart, buttonShop;

Dimension d;
static JFrame frame = new JFrame();
public startScreen (){
createGUI();
}
public void close(){

WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}
private void createGUI(){
	setLayout(null);
	setTitle("Asteroid Shooter");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(700	,500);
	setVisible(true);

	buttonStart=new JButton("Start");
	buttonStart.setBounds(270, 160, 120, 30);
	buttonStart.addActionListener(this);
	add(buttonStart);
	buttonShop=new JButton("Shop");
	buttonShop.setBounds(270, 210, 120, 30);
	buttonShop.addActionListener(this);
	add(buttonShop);




	

	
	


	

}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==buttonStart){
		
		frame.add(new TestGame());
		frame.setBackground(Color.WHITE);
		frame.setTitle("Asteroid Shooter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setVisible(true);	
		frame.setLocationRelativeTo(null);
		setVisible(false);
		
	}
	if(e.getSource()==buttonShop){
		
		frame.add(new Shop());
		frame.setBackground(Color.WHITE);
		frame.setTitle("Asteroid Shooter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setVisible(true);	
		frame.setLocationRelativeTo(null);
		setVisible(false);
		
		
	}
	
}
}