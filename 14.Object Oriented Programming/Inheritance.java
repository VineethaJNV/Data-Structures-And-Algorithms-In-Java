public class Inheritance {
    public static void main(String[] args) {
        Fish goldenFish = new Fish();
        goldenFish.eat();
        goldenFish.breathe();
        goldenFish.swim();
    }
}
// Base or parent class
class AquaticLife{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Derived or Child class
class Fish extends AquaticLife{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}