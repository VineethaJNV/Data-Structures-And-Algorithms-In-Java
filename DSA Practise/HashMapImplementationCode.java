import java.util.*;

public class HashMapImplementationCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int dataIdx = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals (key)) {
                    return dataIdx;
                }
                dataIdx++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int dataIdx = searchInLL(key, bi);

            if (dataIdx != -1) {
                Node node = buckets[bi].get(dataIdx);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / N;
            if (lambda > 2.0) {
                rehash();
            }
        }
        public boolean containsKey(K key){
            //Step 1 => Get the bucket idx
            int bi = hashFunction(key);
            int dataIdx = searchInLL(key, bi);// valid idx, if not there => -1

            if(dataIdx != -1){ //key already exists
               return true;
            }else{
               return false;
            }
            
        }
        public V get(K key){
            //Step 1 => Get the bucket idx
            int bi = hashFunction(key);
            int dataIdx = searchInLL(key, bi);// valid idx, if not there => -1

            if(dataIdx != -1){ //key already exists
            Node node = buckets[bi].get(dataIdx);
            return node.value;
            }else{
            return null;
            }
        }
        public V remove(K key){
            //Step 1 => Get the bucket idx
            int bi = hashFunction(key);
            int dataIdx = searchInLL(key, bi);// valid idx, if not there => -1

            if(dataIdx != -1){ //key already exists
                Node node = buckets[bi].remove(dataIdx);
                size--;
                return node.value;
            }else{
               return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K>keys = new ArrayList<>();
            for(int i = 0 ; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Nepal", 30);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.isEmpty());

    }
}