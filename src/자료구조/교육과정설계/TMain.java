package 자료구조.교육과정설계;

import java.util.*;
public class TMain {
    public String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray())  Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        String essential = scn.next();
        String plan = scn.next();
        System.out.println(T.solution(essential, plan));
    }
}
