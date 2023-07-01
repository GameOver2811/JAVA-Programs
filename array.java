import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        //declaring a new array of size 5
        int[] marks = new int[5];

        try (// creating Scanner object for taking user input
        Scanner sc = new Scanner(System.in)) {
            //printing an message for the user
            System.out.println("Enter the marks of student: ");

            //taking elements of array by the user
            for(int i = 0 ; i < marks.length ; i++){
                    marks[i]= sc.nextInt();
            }
        }

        // message for the user
         System.out.print("Marks of students are :"+" ");

         //printing the elements of the array
        for(int i = 0 ; i < marks.length ; i++){
            System.out.print(marks[i]+" ");
        }

    }
}
