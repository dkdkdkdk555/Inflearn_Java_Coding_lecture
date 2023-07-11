package 자료구조.교육과정설계;
import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String essential = scn.next();
        String plan = scn.next();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < plan.length(); i++) queue.add(plan.charAt(i));

        String str = "";
        for (Character c : queue) {
            if(essential.contains(c.toString())){
                str += c;
            }
        }

        if(str.equals(essential)) System.out.println("YES");
        else System.out.println("NO");
    }
}
