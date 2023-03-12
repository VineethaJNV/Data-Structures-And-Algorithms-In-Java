public class BinaryNotOrOnesComp {
    public static void main(String[] args) {
        System.out.println(~0); // results in -1
        System.out.println(~5);
        //gives o/p as -6 because 
        //5 is stored as (00000101)
        //~5 results as 11111010 =>considered as negative since M.S.B is 1
        // to calculate actual value of a negative number, calculate it's 2's complement
        //Steps to calculate 2's complement
        // 1.calculate 1's complement
        // 2. add 1 to L.S.B
        // 1's complement of(11111010) => is (00000101)
        //                                         + 1
        //                                    00000110 => 6
        //but since m.s.b is negative it is -6.
    }
}
