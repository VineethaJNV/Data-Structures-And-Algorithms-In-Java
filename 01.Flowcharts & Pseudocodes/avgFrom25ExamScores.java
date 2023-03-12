import java.util.Scanner;
public class avgFrom25ExamScores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float avg = 0;

        for(int i = 0; i < 25; i++){
            sum+= sc.nextInt();
        }
        avg = sum /25;
        System.out.println("The average of 25 exam scores is :"+ avg);
    }
}
