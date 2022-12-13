import java .util.*;
public class Array1
{
	//int z[]=new int[10];
	//int z[]={10,20,30};
	int z[];
	public static void main(String... s)
	{
		System.out.println("enter the size of array");
		int x1=new Scanner(System.in).nextInt();
		ClassLevelArray o1=new int[x1];
		System.out.println(o1.z.getclass().getName());
		for(int i=0;i<o1.z.length;i++)
		{ 
	        o1.z[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<o1.z.length;i++)
		{
			System.out.println(o1.z[i]);
			System.out.println("  ");
		}
		for(int x:o1.z)
		{
			System.out.println(x);
			System.out.println("  ");
		}
		
			
		
		
	}
} //not compile