class FunOver
{
static void show()
{
System.out.println("zero argument");
}
static void show(int x)
{
System.out.println("one argument");
}
static void show(int x,int y)
{
System.out.println("two argument");
}
static void show(int x,int y, int z)
{
System.out.println("three argument");
}

public static void main(String...  s)
{
show();
show(10);
show(10,10);
show(10,10,10);
}
}