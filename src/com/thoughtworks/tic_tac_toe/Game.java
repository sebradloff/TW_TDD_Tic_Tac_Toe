package com.thoughtworks.tic_tac_toe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private Board board;
    private PrintStream printStream;
    private BufferedReader reader;
    private String currentPlayerMove;
    private Player currentPlayer;
    private Player player1;
    private Player player2;

    public Game(Board board, PrintStream printStream, BufferedReader reader, Player player1, Player player2) {
        this.board = board;
        this.printStream = printStream;
        this.reader = reader;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void start() throws IOException {
        nextTurn();
    }

    public void nextTurn() throws IOException {
        switchPlayers();

        boolean properInput = false;

        board.drawBoard();
        promptUserToMakeMove();

        while (!properInput){
            getPlayerInput();
            properInput = setNewPlayerMove();
        };
    }


    private void switchPlayers() {
        if (currentPlayer == player1){
            currentPlayer = player2;
        } else{
            currentPlayer = player1;
        }
    }

    public void promptUserToMakeMove() {
        printStream.println("Please enter a number between 1 and 9 to make a move:");
    }

    private void getPlayerInput() throws IOException {
       currentPlayerMove = reader.readLine();
    }

    private boolean setNewPlayerMove() throws IOException {
        if (!board.setNewPosition(currentPlayerMove,currentPlayer.getMarker())){
            printStream.println("Spot is already taken or out of range!");
            return false;
        }
        return true;
    }

    public void drawBoard(){
        board.drawBoard();
    }


    public boolean isGameOver() {
        if (board.areAllSlotsFull()) {
            printStream.println("Game is a draw!");
            return true;
        } else if (board.threeInARow(currentPlayer.getMarker())){
            printStream.println("Player "+ currentPlayer.getMarker() + " wins!");
            return true;
        }
        return false;
    }
}
