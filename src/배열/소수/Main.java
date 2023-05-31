package 배열.소수;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i=num;i>=0;i--){
            nums.add(i);
        }

        // 거르기
        for(int i=0;i<nums.size();i++){
            if(!(i<=1)) {
                for(int j=2;j<=nums.size();j++){
                    if(i*j<nums.size()) {
                        nums.set(i*j, 0);
                    }
                }
            }
        }

        for (int n : nums){
            System.out.println(n);
        }
//        System.out.println(nums.size());

    }
}
