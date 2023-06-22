package 효율성.연속_부분수열;

import java.util.Scanner;

public class TMain {
    public int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt =0;
        for (int rt = 0; rt<n ; rt++) { // 증가하고
            sum += arr[rt]; // 더하고
            if(sum==m) answer++; // 확인
            while(sum>=m){ // 크거나 같아질때까지
                sum-=arr[lt++]; // 빼고나서 lt 증가
                if(sum==m) answer++;
            }
        }
        return answer;
    }
    // 회전 수 : 5
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
