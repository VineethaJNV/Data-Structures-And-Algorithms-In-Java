

public class Box {
    public static void main(String[] args) {
        int totalBoxes = 4; // Total number of boxes
        int totalSelections = 2; // Total number of selections
        combinations(1, totalBoxes, 0, totalSelections, "");
    }

    public static void combinations(int cb, int tb, int ssf, int ts, String asf) {
        System.out.println("combinations, "+"cb : "+cb+" tb : "+tb+" ssf : "+ssf+" ts : "+ts+" asf : "+asf);
        if (cb > tb) {
            if (ssf == ts) {
                System.out.println(asf);
            }
            return;
        }

        // Include the current box in the combination
        combinations(cb + 1, tb, ssf + 1, ts, asf + "i");

        // Exclude the current box from the combination
        combinations(cb + 1, tb, ssf, ts, asf + "-");
    }
}
