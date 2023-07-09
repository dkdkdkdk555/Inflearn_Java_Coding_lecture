package 자료구조.크레인인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class TMain {
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][move-1]!=0){
                    int tmp = board[i][move-1];
                    board[i][move-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer +=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        TMain T = new TMain();
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

        System.out.println(T.solution(board, moves));
    }
}
