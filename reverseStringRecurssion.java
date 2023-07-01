import java.util.Scanner;

public class reverseStringRecurssion {

    public static void reverse(String str, int i){
        if(i < 0){
            return;
        }
        char j = str.charAt(i);
        System.out.print(j);
        reverse(str,i-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        reverse(str,str.length()-1);
    }
}
