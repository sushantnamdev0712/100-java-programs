import java.util.Arrays;
public class ArrayMini
{
	static int min;
	public static void min(int my_array[])
	{
		min = my_array[0];
		int len = my_array.length;  
		
		for(int i=1 ; i < len-1 ; i++) 
		{
			if(i+1>len)
			{
				if(my_array[i]<min)min=my_array[i];
			}
			if(my_array[i] > my_array[i+1])
			{
				if(my_array[i+1]<min)min=my_array[i+1];
			}
			if(my_array[i]<min)min=my_array[i+1];
			{
				if(my_array[i]<min)min=my_array[i];
			}
			
		}
	}
	public static void main(String... s)
	{
		int[] my_array={25,14,56,15,36,84,48,67,46};
		min(my_array);
		System.out.println(" Original Array: "+Arrays.toString(my_array));
	System.out.println(" Minimum value for the above array= "+ min);
	}
}
/*Original Array: [25, 14, 56, 15, 36, 84, 48, 67, 46]
 Minimum value for the above array= 14*/