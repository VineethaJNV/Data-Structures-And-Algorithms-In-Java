import java.util.*;
public class ChocolaProblem {
    /*We are given a bar of chocolate composed of M*N square pieces .One should break 
    the chocolate into single squares. Each break of a part of the chocolate is 
    charged a cost expressed by a positive integer. This cost does not depend on the 
    size of the part that is being broken but only depends on the line the break goes 
    along.Let us denote the costs of breaking along consecutive vertical lines with x1, x2, 
    ....xm-1 and along horizontal lines with y1, y2, y3,...yn-1 .
    Compute  the minimal cost of breaking the whole chocolate into single squares
     * 
     */
    public static void main(String[] args) {
        int n = 4; int m = 6;
        Integer costVer[] = {2,1,3,1,4}; //Taking as integer as we need Descending order sorting
        Integer costHor[] = {4,1,2};

        //sorting the Arrays using collections.reverseorder
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        //Intialing 2 pointers and a cost variable
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] >= costHor[h]){ //Vertical cut
                int currCost = costVer[v] * hp;
                cost+=currCost;
                vp++;
                v++;
            }else{
                int currCost = costHor[h]*vp;
                hp++;
                cost += currCost;
                h++;
            }
        }
        while(h < costHor.length){
            int currCost = costHor[h]*vp;
                hp++;
                cost += currCost;
                h++;
        }
        while(v < costVer.length){
            int currCost = costVer[v] * hp;
                cost+=currCost;
                vp++;
                v++;
        }

        System.out.println("Minimum cost to break the chocola is: "+cost);
    }
}
