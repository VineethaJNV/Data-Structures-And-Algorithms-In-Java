public class FriendPairing {
    public static int waysToPairFriends(int n){
        if(n == 2 || n == 1){
            return n;
        }

        //single
        int fnm1 = waysToPairFriends(n-1);

        //pair
        int fnm2 = waysToPairFriends(n-2);
        int pairWays = (n-1)*fnm2;

        return fnm1+pairWays;
    }
    public static void main(String[] args) {
        System.out.println(waysToPairFriends(4));
    }
}
