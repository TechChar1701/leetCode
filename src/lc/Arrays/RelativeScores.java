package src.lc.Arrays;

import java.util.*;

public class RelativeScores {
    public static void main(String[] args) {
    int[] score = { 10,3,8,9,4};
    findRelativeRanks(score);
    }
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int i =0 ;i<score.length;i++){
            m1.put( score[i],i);
        }
        Arrays.sort(score);
        int rank = 1;
        for (int i = score.length - 1; i >= 0; i--) {
            int index = m1.get(score[i]);
            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
            rank++;
        }
return result;
    }
}
