public class reverseLinkedList {
    public node head;
    public int size=0;
    class node{
        String data ;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        size++;
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public void addLast(String data){
        node newNode = new node(data);
        size++;
        node ptr = head;
        if(ptr == null){
            head = newNode;
            return;
        }
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("linked list not present ");
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("No linked list is there");
            return;
        }
        size--;
        node ptr = head;
        node str = head.next;
        while(str.next!=null){
            str = str.next;
            ptr = ptr.next;
        }
        ptr.next = null;
    }
    public void addMiddle(int index , String data){
        if(index  < 0 || index > size){
            System.out.println("Invalid Index");
            return;
        }
        node newNode = new node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        node ptr = head;
        for(int i = 0 ; i < size; i++){
            if(index == i){
                newNode.next = ptr.next;
                ptr.next = newNode;
                
            }
            ptr = ptr.next;
        }
        

    }
    public int sizeOfList(){
        return size;
    }
    
   
    public static void main(String[] args){
        reverseLinkedList n1 = new reverseLinkedList();
       n1.print(); 
        
    }
}
