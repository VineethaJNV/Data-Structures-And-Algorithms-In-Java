public class StringCharAtMethod {
    public static void printCharacters(String str){

        for(int i = 0 ; i< str.length();i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String fullName = "Vineetha Lekkala";

        System.out.println(fullName.charAt(0));

        printCharacters(fullName);
    }
}
