public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src, String help, String dest){
        if(n == 1){
            System.out.println("Base case entered n ="+n+" "+"Source is "+src+", helper is "+help + ", dest is  "+dest);
            System.out.println("Transferring "+n +" st disk from "+"source "+ src + "to "+ dest);
            return;
        }
        // System.out.println(n-1+" disks to helper from source by using destination as helper");
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("tranfer "+n +"th diskc from source to destination directly");
        // System.out.println("recursive call 2 to transfer the n-1 disks which are on helper to destination using source as helper");
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
