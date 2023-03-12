public class FindOp2HW {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y; //x = x +y x = 2 +y; x = 4
        y -= z; // y = y -z 2-2 = 0
        z /= (x + y); //z = z/4 => 2/4 = 0.5 => 0
        System.out.println(x + " " + y + " " + z);}
}
