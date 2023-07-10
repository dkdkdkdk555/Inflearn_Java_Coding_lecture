package 자료구조.쇠막대기;
import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int count = 0;
        boolean razer = false;
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for (char c : str.toCharArray()) {
            if(c=='('){
                stack.push(c);
                razer = false;
            } else { // )
                if(razer){ // ) 나왔어도 직전이 레이져 였다면
                   num++; // 레이저 자르기 전에 끝나는 막대기 조각 갯수 세야하니
                   stack.pop();
                   continue;
                }
                char top = stack.peek();
                if(top=='('){  //  () 레이저다.
                    // 레이저 빼고 조각 세주기
                    stack.pop();
                    count += (stack.size() + num);
                    num = 0;
                    razer = true;
                }
            }
        }

        System.out.println(count+num); // 마지막 레이저 이후 남은 조각들은 ).. 일테니 그 갯수만큼 더해주기 위해

    }
}
