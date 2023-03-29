public class StackThroughLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    public static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        //push => addFirst

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop =>Delete first

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek => return head data
        public static int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println();
    }
}
