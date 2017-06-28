package com.example.user.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Runner {

    public static void main(String[] arg) throws InterruptedException{
        Game game = new Game("elise");
        game.playGame();
    }
}
