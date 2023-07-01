import java.util.Scanner;

public class reverseTheArray {
    public static void main(String[] args){

        // making the Scanner object for taking input by the user
        Scanner sc = new Scanner(System.in);

        //printing the message to the users
        System.out.print("Enter the size of array :");

        //taking the size of input from the user
        int size = sc.nextInt();

        //declaring the array of size entered by the user
        int [] arr = new int [size];

        // Entering the elements of the array (from user)
        for( int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        //printng the original array entered by the user
        System.out.print("Original Array : ");
        for(int i  = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");
        }

        // just for changing the line
        System.out.println();

        //logic for reversing the array 
        for (int i = 0 ; i <= size/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;

        }

        // printing the reversed array 
        System.out.print("Reversed Array : ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
