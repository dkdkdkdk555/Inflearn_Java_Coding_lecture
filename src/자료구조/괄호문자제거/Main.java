package 자료구조.괄호문자제거;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c != ')') stack.push(c);
            else { //  c == ')'
//                char s = ' ';
//                do {
//                    if(!stack.isEmpty()) {
//                        s = stack.pop();
//                    }
//                } while(s!='(');
                // stack.pop() 은 제거하면서 제거한 요소를 리턴하기 때문에 아래처럼 로직을 줄일 수 있다.
                while(stack.pop() != '(');
            }
        }

        String answer = "";
        for (Character character : stack) {
            if(character!='(' && character!=')'){
                answer += character;
            }
        }

        System.out.println(answer);

    }
}
