package com.masai.aski;

public class Na2 {

	public static void main(String[] args) {
//		boolean[][] arr={{false,false,false,false},
//				{false,false,false,false},
//				{false,false,false,false},
//				{false,false,false,false}};
		boolean [][]arr=new boolean[4][4];
		System.out.println(quin(arr,0));
	}
	
	
	public static int quin(boolean[][]arr,int row) {
		if(row==arr.length) {
			display(arr,row);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
			return 1;
		}
		int count=0;
		for(int col=0;col<arr[0].length;col++) {
			if(issafe(arr,row,col)) {
				arr[row][col]=true;
				count+=quin(arr, row+1);
				arr[row][col]=false;
			}
		}
		return count;
	}
	private static boolean issafe(boolean[][] board, int row, int col) {
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
	private static void display(boolean[][] arr, int row) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==true)System.out.print("Q ");
				else System.out.print("- ");
			}
			System.out.println();
		}
	}
}
