public class Main
{
    public static void main(String[] args) {
     int a[] = {1,2,3,4};
     int j = 0;
     boolean check = false;
     int count = 0;

     if(j+1 < a.length && a[j] < a[j+1]){
          while(j+1 < a.length && a[j] < a[j+1] ){
          check = true;
           j++;
          }
     }
     else{
         while(a[j] > a[j+1] && j+1 < a.length){
         check = true;
         j++;
         }
     }
     System.out.println(j);
     if(j == a.length-1){
         check = true;
     }else{
         check = false;
     }

     System.out.print(check);
    }
}