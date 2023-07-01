import java.util.Scanner;

public class linearSearchIn2dArray {

    //Creating a function for linear search in 2-D Array
    public static void linearSearchIn2dArray(int matrix[][],int num,int n,int m){

        // Logic for linear search 
        // First loop for Row 
        for(int i =0 ; i <n ;i++){

            //second loop is for column
            for(int j = 0; j < m ; j++){

               if(num==matrix[i][j]){

                //printing number found 
                System.out.println("Entered number is found at index :("+(i+1)+","+(j+1)+")");

                // then returning the control back to the calling function
                return;
               }
            } 
        } 
        // printing not found 
        System.out.print("No element is "+num+" in this given 2d array. . ."); 
    }

    public static void main(String[] args){

        //creating a Scanner object for user input
        Scanner sc=new Scanner(System.in);

        // taking row number as input by the user
        System.out.print("Enter the value of rows :");
        int n = sc.nextInt();

        //taking column number input by the user
        System.out.print("Enter the value of column :");
        int m = sc.nextInt();

        //declaring the array(2-D) using the user inputs
        int[] []matrix = new int[n][m];

        //Taking elements of 2-D Array input by the user
        System.out.println("Enter the elements in @d array :");
        for(int i =0 ; i <n ;i++){
            for(int j = 0; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Taking the input of the number which has to be found
        System.out.print("Enter the number to be found :");
        int num = sc.nextInt();

         //calling the function to search in 2-D array 
        linearSearchIn2dArray(matrix,num,n,m);
    }
}
