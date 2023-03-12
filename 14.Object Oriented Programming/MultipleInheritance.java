public class MultipleInheritance {
    //    Carnivore  Herbivore
    //          \     /
    //           Bear
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.dangerous();
        b1.eatsGrass();
        b1.eatsMeat();
        b1.isPet();
    }
}
interface Carnivore{
    void eatsMeat();
    void dangerous();

}
interface Herbivore{
    void eatsGrass();
    void isPet();
}
class Bear implements Carnivore, Herbivore{
    public void eatsMeat(){
        System.out.println(" Eats Meat");
    }
    public void dangerous(){
        System.out.println("Is not dangerous");
    }
    public void eatsGrass(){
        System.out.println("Eats grass");
    }
    public void isPet(){
        System.out.println("Is not a pet");
    }
}