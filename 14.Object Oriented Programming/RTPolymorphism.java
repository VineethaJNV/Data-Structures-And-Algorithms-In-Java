public class RTPolymorphism {//Parent and child classes both contain the same function with a different definition
    //Method OverRiding
    public static void main(String[] args) {
        Deer d1 = new Deer(); // If child class object is created, child class function is called
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
