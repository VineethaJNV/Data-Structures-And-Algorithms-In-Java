public class FindSubSets {
    public static void printSubSets(String str, String ans, int i){
        if(i == str.length()){
           if(ans.length()  == 0){
            System.out.println("null");
           }else{
            System.out.println(ans);
           }
            return;
        }
            printSubSets(str, ans+str.charAt(i), i+1);
            printSubSets(str, ans, i+1);
       
    }
    public static void main(String[] args) {
        String name = "vin";
        printSubSets(name, "",0);
    }
}
