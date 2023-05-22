package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JFrame;
public class Game {
    public static void main(String[] args) {
        JFrame obj = new JFrame();

        GamePlay gamePlay = new GamePlay(); //Panel
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        }
    }
}