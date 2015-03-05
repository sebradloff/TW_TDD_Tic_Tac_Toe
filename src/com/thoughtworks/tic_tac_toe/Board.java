package com.thoughtworks.tic_tac_toe;

import java.io.PrintStream;

public class Board {

    private PrintStream printStream;
    private String[][] slots = { {" "," "," "}, {" "," ", " "}, {" "," "," "} };

    public Board(PrintStream printStream){
        this.printStream = printStream;
    }

    public void drawBoard() {
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
               if (j == 1){
                   printStream.print("|");
               }
               printStream.print(slots[i][j]);
               if (j == 1){
                   printStream.print("|");
               }
           }
           printStream.println();
           if (i != 2) {
               printStream.println("-----");
           }
       }
    }

    public boolean setNewPosition(String position, String playerMarker){
        boolean emptySpot = true;
        if (position.equals("1")){
            if (spotIsEmpty(0,0)){
                slots[0][0] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }
        } else if(position.equals("2")){
            if (spotIsEmpty(0,1)){
                slots[0][1] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("3")){
            if (spotIsEmpty(0,2)){
                slots[0][2] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("4")){
            if (spotIsEmpty(1,0)){
                slots[1][0] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("5")){
            if (spotIsEmpty(1,1)){
                slots[1][1] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("6")){
            if (spotIsEmpty(1,2)){
                slots[1][2] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("7")){
            if (spotIsEmpty(2,0)){
                slots[2][0] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("8")){
            if (spotIsEmpty(2,1)){
                slots[2][1] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        } else if(position.equals("9")){
            if (spotIsEmpty(2,2)){
                slots[2][2] = playerMarker;
                return emptySpot;
            } else{
                return false;
            }

        }

        return false;
    }

    private boolean spotIsEmpty(int num1,int num2){
        if (slots[num1][num2] == " "){
            return true;
        }
        return false;
    }

    public boolean areAllSlotsFull() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (slots[i][j] == " "){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean threeInARow(String marker) {
        if (slots[0][0] == marker && slots[0][1] == marker && slots[0][2] == marker){
            return true;
        } else if (slots[1][0] == marker && slots[1][1] == marker && slots[1][2] == marker){
            return true;
        } else if (slots[2][0] == marker && slots[2][1] == marker && slots[2][2] == marker){
            return true;
        } else if (slots[0][0] == marker && slots[1][0] == marker && slots[2][0] == marker){
            return true;
        } else if (slots[0][1] == marker && slots[1][1] == marker && slots[2][1] == marker){
            return true;
        } else if (slots[0][2] == marker && slots[1][2] == marker && slots[2][2] == marker){
            return true;
        } else if (slots[0][0] == marker && slots[1][1] == marker && slots[2][2] == marker){
            return true;
        } else if (slots[0][2] == marker && slots[1][1] == marker && slots[2][0] == marker){
            return true;
        }
        return false;
    }
}
