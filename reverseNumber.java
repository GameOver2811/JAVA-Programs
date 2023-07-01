import java.util.Scanner;

public class reverseNumber {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        System.out.println(res);

}
}
