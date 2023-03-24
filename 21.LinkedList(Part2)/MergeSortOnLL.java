
public class MergeSortOnLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static  Node findMid(Node head){
        Node slow = head;
        Node fast = head.next; //since we want mid as last node of first half

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        //Find mid => Last node of first half
        Node mid = findMid(head);

        //recusive call for left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merging the sorted parts
        return merge(newLeft, newRight);
    }
    private static  Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                temp= temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            temp= temp.next;
            head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        
        return mergedLL.next; //mergedll head is out dummy node => -1
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void printLL(Node head){
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
        MergeSortOnLL ll = new MergeSortOnLL();
        addFirst(1);
        addFirst((2));
        addFirst(3);
        addFirst(4);
        addFirst(5);
        printLL(head);
        printLL(mergeSort(head));
        
        
    }
}
