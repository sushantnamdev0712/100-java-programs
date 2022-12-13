public class LastIndexOf
{
	public static void main(String... s)
	{
		String Str=new String("welcom to sajjanpur");
        String SubStr1=new String("sajjanpur");
		String SubStr2=new String("tanakpur");
		
		System.out.print("Found Last index:");
		
		System.out.println(Str.lastIndexOf('o'));
		
		System.out.print("Found Last index:");
		
		System.out.println(Str.lastIndexOf('o',10));
		
		System.out.print("Found Last index:");
		
		System.out.println(Str.lastIndexOf( SubStr1 ));
		
		System.out.print("Found Last index:");
		
		System.out.println(Str.lastIndexOf(SubStr1,15));
		
		System.out.print("Found Last index:");
		
		System.out.println(Str.lastIndexOf(SubStr2));

	}
}