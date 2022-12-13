 class StringB
{
	public static void main(String... s)
	{
		//StringB Sb=new StringB();
		StringBuffer Sb = new StringBuffer();
		//StringBuffer sb=new StringBuffer("ducat");
		System.out.println(Sb.length());
		System.out.println(Sb.capacity());
StringBuffer Sb1=Sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
System.out.println("aftet append");
System.out.println(Sb.length());
System.out.println(Sb.capacity());

Sb.append("q");
System.out.println("aftet second append");
System.out.println(Sb.length());
System.out.println(Sb.capacity());
	}
}