package post;

import java.util.ArrayList;

public class PostOffice {

    private ArrayList<Letter> letters;

    public PostOffice() {

        letters = new ArrayList<>();

        System.out.println("\n||Welcome to our PostOffice||\n");
    }

    public ArrayList<Letter> getLetters(Human receiver) {

        ArrayList<Letter> anotherLetters = new ArrayList<>();

        for (Letter listLetter : letters) {
            if (listLetter.getReceiver().equals(receiver)) {
                anotherLetters.add(listLetter);
            }
        }

        return anotherLetters;
    }


    public ArrayList<Letter> getLetters() {
        return letters;
    }


    public void sendLetter(Letter letter) {

        letters.add(letter);
    }

    public void sendLetter(Human sender , Human receiver , String text) {

        Letter letter = new Letter();
        letter.setText(text);
        letter.setSender(sender);
        letter.setReceiver(receiver);
        letters.add(letter);

    }


    public int howMuchSent() {

        return letters.size();
    }



}
