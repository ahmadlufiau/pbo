/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author Ahmad Lufi A U
 */
import java.awt.*;
import javax.swing.*;
public class Win3 extends javax.swing.JFrame {
    public Win3() {
	JButton tombol = new JButton("Tombol");
	//Container c;
	getContentPane().add(tombol);
	setSize(300,80);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
    }
    public static void main(String[] args) {
	new Win3();
    }
}