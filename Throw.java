class ThrowEx {
	int age;
	void getAge(int age)
	{
		if(age<18){
			try
			{
				throw new ArithmeticException("Invalid age");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e);
			}
		}
		else
			this.age=age;
			{
				System.out.println("u r aligble for vote");
			}
	}
	public static void main(String... s){
		new ThrowEx().getAge(18);
	}

}