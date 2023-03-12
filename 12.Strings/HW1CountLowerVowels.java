public class HW1CountLowerVowels {
    //Count how many times lower case vowels occurred in a String entered by the user
    public static int countLowerVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //String name = "Vineetha"; //4
        String name = "Umbrella";
        System.out.println(countLowerVowels(name));
    }
}
