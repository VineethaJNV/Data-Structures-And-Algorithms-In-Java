public class MultiLevelInheritance {
    public static void main(String[] args) { //   Base Class
        Humans h1 = new Humans();            //       |
        h1.color = "brown";                  //   Derived Class
        h1.eats();                           //        |
        h1.breathes();                       //   Derived Class
        h1.legs = 2;
        h1.walks();
        h1.name = "vineetha";
        h1.speaks();


    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}
class Mammals extends Animal{
    int legs;

    void walks(){
        System.out.println("walks");
    }
}

class Humans extends Mammals{
    String name;

    void speaks(){
        System.out.println("Speaks");
    }
}
