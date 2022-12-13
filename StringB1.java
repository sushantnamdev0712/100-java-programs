class stringB1
{
   public static void main(String... s)
   {
	    StringBuffer sb=new StringBuffer();
	   	//StringBuffer sb=new StringBuffer(20);
		//StringBuffer sb=new StringBuffer("ducat");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaaa");
		System.out.println("aftet append");
		System.out.println(sb.length());
        System.out.println(sb.capacity());
		//sb.append("q");
	//System.out.println("aftet second append");
	//System.out.println("sb.length()");
	//System.out.println("sb.capacity()");
	
   }
}