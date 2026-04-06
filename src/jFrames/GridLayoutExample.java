package jFrames;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("GridLayout Example");

        frame.setLayout(new GridLayout(4, 4));

        // Add buttons
        frame.add(new JButton("/"));
        frame.add(new JButton("0"));
        frame.add(new JButton("x"));
        frame.add(new JButton("-"));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("+"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("."));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("="));

        // Frame settings
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}