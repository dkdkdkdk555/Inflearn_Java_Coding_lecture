package 배열.가위바위보;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(); // 판 횟수
        String[] aInf = new Scanner(System.in).nextLine().split(" "); // A의 수
        String[] bInf = new Scanner(System.in).nextLine().split(" "); // B의 수

        // 수 비교
        for(int i=0;i<num; i++){
            if(aInf[i].equals("1") && bInf[i].equals("2")){
                System.out.println("B");
            }
            if (aInf[i].equals("1") && bInf[i].equals("3")) {
                System.out.println("A");
            }
            if (aInf[i].equals("2") && bInf[i].equals("1")) {
                System.out.println("A");
            }
            if (aInf[i].equals("2") && bInf[i].equals("3")) {
                System.out.println("B");
            }
            if (aInf[i].equals("3") && bInf[i].equals("1")) {
                System.out.println("B");
            }
            if (aInf[i].equals("3") && bInf[i].equals("2")) {
                System.out.println("A");
            }
            if (aInf[i].equals(bInf[i])){
                System.out.println("D");
            }
        }

    }
}
