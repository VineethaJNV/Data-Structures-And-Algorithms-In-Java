public class StringBuilderConcept {
    //Strings are immutable in java and is newly created everytime you make any changes(Interning)
    //String builders are efficient when you want to repeatedly make changes to string
    public static void main(String[] args) {
        //.toString() => converts any object to string
        int a = 10;
        //System.out.println(a.toString());
        Integer b = 10; 
        System.out.println(b.toString());   

        char cha = 'v';
        //System.out.println(cha.toString());
        Character ch1 = 'v';
        System.out.println(ch1.toString()); 

        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); // append is efficient compated to str+=
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
    }
}
