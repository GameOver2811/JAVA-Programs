// .  . . . . . . . . not working properly . . . . . . .\\
import java.util.Scanner;

public class findingFirstAndLastOccurence {
    public static int first = -1 , last = -1;
    public static void findChar(int i , char ch , String str){
        if (i == str.length()){
            System.out.println("First occurence of the given char is at  : "+first);
            System.out.println("Last occurence of the given char is at : "+last);
            return ;
        }
        char currnChar  = str.charAt(i);
        if(currnChar == ch){
            if(first == -1){
                first = i ;
            }else{
                last = i;
            }
            findChar(i+1, ch, str);

        }
    }
    public static void main(String [] args){
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the char to be found : ");
        char ch = sc.next().charAt(0);
        int i = 0;
        findChar( i , ch , str);
    }
}
