public class HierarchicalInheritance {
    public static void main(String[] args) {//             Base Class
    Fish Dolphin = new Fish();
    Dolphin.color = "Gray" ;
    Dolphin.breathes();
    Dolphin.eats();
    Dolphin.fins = 2;                                       //           /            \
                                            //          /              \
    Birds chicken = new Birds();
    chicken.legs = 2;
    chicken.fly();
    chicken.color = "red";                       //  Derived Class       Derived class
                                            //
                                            //
                                            
    }
}
class Animal{
    String color;

    void breathes(){
        System.out.println("breaths");
    }
    void eats(){
        System.out.println("eats");
    }
}
class Birds extends Animal{
    int legs;
    void fly(){
        System.out.println("flies");
    }
}
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}