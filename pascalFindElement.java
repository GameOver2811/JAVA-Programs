import java.util.Scanner;
public class pascalFindElement {
    public static int find(int r , int c){
        int num = 1 , den = 1;
        for(int i = 0 ; i < c ; i++){
            num *= r-i;
            den *= i+1;
        }
        return num/den;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = sc.nextInt();
        System.out.println("Enter Column number: ");
        int column = sc.nextInt();
        System.out.println(find(row-1 , column-1));
    }
}
