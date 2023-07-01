import java.util.Scanner;

public class fibbonaciRecurssion {
    public static void fib(int a , int b , int num){
        if(num == 0 ){
            return;
        }
        System.out.print(a+b+" ");
        fib(b,a+b,num-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int num = sc.nextInt();
        int a = 0, b =1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a,b,num-2);
        
    }
}
