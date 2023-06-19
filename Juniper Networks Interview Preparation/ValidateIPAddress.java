public class ValidateIPAddress {
    /*Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type. */
    /*A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00", and "192.168@1.1" are invalid IPv4 addresses. */
    /*A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:
    1 <= xi.length <= 4
    xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
    Leading zeros are allowed in xi. */
    public static boolean isIPV4(String str){
        String strArr[] = new String[4];
        if(str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.'){
            return false;
        }
        strArr = str.split("\\.",-1);
        if(strArr.length != 4){
            return false;
        }
        for(int i = 0 ; i < strArr.length; i++){
            String octet = strArr[i];
            if(octet.length()== 0 || octet.length() > 3){
                return false;
            }
            if((octet.charAt(0) == '0') && ( octet.length() > 1)){
                return false;
            }
            if(Integer.parseInt(octet) > 255){
                return false;
            }
        }
        return true;
        
    }
    public static void printArr(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String str = "172.16.254.1";
        // String str = "192.168@1.1";
        String str = "192.168.01.1";
        System.out.println(isIPV4(str));
        
        
    }
}
