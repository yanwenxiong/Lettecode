package com.tju.se.leetcode.array;


public class GameofLife {
	public void gameOfLife(int[][] board) {
		int row = board.length;
		if(row == 0) 
			return;
		int col = board[0].length;
		int[][] newBoard = new int[row+2][col+2];
		for(int i = 1; i < row+1; i++) {
			for (int j = 1; j < col+1; j++) {
				newBoard[i][j] = board[i-1][j-1];
			}
		}
		for(int i = 0; i < row+2; i++) {
			newBoard[i][0] = 0;
			newBoard[i][col+1] = 0;
		}
		for(int i = 0; i < col+2; i++) {
			newBoard[0][i] = 0;
			newBoard[row+1][i] = 0;
		}
		
		int[] tempis = {-1,-1,-1,0,0,1,1,1};
		int[] tempjs = {-1,0,1,-1,1,-1,0,1};
		int tempLiveCells = 0;
		for(int i = 1; i < row+1; i++) {
			for (int j = 1; j < col; j++) {
				for (int k = 0; k < 8; k++) {
					if(newBoard[i+tempis[k]][j+tempjs[k]] == 1) {
						tempLiveCells++;
					}
				}
				if(tempLiveCells < 2) {
					board[i-1][j-1] = 0;
				} else if (tempLiveCells == 2 || tempLiveCells == 3) {
					if(newBoard[i-1][j-1] == 0 && tempLiveCells == 3) {
						newBoard[i-1][j-1] = 1;
					}
					continue;
				} else if (tempLiveCells > 3) {
					board[i-1][j-1] = 0;
				}
				tempLiveCells = 0;
			}
		}
		
	}
}
