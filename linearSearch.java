import java.util.Scanner;

public class linearSearch {

    //creating a function for linear search
    public static int ls(int list[], int num, int len) {

        //logic for linear search . . .
        for (int i = 0; i < len; i++) {
            if (num == list[i]) {

                //if number found in array then return value of index to the calling function
                return i;
            }
        }

        //printing message if number is not found 
        System.out.println("Number is not there in your list . . .");

        //return -1 in not found case
        return -1;
    }

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Display message to user . . .
        System.out.print("Enter the Size of array :" + " ");

        // user input for array size
        int size = sc.nextInt();

        //declaring array of size entered by the user
        int[] list = new int[size];

        //inputting array elements from user
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        // Taking number as a input which has to be searched . . .
        System.out.print("Enter the number to be searched :" + " ");
        int num = sc.nextInt();

        //calling the ls function and storing the returning value in INdex
        int Index = ls(list, num, list.length);

        // printing the final output
        if(Index==-1){
            System.out.println("");
        }
        else{
            System.out.println("The number " + num  + " is found at " + Index);
        }
    }
}
