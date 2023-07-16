// package classContainer;
import javax.swing.*;
import java.awt.*;

public class _07_borderLayout{
	public static void main(String[] args){
		JFrame frame = new JFrame("Border Layout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);

		frame.setLayout(new BorderLayout(10,10));

		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);

		panel3.setBackground(Color.darkGray);
		panel4.setBackground(Color.cyan);
		panel5.setBackground(Color.green);
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.CENTER);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.EAST);
		
		//--sub-panels--\\
		
		JPanel subPanel1 = new JPanel();
		JPanel subPanel2 = new JPanel();
		JPanel subPanel3 = new JPanel();
		JPanel subPanel4 = new JPanel();
		JPanel subPanel5 = new JPanel();
		
		subPanel1.setBackground(Color.black);
		subPanel2.setBackground(Color.yellow);
		subPanel3.setBackground(Color.magenta);
		subPanel4.setBackground(Color.gray);
		subPanel5.setBackground(Color.lightGray);
		
		subPanel1.setPreferredSize(new Dimension(20,20));
		subPanel2.setPreferredSize(new Dimension(20,20));
		subPanel3.setPreferredSize(new Dimension(20,20));
		subPanel4.setPreferredSize(new Dimension(20,20));
		subPanel5.setPreferredSize(new Dimension(20,20));
		
		panel3.setLayout(new BorderLayout(5,5));
		
		panel3.add(subPanel1,BorderLayout.NORTH);
		panel3.add(subPanel2,BorderLayout.SOUTH);
		panel3.add(subPanel3,BorderLayout.CENTER);
		panel3.add(subPanel4,BorderLayout.WEST);
		panel3.add(subPanel5,BorderLayout.EAST);
		
		

		panel3.setBackground(Color.orange);
		panel4.setBackground(Color.cyan);
		panel5.setBackground(Color.green);
		
		panel1.setBounds(0,0,50,50);
		panel2.setBounds(100,100,50,50);
		panel3.setBounds(200,100,50,50);
		panel4.setBounds(200,200,50,50);
		panel5.setBounds(300,300,50,50);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);

		
		frame.setVisible(true);
	}
}