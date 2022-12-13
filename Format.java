//import java.util.*;
public class Format
{
	public static void main(String... s)
	{
		float floatVar=2.4f;
		
		int intVar=10;
		
		String stringVar="HINDUSTAN";
		
		System.out.printf("THE VALUE OF THE FLOAT VARIABLE IS=%f,WHILE THE VALUE OF THE intger variable is=%d,and the String is=%s",floatVar,intVar,stringVar);
		
		String fs=String.format("THE VALUE OF THE FLOAT VARIABLE IS=%f,WHILE THE VALUE OF THE intger variable is=%d,and the String is=%s",floatVar,intVar,stringVar);
       
	    System.out.println(" ");
		
		System.out.println(fs);
	}
}
//THE VALUE OF THE FLOAT VARIABLE IS=2.400000,WHILE THE VALUE OF THE intger variable is=10,and the String is=HINDUSTAN
//THE VALUE OF THE FLOAT VARIABLE IS=2.400000,WHILE THE VALUE OF THE intger variable is=10,and the String is=HINDUSTAN
