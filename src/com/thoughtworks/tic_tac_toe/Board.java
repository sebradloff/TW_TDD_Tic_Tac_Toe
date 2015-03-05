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

    public void setNewPosition(String position, String playerMarker){
        if (position.equals("1")){
            slots[0][0] = playerMarker;
        } else if(position.equals("2")){
            slots[0][1] = playerMarker;
        } else if(position.equals("3")){
            slots[0][2] = playerMarker;
        } else if(position.equals("4")){
            slots[1][0] = playerMarker;
        } else if(position.equals("5")){
            slots[1][1] = playerMarker;
        } else if(position.equals("6")){
            slots[1][2] = playerMarker;
        } else if(position.equals("7")){
            slots[2][0] = playerMarker;
        } else if(position.equals("8")){
            slots[2][1] = playerMarker;
        } else if(position.equals("9")){
            slots[2][2] = playerMarker;
        }
    }
}
