import java.util.Stack;

public class stackUsingLinkedList {
    public static node head=null;
   static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next=null;
        }

    }
    static class Stack{
        static boolean isempty(){
            return head == null;
        }
    static void push(int data){
        node newNode = new node(data);
        if(isempty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    static int pop(){
        int data = head.data;
        head = head.next;
        return data;
    }
    static int peek(){
        return head.data;
    }
    }
    public static void main(String[] args){
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        while(!sc.isempty()){
            System.out.println(sc.pop());
        }
    }
}
