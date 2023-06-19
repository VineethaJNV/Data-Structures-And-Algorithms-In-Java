import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class HashSetSample {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();

        set.add(10);
        set.add(30);
        set.add(40);
        set.add(null);
        set.add(500);
        set.add(10);
        System.out.println(set);

        System.out.println(set.contains(10));
        System.out.println(set.contains(0));

        System.out.println(set.remove(40));
        System.out.println(set.remove(0));
        
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
