package src.lc.Arrays;

import java.util.Arrays;

public class WeightBoat {
    public static void main(String[] args) {
        int[] people = {2,2,2,1};
        int limit = 3;
        numRescueBoats(people,limit);
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0, left =0, right = people.length-1;
        while (left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                //There's condition that only two people can be accomodated
            }
            right--;
            boats++;
        }
        return boats;
    }
}
