// Fig. 3.5: Account2.java
// Account2 class with a constructor that initializes the name.

@SuppressWarnings("ClassCanBeRecord")
public class Account2 {
   private final String name; // instance variable

   // constructor initializes name with parameter name
   public Account2(String name) { // constructor name is class name
      this.name = name;
   }

   // method to retrieve the name
   public String getName() {
      return name; 
   } 
}
