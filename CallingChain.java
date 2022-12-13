class CallingChain{
	void show()
	{
		int x=10/0;
	}
	void display()
	{
		show();
	}
	void xyz(){
		display();
	}
	public static void main(String... s){
		try{
			new CallingChain().xyz();
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
/*
C:\javaprogram>javac CallingChain.java

C:\javaprogram>java CallingChain
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
        at CallingChain.show(CallingChain.java:4)
        at CallingChain.display(CallingChain.java:8)
        at CallingChain.xyz(CallingChain.java:11)
        at CallingChain.main(CallingChain.java:15)

C:\javaprogram>javac CallingChain.java
*/
