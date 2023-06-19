import java.util.PriorityQueue;

public class MergeKSortedLinkedList {
    /*We have K linked lists each of size N and each list is sorted in non-decreasing order, merge
them into a single sorted (non-decreasing order) linked list and print the sorted linked list as
output. */
    static class Node implements Comparable<Node>{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public int compareTo(Node n2){
            return this.data - n2.data;
        }
    }
    public static Node mergeKSortedLists(Node head1, Node head2, Node head3){
        Node temp1 = head1;
        PriorityQueue<Node>pq = new PriorityQueue<>();
        while(temp1 != null){
            pq.add(temp1);
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while(temp2 != null){
            pq.add(temp2);
            temp2 = temp2.next;
        }
        Node temp3 = head3;
        while(temp3 != null){
            pq.add(temp3);
            temp3 = temp3.next;
        }
        Node mergedHead = new Node(-1);
        Node tempNode  = mergedHead;
        while(! pq.isEmpty()){
            tempNode.next = pq.poll();
            tempNode = tempNode.next;
        }
        return mergedHead.next;

    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(7);
        head1.next.next.next = null;

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(8);
        head2.next.next.next = null;

        Node head3 = new Node(9);
        head3.next = new Node(10);
        head3.next.next = new Node(11);
        head3.next.next.next = null;

        Node mergedLLNode = mergeKSortedLists(head1, head2, head3);
        Node temp = mergedLLNode;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }
}
