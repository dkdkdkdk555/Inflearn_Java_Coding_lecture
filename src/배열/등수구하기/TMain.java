package 배열.등수구하기;
import java.util.*;
public class TMain {
    public static void main(String[] args) {
        TMain t = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int x : t.solution(n, arr)) System.out.println(x + " ");
    }
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
