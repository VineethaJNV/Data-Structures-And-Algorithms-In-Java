import java.util.*;

public class StackUsing2Queue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty();
        }

        public static void push(int data){ //O(n)
            if(isEmpty()){
                q1.add(data);
            }else{
                while(! q1.isEmpty()){
                    q2.add(q1.remove());
                }
                q1.add(data);
                while(! q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            
        }
        public static int pop(){
            return q1.remove();
        }

        //  public static int pop(){ //O(n)
        //     if(isEmpty()){
        //         System.out.println("Stack is empty");
        //         return -1;
        //     }
        //     int top = -1;
        //     if(! q1.isEmpty()){
        //         while(!q1.isEmpty()){
        //             top = q1.remove();
        //             if(q1.isEmpty()){
        //                 break;
        //             }
        //         }
        //         q2.add(top);
        //     }else{
               
        //             while(!q2.isEmpty()){
        //                 top = q2.remove();
        //                 if(q2.isEmpty()){
        //                     break;
        //                 }
        //             }
        //             q1.add(top);
                
        //     }
        //     return top;                                                                                                     

        // } 
        
        public static int peek(){
            return q1.peek();
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
    }
}
