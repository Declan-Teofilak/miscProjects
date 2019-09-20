import java.awt.FlowLayout;

import java.awt.*;        // Using AWT layouts
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;     // Using Swing components and containers

public class main extends JFrame{
	
	public main() {
		Container cp = getContentPane();
		//Jpanel window
		JPanel window = new JPanel(new FlowLayout());
		add(window);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new main();
	}

}
