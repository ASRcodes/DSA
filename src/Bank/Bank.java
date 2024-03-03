package Bank;
//Access modifiers public,private & protected......
class Account{
//   public keyword is used so that any class can access this and different packages also
   public String moneyMatters;
//   protected vars can be accessed by the current packages can the sub-class of diff packages
   protected String moneyIsIMP;
//   privates can only be accessed inside class
   private String password;
//   privates can be accessed using getter and setters
//   So for that we'll create a getter and setter function
   public String getPassword(){
      return this.password;
   }
//   by making the setter fun private we can restrict to change its value in function call
//   private void setPassword(String password){
//      this.password = password;
//   }
   public void setPassword(String password){
      this.password = password;
   }

}
public class Bank {
   public static void main(String[] args) {
      Account account = new Account();
      account.moneyIsIMP = "Anubhav have";
      account.setPassword("457788");
      System.out.println(account.getPassword());

   }


}
