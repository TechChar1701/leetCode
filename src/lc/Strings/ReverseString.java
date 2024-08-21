package src.lc.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String[] s= { "h","e","l","l","o"};
        reverseString(s);
    }
    public static void reverseString(String[] s) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i< s.length;i++){
        sb.append(s[i]);
    }
    sb.reverse();
    for(int i =0;i<s.length-1; i++){
        s[i]= String.valueOf(sb.charAt(i));
    }

    }
}
