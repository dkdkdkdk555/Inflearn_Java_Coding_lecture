package 효율성.연속_부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int count = 0;
        int sum = 0;
        int i = 0;
        int k = 1; // 더한 수열 인자의 갯수
        while(i<n){
            sum += arr[i];
            if(sum<m) {
                i++; k++;
            } else if(sum>m){
                while(sum>m){
                    sum -= arr[i-(k-1)]; // m 보다 크면 맨앞에거 창문에서 제거
                    k--;
                    if(sum==m) count++; i++; k++; // 맨앞을빼줘서 count증가하고 index증가할때 그 다음이 바로 sum>m 경우면 또 k--를 빼주기때문에 여기서 k++를 해줘야한다.
                    if(sum<m) i++;
                }
            } else if(sum==m){
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}
