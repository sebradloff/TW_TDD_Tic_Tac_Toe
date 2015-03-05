package com.thoughtworks.tic_tac_toe;

/**
 * Created by sradloff on 3/5/15.
 */
public class Player {
    private String marker;
    
    public Player(String marker){
        this.marker = marker;
    }

    public String getMarker() {
        return marker;
    }
}
