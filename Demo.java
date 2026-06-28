import javax.swing.*;
import java.awt.*;
class Demo{
    public static void main(String args []){
        JFrame f1=new JFrame("Calculator");
        f1.setSize(400,400);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(2);
        f1.setLayout(new FlowLayout(FlowLayout.LEFT));
        //0->FlowLayout.CENTER
		//1->FlowLayout.RIGHT
		//2->FlowLayout.LEFT

        JButton b1=new  JButton("Add");
        b1.setFont(new Font("",1,30));
        f1.add(b1);
        JButton b2=new  JButton("Delete");
        b2.setFont(new Font("",1,30));
        b2.setSize(300,400);
        f1.add(b2);
        JButton b3=new  JButton("Update");
        b3.setFont(new Font("",1,30));
        f1.add(b3);
        JButton b4=new  JButton("View");
        b4.setFont(new Font("",1,30));
        f1.add(b4);
        
        
        //f1.pack();
        f1.setVisible(true);
        
    }
}
