package com.thoughtworks.tic_tac_toe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        Game game = new Game(board, printStream, reader, player1, player2);
        game.start();

        boolean gameOver = false;

        do {
            game.nextTurn();
            gameOver = game.isGameOver();
        } while (gameOver == false);

        game.drawBoard();
    }
}
