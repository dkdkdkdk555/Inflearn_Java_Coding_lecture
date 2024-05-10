package 해쉬.학급회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class TMain {
    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1); // x를 가져오되 없으면 0 을 넣어라
            // 갱신됨..
        }
        int max = 0;
        for(char x : map.keySet()){
            if(map.get(x) > max){
                max = map.get(x);
                answer = x;
            }
        }

      return answer;
    }
    // 회전 수 : 5
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        System.out.println(T.solution(n, str));
    }
}
