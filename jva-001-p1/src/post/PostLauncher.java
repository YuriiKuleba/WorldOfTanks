package post;

import java.util.ArrayList;

public class PostLauncher {


    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();

        Human peter = new Human();
        peter.setName("Peter");

        Human lola = new Human();
        lola.setName("Lola");

        Human sabrina = new Human();
        sabrina.setName("Sabrina");


        Letter letter = new Letter();
        letter.setText("Hello");
        letter.setSender(peter);
        letter.setReceiver(lola);

        Letter letter2 = new Letter();
        letter2.setText("Go away");
        letter2.setSender(lola);
        letter2.setReceiver(peter);


        postOffice.sendLetter(letter);
        postOffice.sendLetter(letter2);

        postOffice.sendLetter(peter , lola , "Go out");
        postOffice.sendLetter(sabrina , lola , "Go drink water");

        ArrayList<Letter> to = postOffice.getLetters();

        for (Letter letter1 : to) {
            System.out.println(letter1.toString());
        }

        System.out.println("========================================");

        ArrayList<Letter> letters = postOffice.getLetters(sabrina);

        if (letters.size() == 0) {

            System.out.println("There is no such receiver");
        }


        for (Letter letter1 : letters) {

            System.out.println(letter1.toString());

        }

        System.out.println("Total was sent: " + postOffice.howMuchSent()  + " letters");

    }
}