import java.util.Scanner;

public class first{

    // first function named as summ which takes two parameters a & b
    public static int summ(int a , int b){

      // adding a and b and storing it into an variable name sum
      int  sum = a+b;

      // returning the value of sum to the calling function
       return sum;
    }
    public static void main(String[] args){

        //creating Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        //Taking the input of first variable from user
        System.out.println("Enter the first Number :");
        int a =sc.nextInt();

        //Taking the input of second variable from user
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        // calling the function named summ and passing the both the variables a and b and 
        //then storing the function in sum variable
        int sum = summ( a , b);

        //printing the sum variable
        System.out.println("Sum of two numbers are 23"+sum);

    }
}