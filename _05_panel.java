
// package classContainer;

import javax.swing.*;
import java.awt.*;

public class _05_panel{
	public static void main(String[] a){
		JFrame frame = new JFrame("Label");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800,800);
		frame.setVisible(true);		
		
		ImageIcon icon = new ImageIcon("spidey.png");
		
		JLabel label = new JLabel("This is label");
		label.setForeground(Color.white);
		
		// use when container has layout as borderlayout
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,200,200);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(200,0,200,200);
		bluePanel.setLayout(new BorderLayout());
		bluePanel.add(label);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,200,400,200);
		
		
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
		
		frame.revalidate();
		frame.repaint();
		
	}
}
