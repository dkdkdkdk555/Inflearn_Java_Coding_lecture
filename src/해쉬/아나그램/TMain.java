package 해쉬.아나그램;

import java.util.*;
public class TMain {

    private String solution(String s1, String s2){
        String ansewr = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return ansewr;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(T.solution(s1, s2));
    }
}
