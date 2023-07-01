import java.util.Scanner;

public class subSequence {
    public static void Subseq(String Str , String subSeq,int idx){
       if(idx == Str.length()){
        System.out.println(subSeq);
        return;
       }
       char ch = Str.charAt(idx);
       Subseq(Str, subSeq + ch, idx+1);
       Subseq(Str, subSeq , idx+1);

       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for finding the SUBSEQUENCE : ");
        String str = sc.nextLine();
        Subseq(str,"",0);
    }
}
