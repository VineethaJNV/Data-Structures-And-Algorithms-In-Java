import java.util.PriorityQueue;
import java.util.*;
public class ObjectsInPQ {
    static class Student implements Comparable<Student>{//overriding
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
             return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        Student s1 = new Student("Vineetha", 97);
        Student s2 = new Student("Sushma", 96);
        Student s3 = new Student("Bhavana", 95);
        Student s4 = new Student("Vanitha", 75);

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        while(!pq.isEmpty()){
            Student temp = pq.peek();
            System.out.println(temp.rank);
            pq.remove();
        }

        
    }
}
