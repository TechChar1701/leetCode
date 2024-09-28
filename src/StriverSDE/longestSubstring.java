package src.StriverSDE;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {
    public static void main(String[] args){
    String s = "abcabcbb";
    lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
    int l=0;
    Set<Character> set= new HashSet<>();
    int count =0;
    for(int r =0;r<s.length();r++){
        if(set.contains(s.charAt(r))){

                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            count = Math.max(count, r - l + 1);
        }


        return count;

    }
}
