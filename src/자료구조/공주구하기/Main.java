package 자료구조.공주구하기;

import java.util.*;
public class Main { // 정답!
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.add(i);

        int count = 0;
        while(queue.size() > 1){
            int p = queue.poll();
            count++;
            if(count==k) count = 0;
            else queue.add(p);
        }
        System.out.println(queue.peek());
    }
}
