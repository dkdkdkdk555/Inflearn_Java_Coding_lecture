package 배열.보이는학생;
import java.util.*;
public class TMain {

    public int solution(int n, int[] arr){
        int answer=1, max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
