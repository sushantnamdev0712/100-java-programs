class HarshadNumber
{
    public static void main(String...   s)
	{
        System.out.print("Enter any number: ");
		int n=new java.util.Scanner(System.in).nextInt(); 
        int dividend = n;
        int divisor;
        int count = 0;
        
        while (dividend > 1)
			{
            divisor=0;
            int t = dividend;
            while (t > 0)
			{
                int d = t % 10;
                divisor += d;
                t /= 10;
            }
            
            if (dividend % divisor == 0 && divisor != 1)
		    {
                dividend = dividend / divisor;
                count++;
            }
            else 
			{
                break;
            }
        }
        
        if (dividend == 1 && count > 1)
            System.out.println(n + " is Harshad Number");
        else
            System.out.println(n+ " is not Harshad Number");
    }
}