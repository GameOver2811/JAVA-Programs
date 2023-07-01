import java.util.Scanner;

public class printingNumberFrom5to0UsingRecurssion {
      public static void printRecurssion(int num){
        if(num >= 0){
            System.out.println(num);
            num--;
            printRecurssion(num);
        }
        else{
            return;
        }
      }
    public static void main(String[] args){
        System.out.println("Printing the value from given number to zero :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printRecurssion(num);
    }
}
