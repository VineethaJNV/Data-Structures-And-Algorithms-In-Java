public class FindAndRemoveNthNodeFromLast { //Amazon, Qualcomm, Flipkart, Adobe
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void addLast(int data){
        Node newNode = new Node( data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

    }
    public static int removeNthFromEnd(int n){  //O(n)
        int size = 0;
        Node temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }
        int idx = size - n -1;
        temp = head;
        
        for(int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }
        int val = temp.data;
        temp.next = temp.next.next;
        return val;

    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    

    
    public static void main(String[] args) {
        FindAndRemoveNthNodeFromLast ll = new FindAndRemoveNthNodeFromLast();
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        printLL(head);
        removeNthFromEnd(2);
        printLL(head);
        
    }
}
