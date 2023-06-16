package 효율성.두배열합치기;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] narr = new Integer[n];
        for(int i=0;i<n;i++){
            narr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        Integer[] marr = new Integer[m];
        for(int i=0;i<m;i++){
            marr[i] = scn.nextInt();
        }
        // 정렬
        List<Integer> list1 = new ArrayList<>(Arrays.asList(narr));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(marr));
        list1.addAll(list2);
        list1.sort(Comparator.naturalOrder());
        Integer[] newArr = list1.toArray(new Integer[0]);

        //출력
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
