package 효율성.연속된_자연수의_합;

import java.util.Scanner;

public class TMain {
    public int solution(int n){
        int answer = 0, sum = 0, lt =0;
        int m=n/2+1; // 연속된 자연수가 몇가지 필요한지,,
        // 15/2 + 1 = 8 이상부터는 두개 더해봐야 더 n 보다 더 크게 나옴으로
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = i+1;
        }
        for(int rt=0;rt<m;rt++){
            sum += arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }
    // 회전 수 : 5
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(T.solution(n));
    }
}
