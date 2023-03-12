public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // It gives error because default constructor won't be called as we have defined other constructors
        Student s2 = new Student("Vineetha");
        Student s3 = new Student("Vsavi", 36);
        
    }
}
//By default Java creates a function only when there are no ther constructors are specified.
class Student{
    String name;
    int rollNo;

    // Student(){// Non parameterized constructor
    //     System.out.println("Empty construtor called");
    // }
    Student(String name){ //Parameterized constructor
        System.out.println("one parameter constrictor called");//   | constructor
        this.name = name;                                          //  |
    }                                                               // | overloading
    Student(String name, int rollNo){                               // |
        System.out.println("2 parameter construtor called");//
        this.name = name;                                       //
        this.rollNo = rollNo;                                   //
    }
}