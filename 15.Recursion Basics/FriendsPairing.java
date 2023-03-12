public class FriendsPairing{
    //Given n friends, each one can remain single or can pair up with another friend.
    //Each friend can be paired only once. Find ojut the total no of ways in which friends
    // can remain single or can be paired up.
    public static int noOfWays(int n){
        if(n==1 || n==2){
            return n;
        }
       int noOfWays = noOfWays(n-1) + (n-1) * noOfWays(n-2);

        return noOfWays;

    }
    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }
}