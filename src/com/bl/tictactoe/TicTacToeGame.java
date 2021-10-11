/**
 * 
 */
/**
 * @author shewale
 *
 */
package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	/**
	 * declare 1d array of char type
	 */
	static char[] gameBoard = new char[10];

	/**
	 * method for creating empty GameBoard
	 */
	public void createGameBoard() {
		for (int a = 1; a < gameBoard.length; a++) {
			gameBoard[a] = ' ';
		}
	}

	public static void main(String[] args) {

		TicTacToeGame ticTacToeMain = new TicTacToeGame();

		System.out.println("Welcome to TicTacToe Game");

		ticTacToeMain.createGameBoard();
	}

}