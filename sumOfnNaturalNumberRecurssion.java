
import java.util.Scanner;

import javax.swing.undo.StateEdit;

public class sumOfnNaturalNumberRecurssion {
    public static void sum(int num,int sum){
        
        if(num > 0 ){
            sum = sum + num;
            num--;
            
            sum(num,sum);
        }
        else{
            System.out.println("Sum of natural numbers are : "+sum);
            return ;
        }
        
    }
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Upper Limit : ");
        int num  = sc.nextInt();
        int sum = 0 ;
        sum(num,sum);
    }
}
