import javax.swing.*;
import java.awt.*;
class Calculator{
	JFrame f2;
	Calculator(){}
	Calculator(String name){
		f2=new JFrame(name);
	}
	public void setSize(int length,int width){
		f2.setSize(length,width);
	} 
	public void setLocationRelativeTo(Component location){
		f2.setLocationRelativeTo(location);
	}
	public void setDefaultCloseOperation(int operation){
		f2.setDefaultCloseOperation(operation);
	}
	public void setVisible(boolean isVisible){
		f2.setVisible(isVisible);
	}
}
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("JFrame");
		f1.setSize(300,300);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		
		Calculator c1=new Calculator("Calculator");
		c1.setSize(300,300);
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setVisible(true);
	}
}
