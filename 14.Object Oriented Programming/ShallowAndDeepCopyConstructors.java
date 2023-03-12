public class ShallowAndDeepCopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vineetha";
        s1.rollNo = 32;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);
        s1.marks[2] = 10;
        // for(int i = 0; i < s1.marks.length; i++){
        //     System.out.println(s1.marks[i]);
        // }
        for(int i = 0 ; i < s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollNo;
    int marks[];

    Student(){
        int marks[] = new int[3];
    }
    // Student(s1){ // Shallow Copy Construcor
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     int marks[] = new int[3];
    // }
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        int marks[] = new int[3];
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}