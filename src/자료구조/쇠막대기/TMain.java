package 자료구조.쇠막대기;

import java.util.*;

public class TMain {
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer += stack.size(); // 레이저 지점
                else answer++; // 레이저는 아닌데 ) 인 경우
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(T.solution(str));
    }
}
