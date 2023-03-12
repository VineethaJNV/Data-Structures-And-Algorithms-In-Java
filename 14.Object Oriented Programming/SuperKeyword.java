public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal class constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        //super(); // Even if we don't write it explicitly, Java defaultly puts super() and calls immediate parent
        System.out.println("Horse class constructor is called");
    }
}
