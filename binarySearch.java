import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int arr[] , int key){
        int first = 0 , last = arr.length;
        while(first < last){
            int mid = (first + last)/2;
            if (key == arr[mid]){
                return mid;
            }else if(arr[mid] > key){
                last = mid -1;

            }else{
                first = mid +1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array : ");
        int size  = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of Array : ");
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to searched : ");
        int key = sc.nextInt();
        int index = binarySearch(arr , key);
        if(index == -1 ){
            System.out.println("Number is not found . . .");
        }else{
            System.out.println("Number found at index "+index);
        }
    }
}
