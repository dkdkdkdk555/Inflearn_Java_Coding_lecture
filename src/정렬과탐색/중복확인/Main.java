package 정렬과탐색.중복확인;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        String answer = "U";
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : arr) {
            if(map.get(v) != null) answer = "D"; // 해쉬맵 풀이때 contains 쓰면 Time Limit Exceed 난다.
            map.put(v, v);
        }


        System.out.println(answer);
    }
}
