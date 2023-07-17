package 정렬과탐색.중복확인;

import java.util.Arrays;
import java.util.Scanner;

public class TMain {
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) scn.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
