import java.util.Scanner;
public class PenPencilEraserHW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen + pencil + eraser;
        int $ = 25;
        System.out.println($);
        float billwithgst = Float.sum(bill, (bill*18)/100);

        System.out.println("bill exclusive of GST " +bill);
        System.out.println("bill inclusive of GST "+billwithgst);
    }
}
