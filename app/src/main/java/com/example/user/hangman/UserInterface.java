package com.example.user.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class UserInterface {

    Word word;
    char choice;

    public UserInterface(String setter) {
        word = new Word(setter);
    }

    public void welcome() {
        System.out.println("Let's play hangman.");
    }

    public void position(char letter) {
        System.out.println(letter + " is in position " + word.isLetterInWord(letter));
    }

    public void askForGuess(){
        System.out.println("Which letter do you guess?");
    }

    public void displayForViewer(){
        word.display();
        System.out.println("Here is the number of letters in the word for your to guess: ");
        System.out.println(word.displayToViewer());
    }

    public char takeGuess() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        return input.charAt(0);
    }

    public void notInWord(char letter) {
        System.out.println("Sorry " + letter + " is not in word.");
    }

    public void endGame() {
        System.out.println("You lose. The word is " + word.getWord());
    }

    public void win() {
        System.out.println("You win. The word is " + word.getWord());
    }
}
