import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame("Calculator");	
		f1.setSize(400,400);
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f1.setLayout(new GridLayout(4,4));
		
		JButton[] btArray=new JButton[16];
		String[] buttonText={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"}; 
		for (int i = 0; i < btArray.length; i++){
			btArray[i]=new JButton(buttonText[i]);
			btArray[i].setFont(new Font("",1,30));
			f1.add(buttonText[i],btArray[i]);
		}
		f1.setVisible(true);
	}
}
