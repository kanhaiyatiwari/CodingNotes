package com.masai.bcktraking;

public class n_Quen {

	public static void main(String[] args) {
		boolean [][]arr=new boolean[4][4];
		System.out.println(quen(arr,0));
	}
	public static int quen (boolean[][]board,int row) {
		if(row==board.length) {
			display(board);
			System.out.println("&&&&&+\n");
			return 1;
		}
		// quen
		int  count=0;
		for(int col=0;col<board.length;col++) {
			if(issafe(board,row,col)) {
				board[row][col]=true;
				count+=quen(board, row+1);
				board[row][col]=false;
			}
		}
		return count;
	}
	private static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		for(int i=0;i<row;i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
		
		int max=Math.min(row, col);
		for(int i=1;i<=max;i++) {
			if(board[row-i][col-i]) {
				return false;
			}
		}
		
		int maxr=Math.min(row, board.length-col-1);
		for(int i=1;i<=maxr;i++) {
			if(board[row-i][col+i]) {
				return false;
			}
		}
		return true;
	}
	private static void display(boolean[][] board) {
	for(boolean[] row:board) {
		for( boolean ele:row) {
			if(ele)System.out.print("Q ");
			else System.out.print("X ");
		}
		System.out.println();
		
	}

	}
}
