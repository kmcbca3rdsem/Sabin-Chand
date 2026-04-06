package jFrames;
import javax.swing.*;
import java.awt.*;
public class Demo {

    static void main(){
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,800,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        JLabel jLabel = new JLabel("Enter you name:");
        jLabel.setBounds(10,10,200,15);
        jFrame.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10,25,200,15);
        jFrame.add(jTextField);

        JButton jButton = new JButton("Submit");
        jButton.setBounds(10,40,100,25);
        jFrame.add(jButton);
    }
}
