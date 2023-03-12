public class FindOp1HW {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
                            //     T && F = T
        if(x > y && y > z){ // 200 > 50 && 50 > 100
            System.out.println("Hello"); // won't get executed
        }
        if(z > y && z < x){        //100 > 50 T && 100 < 200T
            System.out.println("Java"); // executes
        }
        if((y+200) < x && (y+150) < z){         // 250 < 200 (F) &&
            System.out.println("Hello Java"); // won't get executed
        }
    }
}
