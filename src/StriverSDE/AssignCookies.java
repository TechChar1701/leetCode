package src.StriverSDE;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g= {1,2,3};
        int[] s= {1,5};
        findContentChildren(g,s);
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
       Arrays.sort(s);
       int r = 0;
       int l =0;
       int n = g.length;
       int m= s.length;
       while(m<n){
           if(g[r] <= s[l] ){
               r=r+1;
           }
           l+=1;
       }
        return r;
    }
}
