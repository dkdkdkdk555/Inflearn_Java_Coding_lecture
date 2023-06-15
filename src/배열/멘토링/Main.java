package 배열.멘토링;

import java.util.*;

/**
 * 내 풀이 정답!!!! ~
 */
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner scn = new Scanner(System.in);
        int n1 = 0; // 1 학생수, 2 시험횟수
        int n2 = 0;
        for(int i=0; i<2; i++){
           if(i==0) n1 = scn.nextInt();
           else n2 = scn.nextInt();
        }
        int[][] testRes = new int[n2][n1];
        for(int i=0; i<n2; i++){
            for(int j=0; j<n1; j++){
                testRes[i][j] = scn.nextInt();
            }
        }
        // 판별
        int count = 0;
        boolean yes = false;
        Map<Integer, Integer> impl = new HashMap<>();
        Map<Integer, Integer> refuse = new HashMap<>();
        for(int i=0;i<1;i++){ // 시험횟수
            for(int j=0;j<n1;j++){ // 인원수
                int s = testRes[i][j];
                for(int k=0;k<n2;k++){
                    yes = false;
                    for(int l=0;l<n1;l++){
                        if(yes){
                            if (!impl.containsValue(testRes[k][l]) && !refuse.containsValue(testRes[k][l])){
                                impl.put(testRes[k][l], testRes[k][l]);
                            }
                        } else {
                            impl.remove(testRes[k][l]);
                            refuse.put(testRes[k][l], testRes[k][l]);
                        }
                        if(s==testRes[k][l]) yes = true;
                    }
                }
                count += impl.size();
                refuse.clear();
                impl.clear();
            }
        }
        // 출력
        System.out.println(count);
    }
}
