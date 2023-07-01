import java.util.Scanner;

public class fibbonacci {

    // creating a function for printing fibbonacci series
    public static void fib(int n) {

        // initializing variables
        int f = 0, s = 1, k;

        //printing fibbonacci series first two elements
        System.out.print("Fibbonacci Series : " + " ");
        System.out.print(" 0 1" + " ");

        // logic for printing fibbonacci series
        for (int i = 1; i < n - 1; i++) {
            k = f + s;
            System.out.print(k + " ");
            f = s;
            s = k;
        }
    }
    public static void main(String[] args) {

        // creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // printing an message to the output screen
        System.out.println("Enter the value till you want to print the fibbonnaci series :");

        // taking the number of terms in an fibbonacci series from the user
        int a = sc.nextInt();

        //calling fuction to print the series
        fib(a);

    }
}
