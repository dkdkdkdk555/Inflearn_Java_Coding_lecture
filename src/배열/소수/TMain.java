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
        int[] ch = new int[n+1]; // n+1 해야 인덱스가 20까지 생김
        for(int i=2;i<=n;i++){
            if(ch[i] == 0){ // 처음 int 배열 생성했을때는 값이 0 이므 2는 소수임
                answer++;
                for(int j=i;i<=n;j=j+i){  // n 이하 모든 소수의 배수들을 1로 바꿈
                    ch[j] =1;
                }
            }
        }
        return answer;
    }
}
