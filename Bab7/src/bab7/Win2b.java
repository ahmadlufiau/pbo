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
import javax.swing.*;
public class Win2b {
    JFrame w;
    public Win2b() {
	w = new JFrame ();
	w.setTitle("layar 2");
	w.setSize(200,300);
	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	w.setVisible(true);
    }
    
    public static void main(String args[]) {
	new Win2();
    }
}