package 배열.임시반장;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr= new int[n][5];
        for(int i=0;i<n;i++) {
            for (int j = 0; j <5; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        //판별
        /**
         * 세로열로 배열과 길이가 같은 answer배열을 생성
         * -> 생성된 배열을 이중포문 돌려서 중복되는 경우 해당 인덱스에 +1
         */
        int[] answer = new int[n]; // 학생 명수대로 길이가진 배열 생성
        int[] copyArr = new int[n]; // 세로열 복사본
        for (int i=0; i<5;i++){  // 학년 수
            for (int j=0;j<n;j++){ // 학생수만큼 돎
                copyArr[j]= arr[j][i];
            }
            // 비교
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    if(copyArr[j] == copyArr[k]){
                        answer[j] += 1;
                    }
                }
            }
        }

        //출력
        int best = 0;
        int output = 0;
        for (int i=0;i< answer.length;i++) {
            if(answer[i] > best){
                best = answer[i];
                output = i + 1;
            }
        }

        System.out.println(output);
    }
}

