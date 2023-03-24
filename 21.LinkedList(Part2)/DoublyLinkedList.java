public class DoublyLinkedList {
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
    public static int  size;
    
    //addFirst
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null ){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public static int  removeFirst(Node head){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;

    }
    public static int removeLast(){
        if(head == null){
           return Integer.MIN_VALUE;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;
    }
    public static void printDLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        // dll.printDLL(head);
        //    System.out.println( dll.removeFirst(head));
        dll.addLast(10);
        printDLL(head);
        System.out.println(removeLast());
        printDLL(head);

    }
}
