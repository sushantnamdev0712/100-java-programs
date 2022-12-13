class MyGc
{
	int x=19;
	public void finalize()throws Throwable 
	{
		System.out.println("finalize method");
		System.out.println(Thread.currrntThread().getName());
	}
	public static void main(System...  s)
	{
		int x=1024*1024;
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.totalmemory()/z);
		System.out.println(rt.freememory()/z);
		MyGc m;
	}
}