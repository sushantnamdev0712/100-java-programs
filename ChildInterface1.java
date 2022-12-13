interface My 
{
	void show ();
}
interface My1 extends My
{
void display();	
}
interface My2 extends My,My1
 {
	void xyz();
}
class ChildInterface1 implements My,My1
{
public void show() 
{
	System.out.println("show");
}	
public void display()
{
	System.out.println("display");
}
public static void main(String... s)
{
	My m=new ChildInterface1();
	m.show();
	My1 m1=new ChildInterface1();
	m1.show();
	m1.display();
}
}