import java.util.Scanner;
public class areaOfCircleHW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = 3.14 * radius*radius;
        System.out.println("Area of a circle of radius: "+radius+"is"+area);
    }
    
}
