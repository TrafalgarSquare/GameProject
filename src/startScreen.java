import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScreen extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1, b2;
	JLabel l1, l2;
	Dimension d;
	static JFrame frame = new JFrame();
	
	public startScreen (){
		createGUI();
	}
	
	private void createGUI(){
        setTitle("Transparent Panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setContentPane(new JLabel(new ImageIcon("Background.jpg")));
        setLayout(new GridLayout(2, 1));
               
        
        b1=new JButton("START");
        b1.setActionCommand("clickStart");
        b2=new JButton("Shop");
        b1.setActionCommand("clickShop");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1=new JLabel("Game");
        l2=new JLabel("name");
        l1.setFont(new Font("Verdana",45,90));
        l2.setFont(new Font("Verdana",45,90));
        b1.setFont(new Font("Verdana",25,50));
        b1.setBackground(new Color(235,215,144));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);

        b2.setFont(new Font("Verdana",25,50));
        b2.setBackground(new Color(235,215,144));
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        
        l1.setPreferredSize(new Dimension(700,250));
        b1.setPreferredSize(new Dimension(250,150));
        b2.setPreferredSize(new Dimension(250,150));
        
        add(l1);
        add(l2);
        add(b1);
        add(b2);
        
        setSize(700,500);
        setVisible(true);
        
        b1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	frame.add(new TestGame());
                frame.setBackground(Color.WHITE);
                frame.setTitle("Asteroid Shooter");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(700,500);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                setVisible(false);
            } 
        });
        
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

    
}
