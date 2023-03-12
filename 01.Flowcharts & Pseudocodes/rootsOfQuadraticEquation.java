import java.util.Scanner;
public class rootsOfQuadraticEquation {
    public static void main(String[] args){
        //ax^2+bx+c
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int descriminant = (b*b) - 4*a*c;
        System.out.println("discriminant" + descriminant);
        if(descriminant >= 0){ //descriminant > 0 => 2 distinct real roots
            System.out.println(((-b)+Math.sqrt(descriminant))/2*a);// descrimant == 0 => 1 repeated real root
            System.out.println(((-b)-Math.sqrt(descriminant))/2*a);
        }else{
            double imgPart = (-b)/2*a;
            double realPart = Math.sqrt((-descriminant /2*a));
            System.out.println(imgPart +"+"+ imgPart+"j");
            System.out.print(realPart+"-"+imgPart+"j");
        }

    }
}
