public class StringCompEquals {
    public static void main(String[] args){
        String name = "Vineetha";
        String preferredName = "Vineetha";
        String legalName = new String("Vineetha");

        if(name == preferredName){ // == checks at object level & both name , preferredName are pointing to same "Vineetha" so java says thay are equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(name == legalName){ // leagelName is created with new keyword so another "vineetha" is cerated in new memory and both are pointing to different objects so java says they are unequal
        
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(name.equals(legalName)){ // Interning concept in Java, so using .equals() function of strings helps.equals function checks only value
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
