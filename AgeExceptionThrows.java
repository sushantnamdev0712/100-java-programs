class Emp 
{
	int age;
	void get(int age)throws AgeException
	{
		if(age<18)
		{	
	      throw new AgeException("Invalid age");
		}
		else
			this.age=age;
			{
				System.out.println("u r aligble for vote");
}}
			public static void main(String... n){
				Emp e1=new Emp();
				try
				{
					e1.get(10);
				}
				catch(AgeException e)
				{
				System.out.println(e);	
				}
			}
}
class AgeException extends Emp
{
   AgeException(String s)
   {
	   super(s);
   }   
}