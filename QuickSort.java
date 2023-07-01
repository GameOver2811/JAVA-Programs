public class QuickSort {
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high] , j = low-1;
        for(int i = low ; i < high ; i++){
            if(arr[i] < pivot){
                j++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[high];
        arr[high] = arr[j];
        arr[j] = temp;
        return j;

    }
    public static void quickSort(int [] arr , int low , int high){
        if(low < high){
            int pivotIndex = partition(arr , low , high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args){
        int [] arr = {1,5,2,6,2,9,7};
        quickSort(arr , 0 , arr.length-1);
        for( int i : arr){
            System.out.print(i+" ");
        }
    }
}
