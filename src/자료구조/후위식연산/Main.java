package 자료구조.후위식연산;

import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Stack<String> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c=='+'||c=='-'||c=='*'||c=='/'){ // 숫자인지 확인하려면 Character.isDigit(c) 메서드 활용하면 된다.
                int n1 = Integer.parseInt(String.valueOf(stack.pop()));
                int n2 = Integer.parseInt(String.valueOf(stack.pop()));
                int n = 0;
                switch (c){
                    case '+':
                        n = n1 + n2;
                        break;
                    case '-':
                        n = n2 - n1;
                        break;
                    case '*':
                        n = n1 * n2;
                        break;
                    case '/':
                        n = n2/n1;
                        break;
                }
                stack.push(Integer.toString(n));
            } else {
                stack.push(String.valueOf(c));
            }
        }

        System.out.println(stack.peek());
    }
}
