import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class _04_frame extends JFrame{
	_04_frame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("04th frame");
		setSize(600,600);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		// setResizable(false);
		setLayout(null);
		
		ImageIcon icon = new ImageIcon("spidey.png");
		  Border border = BorderFactory.createLineBorder(Color.blue, 3); // Corrected color name



		JLabel label = new JLabel();
		label.setText("This is label");
		label.setIcon(icon);
		label.setBounds(75,75,400,400);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(Color.green);
		label.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		label.setIconTextGap(20); // To increase the gap between image and text
		// label.setIconTextGap(-20); // To pull the text and image closer to each other
		label.setBackground(Color.black);
		label.setOpaque(true); //IMP
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		add(label);

		// To instantly showing up the updated frame
		revalidate();
		repaint();
	}
	

	public static void main(String[] args){
		new PackDemo$();
	}
}
class PackDemo$ extends JFrame{
	PackDemo$(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("04th frame");
		setVisible(true);
		getContentPane().setBackground(Color.white);
		
		
		ImageIcon icon = new ImageIcon("spidey.png");
		 Border border = BorderFactory.createLineBorder(Color.blue, 3); // Corrected color name



		JLabel label = new JLabel();
		label.setText("This is label");
		label.setIcon(icon);
		
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(Color.green);
		label.setFont(new Font("Comic Sans MS",Font.PLAIN,50));
		label.setIconTextGap(20); // To increase the gap between image and text
		// label.setIconTextGap(-20); // To pull the text and image closer to each other
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		add(label);
		// automatically adjusts the size of frame to the componenets present inside
		pack();

		// To instantly showing up the updated frame
		revalidate();
		repaint();
		
		// unused methods
		/*
		 * label.setBounds(75,75,400,400);
		 * setSize(600,600);
		 * setResizable(false);
		 * setLayout(null);
		 */
	}
	
}