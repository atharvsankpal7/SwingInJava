
// package classContainer;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class _02_frame {
    public static void main(String[] a) {
        new myFrame();
    }
}
class myFrame extends JFrame {
	//since we are extending the `JFrame` class we do not need to create object of JFrame
	//we are reffering to the method of object that we have created when we use `this` keyword
	//when we use super we call the method of superClass i.e. `JFrame` class
	//when we do not specify anything before method it will automatically call the method of `JFrame` class
    myFrame() {
        setTitle("Overriding the title");
        this.setSize(500, 500);
        setVisible(true);
        super.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("spidey.png");
        setIconImage(image.getImage());

        getContentPane().setBackground(new Color(123, 50, 250));
    }
}
