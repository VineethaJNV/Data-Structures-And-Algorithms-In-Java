import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class ActivitySelection{
    /* You are given N activities with their start and end times, Select the maximum
    umber of activities that can be performed by a single person, assuming that a person 
    can only work on a single activity at a time. Activities are sorted 
    according to end time.*/
    public static void main(String[] args) { //O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // int lastActEndTime = end[0];
        // maxAct = 1;
        // list.add(0);

        // for(int i = 1 ; i < end.length; i++){
        //     if(start[i] >= lastActEndTime){
        //         //activity select
        //         maxAct++;
        //         list.add(i);
        //         lastActEndTime = end[i];
        //     }
        // }

        //if the given activities are not sorted accoring to end time, sort them using 3D array
        //Sorting
        int activities[][] = new int[start.length][3];// new int [n][3]

        for(int i = 0 ;  i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int lastActEndTime = activities[0][2];
        maxAct = 1;
        list.add(activities[0][0]);

        for(int i = 1 ; i < end.length; i++){
            if(activities[i][1] >= lastActEndTime){
                //activity select
                maxAct++;
                list.add(activities[i][0]);
                lastActEndTime = activities[i][2];
            }
        }
        System.out.println("Max activities that can be performed are: "+maxAct);

        for(int i = 0 ; i < list.size(); i++){
            System.out.println("A"+list.get(i));
        }
        System.out.println();

        
    }
}