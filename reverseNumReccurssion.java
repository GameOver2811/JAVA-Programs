import java.util.Scanner;

public class reverseNumReccurssion {
    public static void reverse(int num){
        if(num == 0){
            return;
        }
        System.out.print(num%10);
        reverse(num/10);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be Reversed : ");
        int num = sc.nextInt();
        reverse(num);

    }
}
