package src.lc.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CommonCharacters {
    public static void main(String[] args) {
    String[] words = {"bella","label","roller"};
    commonChars(words);
    }
    public static List<String> commonChars(String[] words) {
    List<String> l1 = new ArrayList<>();
    Map<Character,Integer> map = new HashMap<>();
    for(int i =0;i<words.length;i++){
        for(int j =0; j<words[i].length();j++){
            Character c = words[i].charAt(j);

            if(map.get(c)!= null){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }}
        int val= 0;
        for (Character key : map.keySet()) {
            if (map.get(key) >= words.length)
            {
                if(map.get(key)% words.length==0){
                 int value = map.get(key)/ words.length;
                  for(int i =0;i<value;i++){
                  l1.add(String.valueOf(key));}
                }
                else{
                    l1.add(String.valueOf(key));
                }

                }
            }
    return l1;
    }
}
