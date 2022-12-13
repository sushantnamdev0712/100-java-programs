class GetBytes
{
	public static void main(String... s)
	{
		String Str1=new String("welcome to sajjanpur");
		try
		{
		byte[] Str2=Str1.getBytes();
		for(int i=0;i<Str2.length;i++)
		{
			System.out.println(Str2[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println("unsupported Character set");
		}
	}
}	
/*119
101
108
99
111
109
101
32
116
111
32
115
97
106
106
97
110
112
117
114
*/