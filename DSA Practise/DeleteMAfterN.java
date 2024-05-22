public class DeleteMAfterN {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node createLL(int [] nums){
        Node head = new Node(-1);
        Node temp = head;
        int idx = 0;
        while(idx < nums.length){
            Node newNode = new Node(nums[idx]);
            temp.next = newNode;
            temp = newNode;
            idx++;
        }
        return head.next;
    }
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println();
    }
    public static Node deleteNAfterM(Node head, int n, int m){
        // Node temp = head;
        Node newNode = new Node(-1);
        Node temp=newNode;
        Node ll1=head;
        int m1=0;
        int n1=0;
        while(ll1!=null){
            while(m1!=m){
                temp.next=ll1;
                ll1=ll1.next;
                temp=temp.next;
                m1++;
            }
            m1 = 0;
            while(n1!=n){
                ll1=ll1.next;
                n1++;
            }
            n1 = 0;
            temp.next = ll1;
        }
        return newNode.next;

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        Node head = createLL(nums);
        printLL(head);
        int m = 2;
        int n = 2;
        System.out.print("After deleting : ");
        Node headModified = deleteNAfterM(head, n, m);
        printLL(headModified);

    }
}
