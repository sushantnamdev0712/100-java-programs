import java.util.Scanner;

public class MIniProject {
      public static void main(String[] args) {
        int MyNumber=(int)(Math.random()*100);
       Scanner sc=new Scanner(System.in);
       int UersNUmber=0;
        do{
            System.out.println("guess My Number"); 
            UersNUmber =sc.nextInt();
            if(UersNUmber==MyNumber){
                System.out.println("woohooo your number is correct");
                break;
            }else if(UersNUmber>MyNumber){
                System.out.println("your number is larg");
            }else{
                System.out.println("your number is small");
            }

    } while(UersNUmber>=0);{
        System.out.println("my number is");
        System.out.println(MyNumber);
    }
    }
}
