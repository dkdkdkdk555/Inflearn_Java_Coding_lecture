package 정렬과탐색.장난꾸러기;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 { // 배열 복사를 하고 정렬한 뒤 기존 배열과 비교하면 아주 쉽게 풀 수 있다.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scn.nextInt();

        int[] temp = arr.clone();
        Arrays.sort(temp);

        String answer = "";
        for (int i = 0; i < n; i++) {
            if(arr[i] != temp[i]){
                answer += i+1 + " ";
            }
        }

        System.out.println(answer);
    }
}
