public class LinkedListIsCycle{ 
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static boolean isCycle(Node head){  //Floyd's cycle finding algorithm
        if(head == null){
            System.out.println("LL is  empty");
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2

            if(slow == fast){  // cycle exists
                return true;
            }
        }
        return false; // if cycle doesn't exists
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    public static void printLL(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }
    public static void main(String[] args) {
        // LinkedListIsCycle ll =new LinkedListIsCycle();
        // addLast(1);
        // addLast(2);
        // addLast(3);
        // addLast(4);
        // addLast(5);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // printLL(head);
        System.out.println(isCycle(head));
        
    }
}