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
        Game game = new Game(board, printStream, reader);
        game.start();
        game.promptUserToMakeMove();
        game.getPlayerInput();
    }
}
