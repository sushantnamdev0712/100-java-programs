class StringBInsert
{
public static void main(String... s)
{
StringBuffer sb=new StringBuffer("I java");
System.out.println(sb);
System.out.println(Sb.length());
System.out.println(Sb.capacity());
StringBuffer sb1=sb.insert(2,"like");
System.out.println(sb);
sb1=sb.replace(2,6,"love");
System.out.println(Sb);
sb1=sb.delete(2,6);
System.out.println(Sb);
sb1=sb.reverse();
System.out.println(Sb);
if(sb1==sb)
System.out.println("One object");
}
}