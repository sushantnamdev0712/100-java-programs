public class IndexOf{
	public static void main(String... s){
		String Str=new String("welcom to sajjanpur");
        String SubStr1=new String("sajjanpur");
		String SubStr2=new String("tanakpur");
		
		System.out.print("FOund index:");
		System.out.println(Str.indexOf('o'));
		System.out.print("FOund index:");
		System.out.println(Str.indexOf('o',5));
		System.out.print("FOund index:");
		System.out.println(Str.indexOf( SubStr1 ));
		System.out.print("FOund index:");
		System.out.println(Str.indexOf(SubStr1,15));
		System.out.print("FOund index:");
		System.out.println(Str.indexOf(SubStr2));

	}
}
/*FOund index:4
FOund index:8
FOund index:10
FOund index:-1
FOund index:-1
*/