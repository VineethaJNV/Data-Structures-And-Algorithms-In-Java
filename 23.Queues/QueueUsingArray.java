public class QueueUsingArray{

    public static class Queue{
        public static int arr[];
        public static int size;
        public static int rear;

        public Queue(int size){
            arr = new int[size];
            this.size = size;
            this.rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void enQueue(int data){ //O(1)
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
            return;
        }
        public static int  deque(){  //O(n)
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = 0;
            int data = arr[front];
            for(int i = 0 ; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return data;
        }

        public static int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = 0;
            int data = arr[front];
            return data;
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(0) ;
        q.enQueue(1);   
        q.enQueue(2);

        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.deque();
        }
    }
}