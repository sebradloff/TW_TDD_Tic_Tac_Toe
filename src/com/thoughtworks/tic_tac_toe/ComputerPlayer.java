package com.thoughtworks.tic_tac_toe;

/**
 * Created by sradloff on 3/5/15.
 */
public class ComputerPlayer extends Player{

    private Board board;

    public ComputerPlayer(String marker, Board board) {
        this.marker = marker;
        this.board = board;
    }

    public void makeMoveToEmptySpace() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board.spotIsEmpty(i,j)){
                    String position = convertToInteger(i,j);
                    board.setNewPosition(position, marker);
                }
            }
        }

    }

    private String convertToInteger(int num1, int num2){
        if (num1 == 0 && num2 == 0){
            return "1";
        } else if (num1 == 0 && num2 == 1){
            return "2";
        } else if (num1 == 0 && num2 == 2){
            return "3";
        } else if (num1 == 1 && num2 == 0){
            return "4";
        } else if (num1 == 1 && num2 == 1){
            return "5";
        } else if (num1 == 1 && num2 == 2){
            return "6";
        } else if (num1 == 2 && num2 == 0){
            return "7";
        } else if (num1 == 2 && num2 == 1){
            return "8";
        } else if (num1 == 2 && num2 == 2){
            return "9";
        }

        return "-1";
    }
}
