package Applets;

import java.awt.Color;
import javax.swing.*;

class MyFrame extends JFrame
{
    MyFrame() {
        // JFrame is a GUI window to add components to
        // JFrame frame = new JFrame(); // we don't need to create an object here because the class is already extending the JFrame class and the object can be created by this class' child class

        this.setTitle("Learning applets");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(false); //prevents frame from being resized
        this.setVisible(true); // makes the frame visible
        this.setSize(500, 500);
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}