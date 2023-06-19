public class ReverseANumber{
	public static void main(String[] args){
		int num = 10400; //o/p should be 401.
		int rev = 0;
		while(num > 0){
			int rem = num % 10;
			rev  = rev * 10+ rem;
			num = num /10;
		}
		System.out.println("The reverse of"+" "+num+" "+"is: "+rev);
	}
}