public class StringSplit {
    public static void main(String[] args) {
        String str = "192.168.01.1";
        String arr[] = str.split("\\.", -1);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
