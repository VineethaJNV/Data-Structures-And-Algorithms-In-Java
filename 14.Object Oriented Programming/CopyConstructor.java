public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vineetha";
        s1.rollNo = 37;
        s1.pwd = "abcd";
        Student s2 = new Student(s1); // Copy Constructor
        s2.pwd = "Navodaya";            // shallow copy happens in copy constructor
    }
}
class Student{
    String name;
    int rollNo;
    String pwd;

    Student(){

    }
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
}
