import java.util.Scanner;

public class strings{
    public static void main(String args[]){

        // Scanner object with a name "sc"
        Scanner sc = new Scanner(System.in);

        //print statement to print a message
        System.out.println("Enter your name :");

        //Taking string as a input from user using Scanner object 
        String Name = sc.nextLine();

        //printing String namely Name 
        System.out.println(Name);

        // printing the length of the String
        System.out.println(Name.length());

        //printing the charater at any particular index
        System.out.println(Name.charAt(0));

        // string manipulation / trimming using substring function
       System.out.println( Name.substring(0,8));
    }
}