package 해쉬.매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main2 { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        int lt = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(i+1 >= k) {
                answer.add(map.size());
                if(map.get(arr[lt])==1) map.remove(arr[lt]);
                else if (map.get(arr[lt])>1) map.put(arr[lt], map.get(arr[lt])-1);
                lt++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
