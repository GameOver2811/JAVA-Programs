import java.util.Scanner;

public class fac {
    
    // function for calculating factorial
    public static int facto(int a){

        // declaring a variable and initializing it with a value
        int fac = 1;

        // using for loop for repeating some line of codes
       for(int i=a ; i>0 ; i--){
        fac = fac * i;
       }

       // returing the value of fac to the calling function
       return fac;

    }
    public static void main(String[] args){

        // creating a Scanner object for taking input 
        Scanner sc =new Scanner(System.in);

        // print statement
        System.out.print("Enter the number for finding factorial : ");

        // Taking a number as an input
        int a =sc.nextInt();

        //printing and calling a facto function simultaneously
        System.out.println("Factorial of the entered number is : "+ facto(a));
    }
}
