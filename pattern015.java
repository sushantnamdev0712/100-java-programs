class Pattern015
{
	public static void main(String... s)
	{
		int i,j,rows=5;
		for(i=1;i<=rows;i++)
		{
			for(j=i;j<=rows;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println("");
		}
	}
}
/*
ABCDE
BCDE
CDE
DE
E
*/