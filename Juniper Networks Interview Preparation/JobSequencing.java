import java.util.ArrayList;
import java.util.*;
public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;
        Job(int deadline, int profit, int id){
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int jobSeq[][] = {{4, 20}, {1, 10}, {1, 40},{1,30}};

        ArrayList<Job>jobs = new ArrayList<>();
        for(int i = 0 ; i < jobSeq.length; i++){
            jobs.add(new Job(jobSeq[i][0], jobSeq[i][1], i));
        }
        Collections.sort(jobs, (obj1, obj2)-> obj2.profit - obj1.profit);

        ArrayList<Integer>ans = new ArrayList<>();
        int time = 0;
        int maxProfit = 0;
        for(int i = 0 ; i< jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                ans.add(curr.id);
                maxProfit+=curr.profit;
                time++;
            }
        }
        System.out.println("maximum jobs that can be performed are: "+" "+ans.size()+" "+"profit is: "+maxProfit);
        System.out.println("the jobs performed are at index: "+ans);
    }
}
