public class EqualsIgnoreCase
{
	public static void main(String... s)
	{
		String str1=new String("this is really not immutable!!");
		
		String str2=str1;
		
		String str3=new String("this is really not immutable!!");
		
		String str4=new String("THIS IS REALLY NOT IMMUTABLE!!");
		
		boolean retVal;
		
		retVal = str1.equals(str2);
		System.out.println("Returned value="+retVal);
		
		retVal = str1.equals(str3);
		System.out.println("Returned value="+retVal);
		
		retVal = str1.equalsIgnoreCase(str4);
		System.out.println("Returned value="+retVal);
	}
} 
//Returned value=true
//Returned value=true
//Returned value=true