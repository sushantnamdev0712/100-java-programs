class Pattern7
{
    public static void main(String[] args)
    {
        int i,j,row=5,colum=5,alphabet = 65;
        
        for ( i = 0; i <row; i++)
        {
            for (j = 0; j <colum; j++)
            {
                System.out.print((char) (alphabet + j) + "");
            }
            System.out.println();
        }
    }
}
/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/