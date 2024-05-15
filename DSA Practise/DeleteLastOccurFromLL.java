public class DeleteLastOccurFromLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void printLL(Node head){

        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println();
        return;
    }
    public static Node deleteLastOccur(Node head, int key){
        Node reverseLLHead = reverseLL(head);
        
        if(reverseLLHead.data == key){
            return reverseLLHead.next;
        }
        Node prev = null;
        Node temp = reverseLLHead;
        while(reverseLLHead != null){
            if(reverseLLHead.data == key){
                prev.next = reverseLLHead.next;
                reverseLLHead.next = null;
                break;

            }
            prev = reverseLLHead;
            reverseLLHead=reverseLLHead.next;
        }
        return reverseLL(temp);
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node two = new Node(15);
        head.next = two;
        Node three = new Node(8);
        two.next = three;
        Node four = new Node(3);
        three.next = four;
        Node five = new Node(2);
        four.next = five;
        Node six = new Node(10);
        five.next = six;
        six.next = null;
        System.out.print("Original LinkedList is : ");
        printLL(head);

        Node newHead = deleteLastOccur(head, 2);
        System.out.print(" LinkedList after deleting the last occurance of the given key is : ");

        printLL(newHead);
       
        
    }
}
