import java.util.*;
public class HW4BeautifulArrayList {
    public static ArrayList<Integer>beautifulArrayD(int n) {
        ArrayList<Integer>res=new ArrayList<>();
        divideConque(1,1,res,n);
        return res;
    }
    private static void divideConque(int start,int increment,ArrayList<Integer>res,int n) {
        if(start+increment>n) {
            res.add(start);
            return;
        }
        divideConque(start,2*increment,res,n);
        divideConque(start+increment,2*increment,res,n);
    }
    public static ArrayList<Integer>beautifulArray(int n) { //Iterative
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(Integer e:ans){
                if(2*e<=n)temp.add(e*2);
            }
            for(Integer e:ans){
                if(2*e-1<=n)temp.add(e*2-1);
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(beautifulArray(n));
        System.out.println(beautifulArrayD(n));

        
    }
}
