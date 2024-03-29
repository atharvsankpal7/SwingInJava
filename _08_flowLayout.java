// package classContainer;

import javax.swing.*;
import java.awt.*;

public class _08_flowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.lightGray);


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("10");
        JButton button11 = new JButton("11");
        JButton button12 = new JButton("12");
        JButton button13 = new JButton("13");
        JButton button14 = new JButton("14");
        JButton button15 = new JButton("15");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);

		frame.add(panel);
        frame.setVisible(true);
    }
}
