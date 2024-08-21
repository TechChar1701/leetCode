package src.lc.Arrays;

import java.util.ArrayList;
import java.util.List;

public class GrumpyOwner {
    public static void main(String[] args) {

    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res=0;
        int MaxGrumpy=0;
        int curr=0;
        List<Integer> lst = new ArrayList<>();
        for(int i =0; i<grumpy.length;i++){
            if(grumpy[i]==0){
                res+=customers[i];
                lst.add(0);
            }
            else {
                lst.add(customers[i]);
            }
        }
        for (int i =0; i< customers.length;i++){
           if(i<minutes){
               curr+=lst.get(i);
           }
           else {
              MaxGrumpy=Math.max(MaxGrumpy,curr);
              curr-=lst.get(i-minutes);
              curr+=lst.get(i);
           }
        }
        MaxGrumpy=Math.max(MaxGrumpy,curr);
        res+=MaxGrumpy;
        return res;

    }
}
