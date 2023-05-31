package 배열.임시반장;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //판별
        int[] whothebest = new int[n]; // 행
        for(int j=0;j<n;j++) {
            int[] newArr = new int[n]; // 검사열 배열생성
            for(int i=0;i<n;j++) {
                newArr[j] = arr[j][i]; // 값 이식
            }
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                    if(newArr[i]==newArr[k]){
                        whothebest[i] += 1;
                    }
                }
            }
        }

        //출력
        for(int i=0;i<n;i++){
            System.out.println(whothebest[i]);
        }
    }
}

