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
//MyButton.java
import javax.swing.*;
import java.awt.*;
public class MyButton {
    private JFrame layar;
    private JLabel L1, L2;
    private JTextField tf1;
    private JPasswordField psw;
    JButton b1, b2;
    public MyButton() {
	layar = new JFrame("TextField Test");
	L1 = new JLabel("User Name: ");
	tf1 = new JTextField(25);
	L2 = new JLabel("Password: ");
	psw = new JPasswordField(25);
	b1 = new JButton("OK");
	b2 = new JButton("Cancel");
	Container c = layar.getContentPane();
	c.setLayout(new FlowLayout());
	c.add(L1);
	c.add(tf1);
	c.add(L2);
	c.add(psw);
	c.add(b1);
	c.add(b2);
	layar.setSize(900,80);
	layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	layar.setVisible(true);
    }
    public static void main(String[] args) {
	MyButton mb = new MyButton();
    }
}