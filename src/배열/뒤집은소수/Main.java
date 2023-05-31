package 배열.뒤집은소수;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String[] nums = new Scanner(System.in).nextLine().split(" ");
        String answer = "";
        for(String n :nums){
            StringBuffer sb = new StringBuffer(n);
            int reverseN = Integer.valueOf(sb.reverse().toString());
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
