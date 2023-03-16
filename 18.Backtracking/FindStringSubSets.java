public class FindStringSubSets {
    //find and print all subsets of a given string

    public static void printSubSets(String str, String ans, int idx){
        //base case
        if(idx == str.length()){
            if(ans == ""){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // kaam
        printSubSets(str, ans+str.charAt(idx), idx+1);
        printSubSets(str, ans, idx+1);
      

    }
    public static void main(String[] args) {
        printSubSets("abc", "", 0);
        
    }
}
