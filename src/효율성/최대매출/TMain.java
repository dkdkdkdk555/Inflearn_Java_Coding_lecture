package 효율성.최대매출;

import java.util.*;

public class TMain {
    public int solution(int n, int k, int[] arr){
        int answer = 0, sum = 0;
        // 맨처음 k개꺼 더해놓기 => 창문생성
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        //창문 옮기기
        for(int i=k; i<n; i++){
            sum +=(arr[i] - arr[i-k]);
            answer = Math.max(answer, sum); //  answer이랑 sum 중에서 더 큰값으로 교체해라
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
