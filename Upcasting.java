class Base
{
int x=20;
void show(int x)
{
System.out.println("base");
}
class Child extends Base
{
int y=30;
}
void show()
{
System.out.println("Child");
}
void display()
{
System.out.println("display");
}
public static void main(String... s)
{
//Base b=new Child();//upcasting
//b.show(10);
Child c=new (Child)b;//downcating
c.display();
System.out.println("b.x");
}
}