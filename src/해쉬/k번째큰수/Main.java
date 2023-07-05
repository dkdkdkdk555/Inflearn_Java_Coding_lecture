package 해쉬.k번째큰수;

import java.util.*;
import java.util.stream.Collectors;

public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int k = 0;
        for (int i = 0; i < 2; i++) {
            if(i==0) n = scn.nextInt();
            else k = scn.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                for (int l = 0; l <n; l++) {
                    if(i<j&&j<l) {
                        int ln =  arr[i] + arr[j] + arr[l];
                        list.add(ln);
                    }
                }
            }
        }
        list.sort(Comparator.reverseOrder());
        List<Integer> nList = list.stream().distinct().collect(Collectors.toList());
        if(nList.size() >= k){
            System.out.println(nList.get(k-1));
        } else {
            System.out.println(-1);
        }
    }
}
