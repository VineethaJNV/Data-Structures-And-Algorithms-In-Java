public class CheckIfLLIsPalindrome {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static void addLast(int data){
        Node newNode = new Node( data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

    }
    public static boolean isPalindromicLinkedList(Node head){
        if(head == null  || head.next == null){
            return true;
        }
        //step1-Find mid
        Node midNode = findMid(head);

        //step 2-reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //check if fist and secind half are same
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    
    }
    public static boolean isPalindromeLL(Node head){ //Using another Data Stucture
        Node temp = head;                           // O(n), O(n)
        int size = 0;
        while(temp!= null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int arr[] = new int[size];
        int i = 0;
        while(temp != null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        for(int j = 0 ; j < arr.length; j++){
            System.out.println(arr[j] +" ");
        }
        System.out.println();
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        CheckIfLLIsPalindrome ll = new CheckIfLLIsPalindrome();
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(2);
        addLast(1);
        printLL(head);
        if(isPalindromeLL(head)){
            System.out.println("LinkedList is a palindrome");
        }else{
            System.out.println("LL is not a palindrome");
        }
        if(isPalindromicLinkedList(head)){
            System.out.println("LinkedList is a palindrome");
        }else{
            System.out.println("LL is not a palindrome");
        }

    }
}
