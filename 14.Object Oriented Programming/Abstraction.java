public class Abstraction {//Hiding all the unnecessary details and showing only the important parts to the user => Abstract Classes
                        // =>  INterfaces
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c =  new Chicken();
        c.eat();
        c.walk();
        h.changeColor("Green");
        System.out.println(h.color);

        // Animal a1 = new Animal();  Cannot instantiate the type Animal => No objects for Abstract Classes
    }
}
abstract class Animal{ // we can't create objects for abstract classes
String color;
Animal(){
    System.out.println("Animal Constructor called");
    color = "Brown"; // Bydefault color of animals(i.e object of child classes will be brown)
}    
void eat(){
        System.out.println("eats");
    }
    abstract void walk();// No implementation for abstarct methods ==> Just gives Idea
    //Every Animal should have walk function but what that function performs is determined by it's subclasses, not by Animal
}
class Horse extends Animal{//The type Animal.Horse must implement the inherited abstract method Animal.walk(). It is necessary for Horse to implemnt walk function
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(String color){
        this.color = color;
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor called");
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}