public class Startswith
{
	public static void main(String... s)
	{
		String Str=new String("Welcome to place sajjanpur");
         System.out.print("Return Value:");
		 System.out.println(Str.startsWith("Welcome"));
		 System.out.print("Return Value:");
		 System.out.println(Str.startsWith(" to place"));
		 System.out.print("Return Value:");
	     System.out.println(Str.startsWith("Welcome",11));


		 }
}
/*Return Value:true
Return Value:false
Return Value:false*/