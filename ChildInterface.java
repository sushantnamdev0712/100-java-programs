interface My
{
	void show();
}

class MyRegister
{
	public void register(My z)
	{
		z.show();
	}
}
class ChildInterface implements My
{
	public void show()
	{
		System.out.print("show");
	} 
	public static void main(String...  s)
	{
		ChildInterface c1=new ChildInterface();
		//MyRegister mr=new ChildInterface();
		//mr.register(c1);
		My m=new ChildInterface();
		m.show();
	}
}