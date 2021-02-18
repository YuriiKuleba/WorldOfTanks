package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class T4_TanksMoveRandom extends JPanel {
    int tankX = 0;
    int tankY = 0;

    void runTheGame() {
        while (true) {
            randomMove();
            System.out.println();
        }
    }

    /**
     * One method call should smoothly move the tank one quadrant according to given direction.
     *
     * @param direction can be 1 - up, 2 - right, 3 - down, 4 - right
     */
    void move(int direction) {
        switch (direction) {
            case 1:
                if (tankY <= 0) {
                    return;
                }
                moveUp();
                System.out.println("Up");
                break;
            case 2:
                if (tankX >= BF_WIDTH - 64) {
                    return;
                }
                moveRight();
                System.out.println("Right");
                break;
            case 3:
                if (tankY >= BF_HEIGHT - 64) {
                    return;
                }
                moveDown();
                System.out.println("Down");
                break;
            case 4:
                if (tankX <= 0) {
                    return;
                }
                moveLeft();
                System.out.println("Left");
                break;
            default:
                System.out.println("Unknown command");
        }
        // TODO SHOULD BE IMPLEMENTED IN CLASS
    }

    void randomMove() {

        Random random = new Random();

        while (true) {

            move(1 + random.nextInt(4));
        }
        // TODO YOUR CODE HERE
    }

    void moveRight() {
        int k = 0;
        while (k++ < 64) {
            sleep(2);
            tankX += 1;
            repaint();
        }
    }

    void moveLeft() {
        int k = 0;
        while (k++ < 64) {
            sleep(2);
            tankX -= 1;
            repaint();
        }
    }

    void moveUp() {
        int k = 0;
        while (k++ < 64) {
            sleep(2);
            tankY -= 1;
            repaint();
        }
    }

    void moveDown() {
        int k = 0;
        while (k++ < 64) {
            sleep(2);
            tankY += 1;
            repaint();
        }
    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception {
        T4_TanksMoveRandom bf = new T4_TanksMoveRandom();
        bf.runTheGame();
    }

    public T4_TanksMoveRandom() throws Exception {
        JFrame frame = new JFrame("MOVE TANK FORWARD");
        frame.setLocation(500, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH + 18, BF_HEIGHT + 40));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        paintBF(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);
    }

    private void paintBF(Graphics g) {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (i % 2 == 0) {
                    cc = new Color(252, 241, 177);
                } else {
                    cc = new Color(233, 243, 255);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

}