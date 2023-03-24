public class ReverseDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static Node reverseDoubllyLL(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
       
        if(head == null ){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static void printDll(Node head){
        if(head == null){
            System.out.println("DLL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        printDll(head);
        
        printDll(reverseDoubllyLL(head));
    }
}
