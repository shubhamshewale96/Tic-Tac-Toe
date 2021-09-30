/**
 * 
 */
/**
 * @author shewale
 *
 */
package com.bl.tictactoe;

public class TicTacToeGame {
	public void creationBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = (char) i;
			System.out.println(board[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to TicTocToe Game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.creationBoard();

	}
}