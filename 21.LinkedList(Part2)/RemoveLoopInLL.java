public class RemoveLoopInLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next  =null;
        }
    }
    public static Node head;
   
    public static void removeCycle(Node head){
        if(head == null){
            System.out.println("LL is empty");
        }
        //detecting if cycle exists
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
     
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            fast = fast.next;
            slow =slow.next;
        }
        prev.next = null; //removing cycle
        
    }
    public static void printLL(Node head){
        if(head == null){
            System.out.println("LL is empty");
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
        Node head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        // removeCycle(head);
        printLL(head);
        
    }
    
}
