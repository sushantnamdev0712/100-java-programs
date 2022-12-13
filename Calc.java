import java.awt.*;
class Calc 
{
Frame f;
Button b;
Label l;
TextField tf;
Calc(String s)
{	

 f=new Frame(s);
l=new Label("Enter the no.");      
l.setBounds(40,40,80,20);
f.add(l);
tf=new TextField();
tf.setBounds(150,40,50,20);
f.add(tf);
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 b=new Button("ok");
 
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
b.setBounds(40,100,50,50);
f.add(b);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);

}

public static void main(String s[])
{
new Calc("Calculator");
}
}