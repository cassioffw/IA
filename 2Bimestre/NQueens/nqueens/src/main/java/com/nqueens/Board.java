package com.nqueens;
import java.util.ArrayList;
import java.util.Random;

public class Board {
	private int board[][];
	private int safePairs; 

	public Board(int[][] b) {
		this.board = b;
		ev();
	}

	public Board(int queen) {
		board = new int[queen][queen];
		for (int i = 0; i < queen; i++) {
			for (int j = 0; j <queen; j++) {
				board[i][j] = 0;
			}
		}
		randomBoard(queen);
		ev();
	}

	public void randomBoard(int size) {
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			board[i][rand.nextInt(size - 1)] = 1;
		}
	}

	public int ev() {
		safePairs = 0;
		ArrayList<Integer> pos = getPositions();

		for (int i = 0; i < board.length - 1; i++) {
			safePairs += countSafe(pos, i);
		}

		return safePairs;
	}


	public int countSafe(ArrayList<Integer> position, int i) {
		int safePair = 0;
        int count = 0;

		for (int j = i; j < board.length - 1; j++) {
			count = 0;
			//Colunas
			if (position.get(i) == position.get(j + 1)) {
				count++;
			}
			//Diagonais
			if ((position.get(i) + i) == (position.get(j + 1) + (j + 1))) {
				count++;
			}
			if ((position.get(i) - i) == (position.get(j + 1) - (j + 1))) {
				count++;
			}
			if(count == 0){
				safePair++;
			}
		}
		return safePair;
	}

	public ArrayList<Integer> getPositions() {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		for (int i = 0; i < board.length; i++) {
			pos.add(getColumn(i));
		}
		return pos;
	}

	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	public int getSafePairs() {
		return safePairs;
	}

	public void setSafePairs(int safePairs) {
		this.safePairs = safePairs;
	}

	public int getColumn(int i) {
		int index = 0;
		for (int j = 0; j < board.length; j++) {
			if (board[i][j] == 1) {
				index = j;
			}
		}

		return index;
	}

	@Override
	public String toString() {
		String o = "\n";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
                o += "|";
				if (board[i][j] == 1) {
					o += " Q ";
				} else {
					o += "   ";
				}
			}
            o += "|";
            o +="\n";
        }
		return o;
	}

}
