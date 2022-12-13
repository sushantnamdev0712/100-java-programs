class Prime
{
public static void main(String...   S)
{
int n,i,j;
System.out.println("Enter any number");
n=new java.util.Scanner(System.in).nextInt();
for(i=1;i<=n;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.println(j+"");
}
}
}