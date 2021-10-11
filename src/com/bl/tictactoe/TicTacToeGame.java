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
	static char[] gameBoard = new char[10]; // declare 1d array of char type
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
        System.out.println("\n>>>>>>>> Player Turn <<<<<<<<");
        showBoard();
        int kite = 0;
        while (kite == 0) {
            System.out.print("Enter your position [1-9] -> ");
            int playerPosition = scanner.nextInt();
            if (isEmptyCell(playerPosition)) {
                gameBoard[playerPosition] = playerLetter;
                showBoard();
                kite = 1;
            } else {
                System.out.println("\nSpace is not Empty.....plz try in another...\n");
            }
        }
    }

    /**
     * method for user move on desired location
     */
    public void computerPlaying() {
        System.out.println("\n>>>>>>>> Computer Turn <<<<<<<<\n");
        int cat = 0;
        while (cat == 0) {
            int computerPosition = random.nextInt(9) + 1;
            if (isEmptyCell(computerPosition)) {
                gameBoard[computerPosition] = computerLetter;
                showBoard();
                cat = 1;
            } else {
                System.out.println("\nSpace is not Empty.....plz try in another...\n");
            }
        }
    }

    /**
     * Method for check free space
     * cellIndex
     * @return
     */
    public static boolean isEmptyCell(int cellIndex) {
        return gameBoard[cellIndex] == ' ';
    }
    
    /**
     * method of toss for playing who play first
     */
    public void tossToPlay() {
        System.out.println("\nToss .......let's decide who play first......\nCoin flip......\nCoin flip.....\nCoin flip.....\nCoin flip......\n");
        int switchPlayer = random.nextInt(2);
        if (switchPlayer == 0) {
            System.out.println("Player Has Won The Toss ....and Play first");
            switchPlayer(0);
        } else {
            System.out.println("Computer Has Won The Toss ....and Play first");
            switchPlayer(1);
        }
    }
    /**
     *switch player as a toss for who playing first
     */
    public void switchPlayer(int switchPlayer) {
        if (switchPlayer == 0) {
            playerPlaying();
        } else {
            computerPlaying();
        }
    }


	public static void main(String[] args) {

		TicTacToeGame ticTacToeMain = new TicTacToeGame();
		System.out.println("Welcome to TicTacToe Game");
		ticTacToeMain.createGameBoard();
		ticTacToeMain.selectLetter();
		ticTacToeMain.showBoard();
		ticTacToeMain.playerPlaying();
		ticTacToeMain.computerPlaying();
		ticTacToeMain.tossToPlay();
	}
}