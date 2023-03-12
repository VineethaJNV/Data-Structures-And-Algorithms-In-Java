
public class ParametersVsArguments {
    public static int calcSum(int a, int b){ // function definition => formal parameters
        int sum = a+b;                       // copy of actual parameters
        return sum;
    }
    public static void main(String[] args){
        int a = 5;
        int b =10;
        int sum = calcSum(a,b);// function call => actual parameters or arguments
        System.out.println(sum);
    }
    
}
