import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{ 
Frame f;
TextField tf;
Button[] numberButton = new Button[10];
Button[]functionButtons = new Button[8];
Button addButton,subButton,mulButton,divButton;
Button decButton,euqButton,delButton,clrButton;
//Panal p;
Font myFont =new font("Ink fre",Font.BOLD,30);

double num1=0,num2=0,result=0;
char operater;

 Calculator(){
       f = new Frame("Caculator");
	 f.setSize(420,550);
	 f.setLayout(null);
	 tf=new TextField();
	 tf.setBounds(50,25,300,50);
	 tf.setFont(myFont);
	 tf.setEditable(false);
	 f.setVisible(true);
	 
	 }
	 public static void main(String... s){
		 Calculator calc = new Calculator();
		 
	 }
}