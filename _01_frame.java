// package classContainer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class _01_frame {
	public static void main(String[] a) {
		JFrame frame = new JFrame("New Window");// creates frame
		frame.setTitle("Overriding the title");
		frame.setSize(500, 500);// sets size
		frame.setVisible(true);// sets visibility (false by default)
		frame.setResizable(false);// sets weather or not the frame can be resized or not (true by default)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// What to do when exit button on the menu bar is clicked

		ImageIcon image = new ImageIcon("spidey.png");// creating the image 
		frame.setIconImage(image.getImage());// setting the image as icon for the frame
		
		//frame.getContentPane().setBackground(Color.green);
		
		frame.getContentPane().setBackground(new Color(123,50,250));
		
	}
}