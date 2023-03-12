public class ConvertFirstLetterOfWordToUpper {//CodeNation
    //For a given string convert the first letter of each word to UpperCase
    public static String ConvertFirstLetterOfWordToUpper(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1; i < str.length(); i++){ //O(N)
            sb.append(str.charAt(i));
            if(str.charAt(i) == ' ' && i < str.length()-1){//to check if the string has trailing spaces
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String greeting = "hi, i am vineetha";
        String greeting1 = "hello WORLD";
        System.out.println(ConvertFirstLetterOfWordToUpper(greeting));
        System.out.println(ConvertFirstLetterOfWordToUpper(greeting1));
    }
}
