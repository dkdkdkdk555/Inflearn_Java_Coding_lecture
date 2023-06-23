package 효율성.연속된_자연수의_합;

import java.util.Scanner;

public class TMain2 {
    public int solution(int n){
        int answer = 0, cnt =1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }

        return answer;
    }
    // 회전 수 : 5
    public static void main(String[] args) {
        TMain2 T = new TMain2();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(T.solution(n));
    }
}
