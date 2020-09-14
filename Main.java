import java.util.Scanner;

/**
 *This program says hello to the user and calculates their approximate age
 * @Chad 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    // declare a variable to store a name
    String userName;
   
   // asks user for their name
    System.out.println("Please enter your name:");
    // initialize the user's name
    userName = input.nextLine();
    // say hello to user 
    System.out.println("Hello " + userName + "!");

    // asks user for their year of birth
    System.out.println("Please enter the year you were born:");
    //declare and initialize the users birth year
    int birthYear = input.nextInt();
    
    //declare and initialize the current year
    final int CURRENT_YEAR = 2020;

    //delare and calculate the users age
    int age = CURRENT_YEAR - birthYear;

    //tells user their age
    System.out.println("You are " + age + " years old.");
  }
}
