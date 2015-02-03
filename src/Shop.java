import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Shop extends JFrame implements ActionListener {

	JButton buttonBuyWeapon,buttonBuyArmor,back;
	public Equipment equip = new Equipment();
	Dimension d;
	static JFrame frame = new JFrame();
	public Shop(){
	createGUI();
	}
	private void createGUI(){
		setLayout(null);
		setTitle("Asteroid Shooter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700	,500);
		setVisible(true);

		buttonBuyWeapon=new JButton("Buy Weapon - 5 gold");
		buttonBuyWeapon.setBounds(270, 160, 200, 30);
		buttonBuyWeapon.addActionListener(this);
		add(buttonBuyWeapon);
		buttonBuyArmor=new JButton("Buy Armor - 5 gold");
		buttonBuyArmor.setBounds(270, 210, 200, 30);
		buttonBuyArmor.addActionListener(this);
		add(buttonBuyArmor);
		back=new JButton("Back");
		back.setBounds(600, 400, 90, 30);
		back.addActionListener(this);
		add(back);
		
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back){
			
			frame.add(new startScreen());
            frame.setBackground(Color.WHITE);
            frame.setTitle("Asteroid Shooter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700,500);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            
		}
		
	}
	
}
