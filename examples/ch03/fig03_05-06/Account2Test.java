// Fig. 3.6: Account2Test.java
// Using the Account2 constructor to initialize the name instance
// variable at the time each Account2 object is created.

public class Account2Test {
   public static void main(String[] args) { 
      // create two Account2 objects
      Account2 account1 = new Account2("Jane Green");
      Account2 account2 = new Account2("John Blue");

      // display initial value of name for each Account2
      System.out.printf("account1 name is: %s%n", account1.getName());
      System.out.printf("account2 name is: %s%n", account2.getName());
   } 
}
