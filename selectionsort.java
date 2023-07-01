import java.util.Scanner;

public class selectionsort {
    public static void  selectionsorting(int []arr){
          for( int i = 0 ; i < arr.length - 1 ; i++){
            for( int j = i ; j < arr.length  ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
          }
    }
    public static void print(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
     }
     System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter elements of Array : ");
        for(int i = 0 ; i < size ; i++){
               arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array : ");
        print(arr);
        System.out.println("Sorted Array : ");
        selectionsorting(arr);
        print(arr);

    }
}
