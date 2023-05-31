package 배열.파보나치수열;
import java.util.*;
public class TMain {
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int x : T.solution(n)) System.out.print(x + " ");
    }
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2;i<n;i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
}
