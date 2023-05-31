package 배열.파보나치수열;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String answer = "";
        for(int i=2;i<=num;i++){
            if(i<=2){
                answer += "1 1";
            } else { // 세번째부터
                String[] s = answer.split(" ");
                int bb = Integer.parseInt(s[i-3]);
                int b = Integer.parseInt(s[i-2]);
                int a = bb + b;
                answer += " " + a;
            }
        }

        System.out.println(answer);
    }
}
