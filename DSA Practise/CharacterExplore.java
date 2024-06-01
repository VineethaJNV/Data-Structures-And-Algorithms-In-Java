public class CharacterExplore {
    public static void main(String[] args) {
        char ch = 'a';
        
        char capital = Character.toUpperCase(ch);
        System.out.println(capital);
        char newCapital = Character.toUpperCase((char)(int)ch);
        System.out.println(newCapital);
    }
}
