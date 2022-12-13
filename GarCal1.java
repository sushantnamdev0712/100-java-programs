 class Demo{
	 int x=10;
	 int y=20;
	 }
	 class Temp extends Demo{
		 static void show(){
			 Demo d2=new Demo();
			 display();
		 }
		 static void display(){
			 Demo d3=new Demo();
		 }
		 public static void main(String... s)
		 {
			 Demo d1=new Demo();
			 show();
		 }		 
	 }