import java.util.Scanner;

public class towerOfHanoi{
    static int count = 0;
    public static int hanoi(int num, char S , char H , char D){
        if(num == 0) return count;
        hanoi( num-1, S, D, H);
        System.out.println(S+" to "+D);
        count++;
        hanoi(num-1, H, S, D);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disk : ");
        int num = sc.nextInt();
       int move =  hanoi(num,'A','B','C');
       System.out.println("Moves required for "+num+" disk is "+move);
    }
}
