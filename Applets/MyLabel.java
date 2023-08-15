package Applets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class MyLabel extends JLabel{
    MyLabel() {
        // JLabel is s GUI display area for a string of text, an image, or both

        this.setText("Bro, do you even code? ");
        this.setForeground(new Color(0x00FF00));
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setBackground(Color.BLACK);
        this.setOpaque(true);

        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
    }
}
