public class AdultOrNot{
    public static void main(String[] args){
        int age = 16;
        if(age >= 18 ){
            System.out.println("Is an adult : can drive, can vote");
        }
        if(age> 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Is not an adult");
        }
    }
}