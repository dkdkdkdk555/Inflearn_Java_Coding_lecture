package 복습;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String[] strs = str.split(" ");
        int ll = 0;
        String result = "";
        for (String s : strs) {
            int len = s.toCharArray().length;
            if(len>ll) {
                ll = len;
                result = s;
            }
        }
        System.out.println(result);
    }
}
