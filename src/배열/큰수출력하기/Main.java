package 배열.큰수출력하기;

import java.util.*;
/**
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        Scanner scn2 = new Scanner(System.in);
        String[] nums = scn2.nextLine().split(" ");
        String answer = "";
        for(int i=0; i<num;i++){
            if(i==0){
                answer += nums[i] + " "; // 첫번째 수는 무조건 출력
            } else if(Integer.parseInt(nums[i]) > Integer.parseInt(nums[i-1])) {
                answer += nums[i] + " ";
            }
        }

        System.out.println(answer);
    }
}
