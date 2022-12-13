import java.io.*;
class ThrowsException{
	static void show()throws IOException
	{
	throw new IOException("throws example");	
	}
	public static
	void main(String... s){
		try{
			show();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}