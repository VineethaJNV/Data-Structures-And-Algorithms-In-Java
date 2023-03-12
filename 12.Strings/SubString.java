import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class SubString {
    //substring is a small part of string made up of continuous characters
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for(int i = si ; i< ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String name = "VineethaLekkala";
        System.out.println(subString(name, 0, 8));
        System.out.println(name.substring(0,8)); // ending index no inclusive
        System.out.println(name.substring(8));
    }
    
}
