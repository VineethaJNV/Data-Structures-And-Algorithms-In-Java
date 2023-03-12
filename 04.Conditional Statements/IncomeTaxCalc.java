public class IncomeTaxCalc {
    public static void main(String[] args){
        int income = 3000000;

        if(income < 500000){
            System.out.println("No tax");
        }else if(income > 500000 && income <= 1000000){
            System.out.println(0.2f * income);
        }else{
            System.out.println(0.3f * income);
        }
    }
}
