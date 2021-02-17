package com.luxoft.jva001p1.basics.part2.xtasks;

import javax.swing.*;
import java.awt.*;

public class T2_TanksMoveForever extends JPanel {
    int tankX = 0;
    int tankY = 0;
    int cell = 64;

    void runTheGame() {
        sleep(500);
        moveX();
        moveY();
        // TODO YOUR CODE HERE
    }

    void moveX() {
        while (tankX <= BF_WIDTH) {
            moveRight();
            System.out.println(tankX + "+");
            if (tankX >= BF_WIDTH  - cell) {
                while (tankX != 0) {
                    moveLeft();
                    System.out.println(tankX + "-");
                }
            }
        }
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

    void moveY() {
        while (tankY <= BF_HEIGHT) {
            moveDown();
            System.out.println(tankY + "+");
            if (tankY >= BF_HEIGHT - cell) {
                while (tankY != 0)
                    moveUp();
                System.out.println(tankX + "-");
            }
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

    void moveUp() {
        int k = 0;
        while (k++ < 64) {
            sleep(2);
            tankY -= 1;
            repaint();
        }

    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    public static void main(String[] args) throws Exception {
        T2_TanksMoveForever bf = new T2_TanksMoveForever();
        bf.runTheGame();
    }

    public T2_TanksMoveForever() throws Exception {
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