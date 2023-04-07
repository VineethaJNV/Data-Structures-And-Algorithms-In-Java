public class CircularQueueUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            this.size = n;
            this.front = -1;
            this.rear = -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }
        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static void add(int data){  //O(1)
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            System.out.println("rear index: "+rear);
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        public static int remove(){  //O(1)
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            
            //last element
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek(){ //O(1)
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            return result;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("element removed is"+q.remove());
        q.add(4);
        System.out.println("element removed is"+q.remove());
        q.add(5);

        
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
