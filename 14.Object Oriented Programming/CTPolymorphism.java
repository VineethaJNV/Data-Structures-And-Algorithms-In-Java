public class CTPolymorphism { // Poly => Many, Morph => Forms
    //Calculating Sum in many forms using mEthod Overloading => Constructor Overloading
    public static void main(String[] args) {
        Calculator c1 = new Calculator(); // There are 3 methods in same class and the method with int as parameters is called
        System.out.println(c1.sum(3,2));// And which method to be called is determined at compile time
// So it is called as compile time polymorphism
        Calculator c2 = new Calculator();
        System.out.println(c2.sum(5.0f, 12.0f));
    }
}
class Calculator{
    int sum(int a, int b){ // Function Overloading => Compile time Polymorphism
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

}
