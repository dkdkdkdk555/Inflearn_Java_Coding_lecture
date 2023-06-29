package 해쉬.매출액의종류;

import java.util.*;
public class Main { // Time Limit Exceeded
    // 아마 반복문 횟수가 K*K 번이어서 그런듯 이중반복문 안쓴다고 다가 아님..
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            arr.add(i,scn.nextInt());
        }

        int rt=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        while(arr.size()>=k) {
            map.put(arr.get(rt), map.getOrDefault(arr.get(rt), 0) + 1);
            if ((rt + 1) % k == 0) {
                arr.remove(0);
                rt = 0;
                answer.add(map.size());
                map.clear();
            } else rt++;
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
