package 효율성.공통원소구하기;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] marr = new int[m];
        for (int i = 0; i < m; i++) {
            marr[i] = scn.nextInt();
        }
        // 정렬
        Arrays.sort(narr); // 1 2 3 5 9
        Arrays.sort(marr); // 2 3 5 7 8
// 회전 수  : 총 17회
        // 바깥 배열 5
        // 안 배열 12
        //검사
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                if(narr[i]==marr[j]){
                    list.add(narr[i]);
                    break;
                } else if(narr[i]<marr[j]){
                    break;
                }
            }

        }

        // 출력
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
