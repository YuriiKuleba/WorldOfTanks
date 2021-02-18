package com.luxoft.jva001p1.basics.part3.xtasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T2_BattleField {

    /**
     * TODO PUT YOUR DESIGN HERE
     */
    String[][] battleField = {
            {"B", " ", "B", " ", "B", " ", "B", " ", "B"},
            {" ", " ", " ", " ", " ", "B", " ", " ", " "},
            {" ", " ", "B", " ", " ", " ", "B", " ", "B"},
            {" ", "B", " ", "B", " ", "B", " ", " ", " "},
            {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
            {" ", "B", " ", "B", " ", "B", " ", "B", " "},
            {"B", " ", " ", " ", "B", " ", "B", " ", "B"},
            {" ", "B", " ", " ", " ", "B", " ", "B", " "},
            {"B", " ", "B", "T", "E", " ", "B", " ", "B"}
    };


    void runTheGame() throws Exception {
        printCurrentBattleField();
    }

    /**
     * Should print battle field to console output.
     */
    private void printCurrentBattleField() {
        String lits = "   | A  B  C  D  E  F  G  H  I";
        String lines = "---|---------------------------";
        System.out.print(lits + "\n" + lines + "\n");

        for (int i = 0; i < battleField.length; i++) {
            System.out.print(i + 1 + "  |");

           for (String s : battleField[i]
            ) {
                System.out.print(" " + s + " ");
            }

            System.out.println();
        }


        // TODO YOUR CODE HERE
    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.


    public static void main(String[] args) throws Exception {
        T2_BattleField bf = new T2_BattleField();
        bf.runTheGame();


    }

    public T2_BattleField() throws Exception {
    }
}