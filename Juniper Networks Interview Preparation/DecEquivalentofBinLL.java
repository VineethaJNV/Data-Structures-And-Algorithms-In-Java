public class DecEquivalentofBinLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int clacDecimal(Node head){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int arr[] = new int[size];
        int i = 0;
        temp = head;
        while(temp != null){
            if(temp.data == 1){
                break;
            }
            temp = temp.next;
        }
        while(temp != null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        int result = 0;
        for(int j = 0;j < i; j ++){
            System.out.print(arr[j] +" ");
        }
        for(int j = 0; j < i; j++){
            result += arr[j]* Math.pow(2, i-j-1);
        }
        return result;
    }
    public static void main(String[] args) {
        // Node head = new Node(0);
        // head.next = new Node(0);;
        // head.next.next = new Node(0);
        // head.next.next.next = new Node(1);
        // head.next.next.next.next = new Node(1);
        // head.next.next.next.next.next = new Node(0);
        // head.next.next.next.next.next.next = new Node(0);
        // head.next.next.next.next.next.next.next = new Node(1);
        // head.next.next.next.next.next.next.next.next = new Node(0);
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        System.out.println("Decimal value is: "+clacDecimal(head));
    }
}
