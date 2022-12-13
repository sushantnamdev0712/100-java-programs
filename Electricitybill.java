import java.util.*;
class Electricitybill
{
String n;
int units;
double bill;
void bro()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the name of custmor");
n=in.nextLine();
System.out.println("enter the number of  units ");
units=in.nextInt();
}
void calculate()
{
if(units<=50)
bill=2*units;
else if(units>50 && units<=300)
bill=2*50+(units-250)*3;
else if(units>300 && units<=350)
bill=2*50+3*250+(units-300)*4;
else if(units>350 && units<=400)
bill=2*50+3*250+4*100+(units-350)*5;
else if(units>400 && units<=600)
bill=2*50+3*250+4*100+(units-400)*6;
bill=bill+18*bill/100;
 
}
void print()
{
System.out.println("name of the custmor:"+n);
System.out.println("number of units:"+units);
System.out.println("bill amount:"+bill);
}

public static void main(String...   s)
{
Electricitybill obj=new Electricitybill();
obj.bro();
obj.calculate();
obj.print();

}
}