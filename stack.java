import java.util.*;
public class stack {
    static class Stack{
        static ArrayList<Integer> arr = new ArrayList<>();
        static void push(int data){
            arr.add(data);
        }
        static int pop(){
            if(isempty()){
                return -1;
            }
            int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        static int peek(){
            if(isempty()){
                return -1;
            }
            return arr.get(arr.size()-1);
        }
        static boolean isempty(){
            return arr.size() == 0;
        }

    }
    public static void main(String[] args){
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.pop();
        while(!sc.isempty()){
            System.out.println(sc.peek());
            sc.pop();
        }

    }
}
