public class GetChar
{
	public static void main(String... s)
	{
		 String Str1=new String("welcome to sajjanpur");
		 char[]Str2=new char[7];
		char c[]=Str1.toCharArray();
		try
		{
			Str1.getChars(2,9,Str2,0);
			System.out.print("Copied value=");
			for(int i=0;i<Str2.length;i++)
				System.out.print(Str2[i]);
				System.out.println("");
				for(int i=0;i<c.length;i++)
				System.out.print(c[i]);
		}
			catch(Exception ex)
			{
				System.out.println("Raised exception...");
			}
	}
}
//Copied value=lcome t
//welcome to sajjanpur