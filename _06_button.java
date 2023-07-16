
// package classContainer;	


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class _06_button {
    
   

    _06_button() {
         JFrame frame = new JFrame();
        frame.setTitle("Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setLayout(null);
		
		JLabel label = new JLabel("This is label");
		label.setBounds(600,600,100,100);
		
        ImageIcon icon = new ImageIcon("fingerpointer.png");
		
        JButton button = new JButton("Click Me");
        button.setBounds(25, 25, 600, 600);
        button.setIcon(icon);
        button.setFocusable(false);
		button.setForeground(Color.gray);
		button.setBackground(Color.red);
		button.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		button.setHorizontalTextPosition(JLabel.CENTER);
		button.setVerticalTextPosition(JLabel.BOTTOM);
		
		
		
		//creating action listener for button
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.add(label);
				button.setEnabled(false);
				frame.repaint();
			}
		};
		//adding action listener to button
        button.addActionListener(listener);

        frame.add(button);
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        new _06_button();
    }
}


