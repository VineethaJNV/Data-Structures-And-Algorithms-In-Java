public class ZigZagLL {
    //Given a LinkedList 1->2->3->4->5, convert it to 1->5->2->4->3
    //1.Find mid node -> last node of first half => fast = head.next
    //2.Find the reverse of second half =>palindrome question => to iterate backwards in a linkedin liest, reverse it
    //3.Alternate merging
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public static void zigZag(Node head){
        //find mid node
        Node mid = findMid(head);

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node lHead = head;
        Node rHead = prev;
        Node nextL, nextR;
        
        //Alternate merging or zig zag merging
        while(lHead != null && rHead != null){
            nextL = lHead.next;
            lHead.next = rHead;
            nextR = rHead.next;
            rHead.next = nextL;

            lHead = nextL;
            rHead = nextR;
        }

    }
    public static void printLL(Node head){
        Node temp  = head;
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLL(head);
        zigZag(head);
        printLL(head);
    }
}
