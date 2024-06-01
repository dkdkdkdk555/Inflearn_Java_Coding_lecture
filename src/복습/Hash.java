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
    public static void main3(String[] args) {
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


    // 4. 모든 아나그램 찾기
    public static void main4(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();

        int rt = t.toCharArray().length;
        int count = 0;
        char[] tchars = t.toCharArray();

        Arrays.sort(tchars);

        for (int lt = 0; lt < s.toCharArray().length-(t.toCharArray().length -1); lt++) {
            char[] schars = s.substring(lt, rt).toCharArray();
            Arrays.sort(schars);
            rt++;
            if(String.valueOf(tchars).equals(String.valueOf(schars))){
                count++;
            }
        }

        System.out.println(count);
    }

    // 5. K번째 큰 수
    // sliding window 방식 말고 for문 세개 돌리는것도 괜춘,,
    // 수 더 하는건 잘했는데 정렬 및 답 구하는 로직을 못짬,, 무튼 오답
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

        int lt=0, rt=0, sum = 0;
        List<Integer> set = new ArrayList<>();

        while(rt<n){
            if((rt-lt)<3){
                sum += arr[rt];
            } else {
                sum -= arr[lt++];
                sum += arr[rt];
            }
            if((rt-lt)==2) set.add(sum);
            rt++;
        }

        Collections.sort(set, Collections.reverseOrder());
        Set<Integer> realSet = new HashSet<Integer>(set);
        List<Integer> list = new ArrayList<>(realSet);

        System.out.println(list.get(2));
    }
}
