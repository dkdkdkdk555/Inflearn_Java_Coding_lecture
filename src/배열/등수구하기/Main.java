package 배열.등수구하기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scn.nextInt();
        }

        List<Map<Integer, Integer>> list = new ArrayList<>();
        int best = 0;
        for(int i=0;i<n;i++){
            if(nums[i] > best) {
                best = nums[i];
                list.add(new HashMap<>(1, nums[i]));
                for(int j=0;j<list.size()-1;j++){

                }
            } else if(nums[i] == best){
                list.add(new HashMap<>(1, nums[i]));
            } else {

            }
        }
    }
}
