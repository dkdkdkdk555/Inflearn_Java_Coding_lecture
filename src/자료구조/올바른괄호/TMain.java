package 자료구조.올바른괄호;

import java.util.*;
public class TMain { // Stack 으로 푸는 문제

    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop(); // 맨 상단에 있는 '(' 제거
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        TMain T = new TMain();
        System.out.println(T.solution(str));
    }
}
