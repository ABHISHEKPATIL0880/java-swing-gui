import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.*;


public class label {
    public  static void main(String[] args){
        //JLabel= a gui display area for a string of text,an image,or both

     ImageIcon image =new ImageIcon("src/dude.jpeg");
        Border Abhishek=BorderFactory.createLineBorder(Color.GREEN,5);



       JLabel label=new JLabel();//in creating instance we can write Text in (......text......)
       label.setText("Brother, Do You Even Code ?");
       label.setIcon(image);
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setForeground(new Color(100,250,55));
       label.setFont(new Font("My Boli",Font.PLAIN,20));
       label.setIconTextGap(-1);
       label.setBackground(Color.black);
       label.setOpaque(true);
       label.setBorder(Abhishek);
       label.setVerticalAlignment(JLabel.CENTER);
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setBounds(0,0,500,478);//set x and y position within frame as well as dimension & before you need intalize the frame.setLayout(null);


        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.add(label);
        frame.setBackground(Color.CYAN);
        frame.setLayout(null);

    }
}
