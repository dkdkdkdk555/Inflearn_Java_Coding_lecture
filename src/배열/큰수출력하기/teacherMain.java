package 배열.큰수출력하기;

import java.util.*;
public class teacherMain {
    public static void main(String[] args) {
        teacherMain m = new teacherMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int x : m.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // 첫번째 수 무조건 추가
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }
}
