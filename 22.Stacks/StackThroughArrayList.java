import java.util.ArrayList;

public class StackThroughArrayList{
    public static class Stack{
       static ArrayList<Integer>list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push =>list.add()
        public static void push(int data){
            list.add(data);
        }

        //pop => get top value, remove it from stack and return value
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek => get the top value
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
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