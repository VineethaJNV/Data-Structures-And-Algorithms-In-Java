public class TowerOfHanoi {
    public static void shiftDisks(String S, String H, String D, int n){
        if(n == 1){
            System.out.println("Shift disk"+n+" from "+S+" to -> "+D);
            return;
        }
        shiftDisks(S, D, H, n - 1);
        System.out.println("Shift disk "+n+ "th disk from "+S+"-> "+D);
        shiftDisks(H, S, D, n - 1);
    
    }
    public static void main(String[] args) {
        int n = 3;
        shiftDisks("Source", "Helper", "Destination", n);
    }
}
