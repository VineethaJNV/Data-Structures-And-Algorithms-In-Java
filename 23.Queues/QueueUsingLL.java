public class QueueUsingLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void add(int data){ //O(1)
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }
    public static int remove(){ //O(1)
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        if(head == tail){
            int front = head.data;
            head = tail = null;
            return front;
        }
        int result = head.data;
        head = head.next;
        return result;
    }
    public static void printQ(){ //O(1)
        if(head == null){
            System.out.println("Queue is empty");
        }
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static int peek(){ // O(1)
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        return front;
    }
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.add(1);
        q.add(2);
        q.add(3);
        printQ();
        q.remove();
        q.remove();
        printQ();
        q.add(4);
        printQ();

        
    }
}
