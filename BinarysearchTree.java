import javax.naming.directory.SearchControls;

public class BinarysearchTree {

    public static class node{
        int data;
        node left , right ;

        node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    public static node buildTree(int num , node root){
        if(root == null) {
            root = new node(num);
            return root;
        }
        if(num > root.data){
            root.right = buildTree(num, root.right);
        }
        else if(num < root.data){
            root.left = buildTree(num, root.left);
        }
        return root;
    }


    public static void inorderTraversal(node root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    public static boolean search(node root , int val){
        if(root == null) return false;
        if(root.data == val) return true;
        if(root.data > val){
            return search(root.left, val);
        }
        return search(root.right, val);
        
    } 
    public static void main(String[] args){
        int [] list = {9,1,2,5,4};

        node root =null;

        for(int i = 0 ; i < list.length ; i++){
             root = buildTree(list[i] , root);
        }
        inorderTraversal(root);
        System.out.println();
        boolean result = search(root , 9);
        if(result == true) System.out.println("present");
        else System.out.println("Absent");
    }
}
