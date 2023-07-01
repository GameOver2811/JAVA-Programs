import java.util.Scanner;

// Function for bubble sorting 
public class bubblesort {
    public static void  bubblesorting(int []arr){

        // logic for bubble sorting 
        //first for loop for passes. . .
        for( int i = 0 ; i < arr.length - 1 ; i++){

            //Second for loop is for comparision
          for( int j = 0 ; j < arr.length - i -1  ; j++){
              if(arr[j]>arr[j+1]){

                //swaping numbers using third variable . . .
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
              }
          }
        }
  }

  //function for printing array . . . 
  public static void print(int [] arr){
      for(int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i]+" ");
   }

   // for printing new line . . .
   System.out.println();
  }

  public static void main(String[] args){

    // creating scanner object for user input
      Scanner sc = new Scanner(System.in);

      //message . . . for user . . .
      System.out.println("Enter the size of Array :");
      int size = sc.nextInt();

      //declaration of array of inputted size . . .
      int [] arr = new int [size];
      System.out.println("Enter elements of Array : ");

      // taking array elements as input
      for(int i = 0 ; i < size ; i++){
             arr[i] = sc.nextInt();
      }

      // message for the user . ..
      System.out.println("Unsorted array : ");

      // calling print function for printing array
      print(arr);

      //message for user . . .
      System.out.println("Sorted Array : ");

      //calling bubble sorting for sorting the array . . .
      bubblesorting(arr);

      // again calling the print function for printing the array . . . 
      print(arr);

}
}
