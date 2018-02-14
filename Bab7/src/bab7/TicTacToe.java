/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author Ahmad Lufi A U
 */
import java.awt.*;
import javax.swing.JFrame;
class TicTacToe extends Panel {
    TicTacToe() {
        setBackground(Color.DARK_GRAY);
    }
    public void paint(Graphics g) {
        g.setColor(new Color(255,255,255));
        g.setFont(new Font("Aladin",Font.PLAIN,20));
        g.drawString("Game Tic-Tac-Toe", 55, 30);
        g.setColor(Color.black);
        g.fillRect(20, 60, 70, 70);
        g.setColor(Color.white);
        g.fillRect(100, 60, 70, 70);
        g.setColor(Color.black);
        g.fillRect(180, 60, 70, 70);
        g.setColor(Color.white);
        g.fillRect(20, 140, 70, 70);
        g.setColor(Color.black);
        g.fillRect(100, 140, 70, 70);
        g.setColor(Color.white);
        g.fillRect(180, 140, 70, 70);
        g.setColor(Color.black);
        g.fillRect(20, 220, 70, 70);
        g.setColor(Color.white);
        g.fillRect(100, 220, 70, 70);
        g.setColor(Color.black);
        g.fillRect(180, 220, 70, 70);
    }
    
    public static void main(String args[]) {
        Frame f = new Frame("Game TicTacToe");
        TicTacToe gp = new TicTacToe();
        f.add(gp);
        f.setSize(280,350);
        f.setVisible(true);
        f.setLocation(500,200);
    }
}