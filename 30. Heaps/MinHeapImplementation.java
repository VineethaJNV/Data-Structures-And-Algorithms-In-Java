import java.util.ArrayList;
public class MinHeapImplementation {
    static class Heap{
        ArrayList<Integer>list = new ArrayList<>();

        public void add(int data){ //O(log n )
            //Add at last idx 
            list.add(data);
            int childIdx = list.size() - 1;
            int parIdx = (childIdx - 1) / 2;
            //In min heap, child value is greater than parent
            //if not fix it
            while(list.get(childIdx) < list.get(parIdx)){ //O(log n)
                //swap
                int temp = list.get(childIdx);
                list.set(childIdx, list.get(parIdx));
                list.set(parIdx, temp);

                childIdx = parIdx;
                parIdx  = (childIdx -1)/2;

            }
        }
        public int peek(){
            return list.get(0);
        }
        private void heapify(int idx){ //heapify is a private function which no other class can use
            int leftChildIdx = 2 * idx + 1;
            int rightChildIdx = 2 * idx + 2;
            int minIdx = idx; //Assuming that min is my root so that we can compare

            //if we are calling heapify for or leaf node, it's right and left child are not there so checking for it
            if(leftChildIdx < list.size()-1 && list.get(leftChildIdx) < list.get(minIdx)){
                minIdx = leftChildIdx;
            }
            if(rightChildIdx < list.size() - 1 && list.get(rightChildIdx) < list.get(minIdx)){
                minIdx = rightChildIdx;
            }

            if(minIdx != idx){ // if heap doesn't need fixing
            // we need to swap if root is not the min element
            //swap
            int temp = list.get(idx);
            list.set(idx, list.get(minIdx));
            list.set(minIdx, temp);

            //if while fixing this 3 nodes, if another heap got unfixed
            //so call heapify
            heapify(minIdx); //call heapify for that idx, whose value you have changed

            }
        }
        public int remove(){
            int data = list.get(0); // storing it to return
            //step 1 => swap
            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size() - 1, temp);

            //step 2 => remove last element
            list.remove(list.size() - 1);

            //step 3 => fix the heap
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(5);

        while(! pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }
}
