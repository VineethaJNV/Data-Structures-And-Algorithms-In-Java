import java.util.*;
public class maxOfThreeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int maxNum = 0;
        System.out.println("Maximum of "+n1+","+n2+","+n3+"is :"+Math.max(n1, Math.max(n2,n3)));
        if( n1 > n2 && n1 > n3){
            maxNum = n1;
        }else if(n2 > n1 && n2 > n3){
            maxNum = n2;
        }else{
            maxNum = n3;
        }
        System.out.println(maxNum);
    }

}
