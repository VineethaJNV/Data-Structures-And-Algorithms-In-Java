import java.util.Scanner;
//Write aJava program to input week number(1-7)and print day of week name using switch case
public class WeekName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int weekNo = sc.nextInt();
        switch(weekNo){
            case 7:System.out.println("Sunday");
                    break;
            case 1:System.out.println("Monday");
                    break;
            case 2:System.out.println("Tuesday");
                    break;
            case 3:System.out.println("Wednesday");
                    break;
            case 4:System.out.println("Thursday");
                    break;
            case 5:System.out.println("Friday");
                    break;
            case 6:System.out.println("Saturday");
                    break;
            default:System.out.println("Invalid no");
        }
    }
}
