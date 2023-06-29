package 해쉬.매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TMain {

    private ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> ansewr = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k-1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        } // 미리 k-1 번 인덱스까지 map 만들어놓고 시작
        int lt = 0;
        for(int rt=k-1;rt<n;rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            ansewr.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return ansewr;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scn.nextInt();
        }
        for (Integer x : T.solution(n, k, arr)) {
            System.out.print(x+ " ");
        }
    }
}
