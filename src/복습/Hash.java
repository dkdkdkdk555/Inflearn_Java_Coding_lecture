package 복습;

import java.util.*;

public class Hash {

    // 1. 학급회장
    /*
        이전 내 풀이 : 각 후보들의 변수 싹 만들고 which문으로 ++하는 식 배열도 두번 돌리고
                    HashMap이 필요 없는 방식인데도 Map을 씀
        선생님 풀이 : Map객체를 이용하는 목적은 나와 같지만 배열을 두번 돌림
        현재 내 풀이 : 투표정산에 Map객체를 활용하는 동시에 최다득표 후보를 찾아냄
                    배열을 한번 돌려서 선생님 풀이 보다 더 효율적
     */
    public static void main1(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        char[] arr = str.toCharArray();

        int max=0;
        char maxc = ' ';
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(String.valueOf(arr[i]))){
                int k = map.get(String.valueOf(arr[i]));
                k++;
                if(k>max) {
                    max=k;
                    maxc=arr[i];
                }
                map.replace(String.valueOf(arr[i]),k);
            } else {
                map.put(String.valueOf(arr[i]), 1);
            }
        }

        System.out.println(maxc);
    }

    // 2. 아나그램(해쉬)
    /*
        다음엔 해쉬 활용해서 선생님 방식으로 풀어봐라
     */
    public static void main2(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        String m = scn.next();

        char[] narr = n.toCharArray();
        char[] marr = m.toCharArray();

        Arrays.sort(narr);
        Arrays.sort(marr);

        String nstr = String.valueOf(narr);
        String mstr = String.valueOf(marr);

        if(nstr.equals(mstr)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // 3. 매출액의 종류
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scn.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int lt=0;
        for (int rt = 0; rt < n; rt++) {
            if(!map.containsKey(arr[rt])){
                map.put(arr[rt], 1);
            } else {
                map.replace(arr[rt], map.get(arr[rt]) + 1);
            }

            if((rt-lt)==(k-1)){
                list.add(map.size());
                if(map.get(arr[lt])>1){
                    map.replace(arr[lt], map.get(arr[lt]) - 1);
                } else {
                    map.remove(arr[lt]);
                }
                lt++;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
