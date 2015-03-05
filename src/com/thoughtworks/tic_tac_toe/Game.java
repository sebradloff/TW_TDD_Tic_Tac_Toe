package com.thoughtworks.tic_tac_toe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private Board board;
    private PrintStream printStream;
    private BufferedReader reader;
    private String currentPlayerMove;

    public Game(Board board, PrintStream printStream, BufferedReader reader) {
        this.board = board;
        this.printStream = printStream;
        this.reader = reader;
    }

    public void start() throws IOException {
        board.drawBoard();
        promptUserToMakeMove();
        getPlayerInput();
    }

    public void promptUserToMakeMove() {
        printStream.println("Please enter a number between 1 and 9 to make a move:");
    }

    private void getPlayerInput() throws IOException {
       currentPlayerMove = reader.readLine();
    }

    public void setNewPlayerMove(){
        board.setNewPosition(currentPlayerMove,"X");
    }

    public void drawBoard(){
        board.drawBoard();
    }


}
