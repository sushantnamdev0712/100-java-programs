class Temp{
	private final int x;
	 Temp(int x){
		this.x=x;
	}
	void show(){
		System.out.println(x);
	}
	public static Temp getinstance(int z)
	{
	return new Temp(z);
}
}
class Demo{
	public static void main(String... s){
		Temp t=new Temp(10);
		t.show();
	}
}