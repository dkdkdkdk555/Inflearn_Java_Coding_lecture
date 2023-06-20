package 효율성.공통원소구하기;

import java.util.*;
public class TMain {
    public ArrayList<Integer> solution(int n, int m, int[] narr, int[] marr){
      ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(narr); // 1 2 3 5 9
        Arrays.sort(marr); // 2 3 5 7 8
        int p1 = 0, p2 = 0;
        while (p1<n && p2<m){
            if(narr[p1] == marr[p2]){
                answer.add(narr[p1++]); // ++가 나중에되서
                p2++;
            } else if (narr[p1]<marr[p2]) p1++;
            else p2++;
        }
      return answer;
    }
    // 회전 수 : 5
    public static void main(String[] args) {
        TMain T = new TMain();
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

        for (int x : T.solution(n, m, narr, marr)) {
            System.out.print(x + " ");
        }
    }
}
