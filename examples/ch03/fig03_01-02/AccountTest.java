// Fig. 3.2: Account2Test.java
// Creating and manipulating an Account2 object.
import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) { 
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an Account object and assign it to myAccount
      Account myAccount = new Account();

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n%n", myAccount.name);

      // prompt for and read name
      System.out.println("Please enter the name:");
       myAccount.name = input.nextLine(); // put theName in myAccount
      System.out.println(); // outputs a blank line

      // display the name stored in object myAccount
      System.out.printf("Name in object myAccount is:%n%s%n",
              myAccount.name);
   } 
} 
