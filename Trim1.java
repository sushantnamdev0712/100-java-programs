public class Trim1
{
	public static void main(String... s)
	{
		String Str=new String(" Welcome to Totorials of String ");
		System.out.println(Str );
		System.out.println("before trim"+Str.length());
			  System.out.println("Return Value:");
			  String z=Str.trim();
			  System.out.println(z);
			  System.out.println("after trim"+z.length());
	}
}/*Welcome to sajjanpur of String
before trim30
Return Value:
Welcome to sajjanpur of String
after trim30*/