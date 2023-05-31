package 배열.소수;
import java.util.*;

public class TMain {
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2;i<=n;i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i;i<=n;j=j+i){
                    ch[j] =1;
                }
            }
        }
        return answer;
    }
}
