abstract class Base{
	int x;
	int y;
	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	abstract void display();
}
class MyRegister{
	void register(Base b)
	{
		b.display();
	}
}
class Child extends Base{
	void get(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("display");
	}
	public static void main(String... n){
		Child c1=new Child();
		//c1.get(10,20);
		//c1.show();
		//c1.display();
		MyRegister m=new MyRegister();
		m.register(c1);
	}
}