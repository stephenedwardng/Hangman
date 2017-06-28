package com.example.user.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

    private UserInterface ui;
    private Word word;
    private int count;

    public Game(String setter){
        word = new Word(setter);
        ui = new UserInterface(setter);
        count = 0;
    }

    public void playGame(){
        ui.welcome();
        ui.displayForViewer();

        do {
            ui.askForGuess();
            char guess = ui.takeGuess();

            if (!word.isLetterInWord(guess).isEmpty()) {
                word.isLetterInWord(guess);
                ui.position(guess);
                word.displayToViewer();
            } else {
                ui.notInWord(guess);
            }
            count++;
        } while (count < 6 || word.getCorrect() <= word.wordLength()-1);

        if (word.getCorrect() >= word.wordLength()-1) {
            ui.win();
        } else if (count == 6) {
            ui.endGame();
        }

    }
}
