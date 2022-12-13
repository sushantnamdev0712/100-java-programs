public class Intern
{
	public static void main(String... s)
	{
		String Str1=new String("welcome to sajjanpur");
		String Str2=new String("Wlcome To place Of Sajjanpur");
		
		System.out.print("Canonical representation:");
		System.out.println(Str1.intern());
		
		System.out.print("Canonical representation:");
		System.out.println(Str2.intern());
	}
}