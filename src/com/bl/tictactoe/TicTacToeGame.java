/**
 * 
 */
/**
 * @author shewale
 *
 */
package com.bl.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	char[] gameBoard = new char[10]; // declare 1d array of char type
	public char computerLetter;
	public char playerLetter;
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	/**
	 * method for creating empty GameBoard
	 */
	public void createGameBoard() {
		for (int a = 1; a < gameBoard.length; a++) {
			gameBoard[a] = ' ';
		}
	}

	/**
	 * method for choose Letter X or O
	 */
	public void selectLetter() {
		int flag = 0;
		while (flag == 0) {
			System.out.print("\n Choose your Letter\n Press 1 -> 'X'\n Press 2 -> 'O'\n Enter your Choice -> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				playerLetter = 'X';
				computerLetter = 'O';
				System.out.println("\n Player letter -> " + playerLetter);
				System.out.println("Computer letter -> " + computerLetter);
				flag = 1;
				break;
			case 2:
				playerLetter = 'O';
				computerLetter = 'X';
				System.out.println("\nPlayer letter -> " + playerLetter);
				System.out.println("Computer letter -> " + computerLetter);
				flag = 2;
				break;
			default:
				System.out.println("\n plz enter 1 or 2");
			}
		}
	}

	/**
	 * method for display Board
	 */
	public void showBoard() {
		System.out.println("  " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + "  ");
		System.out.println("----|---|----");
		System.out.println("  " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + "  ");
		System.out.println("----|---|----");
		System.out.println("  " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + "  ");
	}
	
	/**
     * method for user move on desired location
     */
    public void playerPlaying() {
        System.out.println("\n Player Turn ");
        showBoard();
        System.out.print("Enter your position [1-9] -> ");
        int playerPosition = scanner.nextInt();
        gameBoard[playerPosition] = playerLetter;
        showBoard();
    }

    /**
     * method for user move on desired location
     */
    public void computerPlaying() {
        System.out.println("\n Computer Turn \n");
        int computerPosition = random.nextInt(9) + 1;
        gameBoard[computerPosition] = computerLetter;
        showBoard();
    }

	public static void main(String[] args) {

		TicTacToeGame ticTacToeMain = new TicTacToeGame();
		System.out.println("Welcome to TicTacToe Game");
		ticTacToeMain.createGameBoard();
		ticTacToeMain.selectLetter();
		ticTacToeMain.showBoard();
		ticTacToeMain.playerPlaying();
		ticTacToeMain.computerPlaying();
	}
}