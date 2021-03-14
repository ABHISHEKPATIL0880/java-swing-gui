package abhishek.learn;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {
    public static void main(String[] args){

       JFrame frame=new JFrame();
        frame.setTitle("Abhishek patil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);
       ImageIcon image =new ImageIcon("we.jpg");
       frame.setIconImage(image.getImage());
       frame.getContentPane().setBackground(new Color(123,50,250));


    }
}