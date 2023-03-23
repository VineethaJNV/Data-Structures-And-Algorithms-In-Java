public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){ //O(n)
        //creating new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
    
        //Making link
        newNode.next = head;

        //making newNode as head
        head = newNode;

    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
       
        temp.next = newNode;
        newNode.next = null;
    }
    public static void addInMiddle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < idx-1){ // prev = i-1
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
         else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        Node prev = head;

        for(int i = 0 ; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static int iterativeSearch(int key){ //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void recSearch(Node head, int key, int idx){// O(n)
        if(head == null){
            return;
        }
        if(head.data == key){
            System.out.println("Key is found at "+idx);
        }
        recSearch(head.next, key, idx+1);
    }
    public static void printLL(Node head){ //O(N)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        printLL( head);
        addLast(10);
        printLL( head);
        addInMiddle(100, 2);
        printLL( head);
        System.out.println("data of removed first node is" + removeFirst());
        printLL(head);
        removeLast();
        printLL(head);
        System.out.println("Key is found at"+iterativeSearch(100));
        recSearch(head, 100, 0);



        
    }
}