package 자료구조.크레인인형뽑기;

import java.util.*;
public class Main { // 정답
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scn.nextInt();
            }
        }
        int m = scn.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scn.nextInt();
        }
//        board[0이아니면 내려가면됨][j-1];
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                if(board[i][move-1]!=0) {
                    if(!stack.isEmpty()) {
                        if (board[i][move - 1] == stack.peek()) {
                            stack.pop();
                            count += 2;
                        } else {
                            stack.push(board[i][move - 1]);
                        }
                        board[i][move - 1] = 0;
                    } else {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                    }
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
