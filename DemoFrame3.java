import java.awt.*;
class DemoFrame3
{
	Frame f;
	Button b;
	Label l;
	TextField tf;
	DemoFrame3(String s)
	{
		f=new Frame(s);
		l=new Label("Enter the number");
		l.setBounds(40,40,80,20);
		f.add(l);
		tf=new TextField();
		tf.setBounds(150,40,50,20);
		f.add(tf);
		b=new Button("ok");
		b.setBounds(40,80,50,50);
	    f.add(b);
		Toolkit t=f.getToolkit();
		Dimension screenSize= t.getScreenSize();
		int width=screenSize.width * 8/10;
		int height=screenSize.height * 8/10;
		f.setBounds(400, 200,600, 400);
		      f.setLayout(null);
			  f.setVisible(true);
	}
public static void main(String... s)
	{
		new DemoFrame3("first frame");
	}	
}
