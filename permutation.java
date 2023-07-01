import java.util.Scanner;

public class permutation {
    public static void permutationStr(String Str,String per){
        if(Str.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i = 0 ; i < Str.length() ; i++){
            char currentChar = Str.charAt(i);
            String newString = Str.substring(0, i) + Str.substring(i+1);
            permutationStr(newString , per + currentChar);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for finding the permutation : ");
        String str = sc.nextLine();
        permutationStr(str,"");
    }
}
