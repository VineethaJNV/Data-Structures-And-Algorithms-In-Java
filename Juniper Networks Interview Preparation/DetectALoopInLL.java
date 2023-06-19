public class DetectALoopInLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // public static Node head;
    // public static Node tail;
    public static boolean isCycle(Node head){
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        Node linkNode = new Node(3);
        head.next.next = linkNode;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = linkNode;
        System.out.println("Does the cycle exists?"+isCycle(head));
        
    }
}
