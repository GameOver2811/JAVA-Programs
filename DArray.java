import java.util.Scanner;

public class DArray {
    public static void main(String[] args){

        // creating Scanner object for user input
        Scanner sc= new Scanner(System.in);

        //taking number of input from user
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        //taking  number of column as user input
        System.out.print("Enter the number of column : ");
        int m = sc.nextInt();

       // declaring two dimentional array using row and column
        int [][] matrix = new int[n][m];

        //taking element for 2-D array from user
        System.out.println("Enter the elements of 2-D array :");
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //printing two dimentional array as a matrix
        System.out.println("2-D Array :");
        System.out.println("A B C");
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }

            // for new line . . .
            System.out.println();
        }
       
    }
}
