import javax.swing.*;
import java.awt.*;
class Demo{
    public static void main(String args []){
        JFrame f1=new JFrame("Calculator");
        f1.setSize(400,400);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(2);
        
        JButton b1=new  JButton("North");
        b1.setText("North");
        f1.add("North",b1);
        JButton b2=new  JButton("South");
        b2.setText("South");
        f1.add("South",b2);
        JButton b3=new  JButton("East");
        b3.setText("East");
        f1.add("East",b3);
        JButton b4=new  JButton("West");
        b4.setText("West");
        f1.add("West",b4);
        JButton b5=new  JButton("Center");
        b5.setText("Center");
        f1.add("Center",b5);
        
        //f1.pack();
        f1.setVisible(true);
        
    }
}
