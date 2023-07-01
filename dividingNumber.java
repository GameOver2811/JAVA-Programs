import java.util.Scanner;

public class dividingNumber {

    //function for dividing two numbers
    public static int divide(int dividend, int divisor) {

        //checking the limits for both divident and divisor
        if(dividend >= Integer.MIN_VALUE && divisor <= Integer.MAX_VALUE && divisor != 0){
            int quotient = dividend / divisor ; 

            //returning quotient 
            return quotient;
        }
        else{
            //if above condition doesn't satisfies return 0 
            return 0 ;
        }
        
    }
    public static void main(String[] args){

        //creating the Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Scanning value of dividend from user
        System.out.print("Enter the value of Dividend : ");
        int dividend = sc.nextInt();

        //Scanning value of divisor from user
        System.out.print("Enter the value of Divisor : ");
        int divisor = sc.nextInt();

        //calling divide function and saving the returning value in quotient
        int quotient = divide(dividend,divisor);

        //printng the Quotient
        System.out.println(quotient);
    }
} 
    

