package 배열.뒤집은소수;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String[] nums = new Scanner(System.in).nextLine().split(" ");
        String answer = "";
        for(String n :nums){
            StringBuffer sb = new StringBuffer(n);
            char[] reverseNArr = sb.reverse().toString().toCharArray();
            String reverseStr = "";
            for(char c : reverseNArr) {
                if (c != '0') {
                    reverseStr += c;
                }
            }
            int reverseN = Integer.parseInt(reverseStr);
            // 소수판별
            for(int i=2;i<=reverseN;i++){

                if(i==reverseN){
                    answer += reverseN + " ";
                }
                if(reverseN%i == 0){
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
