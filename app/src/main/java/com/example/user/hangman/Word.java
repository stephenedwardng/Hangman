package com.example.user.hangman;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class Word {

    String word;
    ArrayList<String> displayList;
    private int correct;

    public Word(String word) {
        this.word = word;
        displayList = new ArrayList<>();
        correct = 0;
    }

    public int getCorrect() {
        return correct;
    }

    public void setWord() {
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine().toLowerCase();
    }

    public String getWord() {
        return this.word;
    }

    public int wordLength() {
        return word.length();
    }

    public ArrayList<Integer> isLetterInWord(char guess) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = word.indexOf(guess);
        while (index >= 0) {
            positions.add(index + 1);
            index = word.indexOf(guess, index + 1);
            correct++;
        }
        return positions;
    }

    public ArrayList<String> display() {
        for (char letter : word.toCharArray()) {
            displayList.add("*");
        }
        return displayList;
    }

    public String displayToViewer() {
        StringBuilder formattedWord = new StringBuilder();
        for (String s : displayList) {
            formattedWord.append(s);
        }
        return formattedWord.toString();
    }



}


