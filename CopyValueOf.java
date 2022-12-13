public class CopyValueOf
{
	public static void main(String... s)
	{
		char[] str1={'h','e','l','l','o',' ','w','o','r','l','d'};
		String str2="";
		
		str2=String.copyValueOf(str1);
		System.out.println("Returned String:"+str2);
		
		str2=String.copyValueOf(str1,2,6);
		System.out.println("Returned String:"+str2);
	}
}
//Returned String:hello world
//Returned String:llo wo