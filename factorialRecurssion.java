import java.util.Scanner;

public class factorialRecurssion {

    // function for calculating factorial it take num and fac as parameter
    public static void fac(int num,int fac){
        
        //checking base condition and then performing certain operation
        if(num > 0 ){
            fac = fac * num;
            num--;
            
            // calling recursively the same function
            fac(num,fac);
        }

        // print the factorial and return  to the main function
        else{
            System.out.println("Sum of natural numbers are : "+fac);
            return ;
        }
        
    }
    public static void main(String[] args){
      
        // scanner object for taking inout from the user
        Scanner sc = new Scanner(System.in);

        //taking number as an input for finding its factorial
        System.out.println("Enter the Number : ");
        int num  = sc.nextInt();

        //initializing fac with one . . . 
        int fac = 1 ;

        // calling the sum finction for calculating factorial . . .
        fac(num,fac);
    }
}


