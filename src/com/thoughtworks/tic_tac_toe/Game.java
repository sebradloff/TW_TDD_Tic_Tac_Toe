package com.thoughtworks.tic_tac_toe;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void start() {
        board.drawBoard();
    }
}
