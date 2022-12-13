// getters & setters
class Account{
    public String name;
    protected String email;
    private int number;
    public int getNumber(){
        setNUmber(int ramndomnumber);
        return this.number;
    }
   // private void  setNUmber(int num){
         //  this.number=num;
    }

}
public class BankAccount {
    public static void main(String[] args) {
      Account account = new Account();
      account.name="lkjfgkl";
      account.email="kdljfhsdlkjfh";
       //account.setNUmber(345465656);
      System.out.println(account.getNumber());
      System.out.println(account.name);

    }
}
