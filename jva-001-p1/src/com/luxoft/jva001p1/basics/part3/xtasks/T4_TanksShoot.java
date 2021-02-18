package com.luxoft.jva001p1.basics.part3.xtasks;


import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class T4_TanksShoot extends JPanel {

    final boolean COLORED_MODE = false;
    final boolean IS_GRID = true;

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    // 1 - top, 2 - right, 3 - down, 4 - left
    int tankDirection = 3;

    int tankX = 128;
    int tankY = 512;

    int bulletX = -100;
    int bulletY = -100;

    int currentBulletCubeX;
    int currentBulletCubeY;

    int tankSpeed = 10;
    int bulletSpeed = 5;

    final String BRICK = "B";
    final String BLANK = " ";

    String[][] battleField = {
            {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
            {" ", " ", " ", " ", " ", " ", " ", " ", "B"},
            {"B", "B", "B", " ", "B", " ", "B", "B", "B"},
            {"B", "B", "B", " ", " ", " ", "B", "B", "B"},
            {"B", "B", "B", " ", "B", " ", "B", "B", "B"},
            {"B", "B", " ", "B", "B", "B", " ", "B", "B"},
            {"B", "B", " ", " ", " ", " ", " ", "B", "B"},
            {"B", " ", " ", "B", "B", "B", " ", " ", "B"},
            {"B", " ", " ", "B", "B", "B", " ", " ", "B"}
    };

    void runTheGame() throws Exception {
        printCurrentBattleField();

        while (true) {
            fire();
        }
    }

    /**
     * When called tank should produce new bullet.
     * This bullet should smoothly move to the opposite side.
     * <p>
     * Bullet should be destroyed when rich the opposite side.
     * <p>
     * TODO When the bullet shoot something method would clean appropriate quadrant and destroy the bullet.
     * TODO Use #checkAndProcessInterception() to check if you already shoot something.
     */
    void fire() {
        tankShooting();
//        moveTheTank(tankDirection);
        // TODO SHOULD BE UPDATED
    }

    void tankPositionWithBullet() {
        bulletX = tankX + 25;
        bulletY = tankY + 20;
    }

    /**
     * Should return true if bullet located in non-empty quadrant.
     */
    boolean checkAndProcessInterception() {
        currentBulletCubeX = bulletX / 64;
        currentBulletCubeY = bulletY / 64;
        return battleField[currentBulletCubeY][currentBulletCubeX].equals(BRICK);
        // TODO YOUR CODE HERE
    }

    private void printCurrentBattleField() {
        for (String[] row : battleField) {
            System.out.println(Arrays.toString(row));
        }
    }

    int[] getQuadrant(int x, int y) {
        return new int[]{x / 64, y / 64};
    }

    void turn(int direction) {
        tankDirection = direction;
        repaint();
    }

    void tankShooting() {
            tankPositionWithBullet();
            moveTheBullet(tankDirection);
    }

    void moveTheTank(int direction) {
        // TODO SHOULD BE ALREADY IMPLEMENTED
        switch (direction) {
            case 1:
                moveUp();
                break;
            case 2:
                moveRight();
                break;
            case 3:
                moveDown();
                break;
            case 4:
                moveLeft();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    void moveRight() {
        int k = 0;
        while (k++ < 64) {
            sleep(5);
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
        while (k++ < 64 && tankY != 0) {
            sleep(4);
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

    void moveTheBullet(int direction) {
        // TODO SHOULD BE ALREADY IMPLEMENTED
        switch (direction) {
            case 1:
                bulletUp();
                break;
            case 2:
                bulletRight();
                break;
            case 3:
                bulletDown();
                break;
            case 4:
                bulletLeft();
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    void bulletRight() {
        int k = 0;
        while (bulletX < 576 - 14) {
            if (aimed()) break;
            sleep(1);
            bulletX += 1;
            repaint();
        }
    }

    void bulletLeft() {
        int k = 0;
        while (bulletX > 0) {
            if (aimed()) break;
            sleep(5);
            bulletX -= 1;
            repaint();
        }
    }

    void bulletUp() {
        int k = 0;
        while (bulletY > 0) {
            if (aimed()) break;
            sleep(5);
            bulletY -= 1;
            repaint();
        }
    }

    void bulletDown() {
        int k = 0;
        while (bulletY < 576 - 14) {
            if (aimed()) break;
            sleep(2);
            bulletY += 1;
            repaint();
        }
    }

    private boolean aimed() {
        if (checkAndProcessInterception()) {
            battleField[currentBulletCubeY][currentBulletCubeX] = BLANK;
            return true;
        }
        return false;
    }

    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.


    public static void main(String[] args) throws Exception {
        T4_TanksShoot bf = new T4_TanksShoot();
        bf.runTheGame();
    }

    public T4_TanksShoot() throws Exception {
        JFrame frame = new JFrame("YOUR TANK SHOULD FIRE!!!");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH + 18, BF_HEIGHT + 39));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception ignore) {
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        paintBF(g);

        paintBorders(g);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(tankX, tankY, 64, 64);

        g.setColor(new Color(0, 255, 0));
        if (tankDirection == 1) {
            g.fillRect(tankX + 20, tankY, 24, 34);
        } else if (tankDirection == 3) {
            g.fillRect(tankX + 20, tankY + 30, 24, 34);
        } else if (tankDirection == 4) {
            g.fillRect(tankX, tankY + 20, 34, 24);
        } else {
            g.fillRect(tankX + 30, tankY + 20, 34, 24);
        }

        g.setColor(new Color(255, 255, 0));
        g.fillRect(bulletX, bulletY, 14, 14);
    }

    private void paintBorders(Graphics g) {
        for (int j = 0; j < battleField.length; j++) {
            for (int k = 0; k < battleField.length; k++) {
                if (battleField[j][k].equals("B")) {
                    String coordinates = getQuadrantXY(j + 1, k + 1);
                    int separator = coordinates.indexOf("_");
                    int y = Integer.parseInt(coordinates.substring(0, separator));
                    int x = Integer.parseInt(coordinates.substring(separator + 1));
                    g.setColor(new Color(0, 0, 255));
                    g.fillRect(x, y, 64, 64);

                    if (IS_GRID) {
                        g.setColor(new Color(0, 0, 0));
                        g.drawRect(x, y, 64, 64);
                    }
                }
            }
        }
    }

    private void paintBF(Graphics g) {
        super.paintComponent(g);

        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
    }

    private String getQuadrantXY(int v, int h) {
        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }

}