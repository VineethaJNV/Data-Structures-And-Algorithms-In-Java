public class HybridInheritance {
                                            //              Animal
                                            //            /       \          \
                                            //           /         \           \
                                            //      Fish          Bird            Mammal
                                            //      /   \           |             /   |    \
                                            //  Tuna    Shark     Peacock      Dog   Cat   Human
                                            //
                                            //
                                            //
    public static void main(String[] args) {

        
    }
}
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    int legs;
    void fly(){
        System.out.println("flies");
    }
}
class Mammal extends Animal{
    int hands;
    void speak(){
        System.out.println("speaks");
    }
}
class Tuna extends Fish{
    int size;
    void taste(){
        System.out.println("Very tasty");
    }
}
class Shark extends Fish{
    int lifeSpan;
    void isDangerous(){
        System.out.println("very dangerous");
    }
}
class Peacock extends Bird{
    int weight;
    void doesDance(){
        System.out.println("Dances");
    }
}
class Dog extends Mammal{
    int teeth;
    void barks(){
        System.out.println("Barks");
    }
}
class cat extends Mammal{
    int height;
    void growls(){
        System.out.println("growls");
    }
}
