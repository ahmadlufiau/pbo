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
import javax.swing.*;
import java.awt.*;
public class MyTextField {
    private JFrame layar;
    private JTextField tf1;
    private JLabel L1,L2;
    private JPasswordField psw;
    public MyTextField() {
	layar = new JFrame("Text Field Test");
	L1 = new JLabel("User Name : ");
	L2 = new JLabel("Password : ");
	tf1= new JTextField(25);
	JPasswordField psw = new JPasswordField(20);
	Container c = layar.getContentPane();
	c.setLayout( new FlowLayout());
	c.add(L1);
	c.add(tf1);
	c.add(L2);
	c.add(psw);
	layar.setSize(400,100);
	layar.setVisible(true);
    }
    public static void main(String [] args) {
        new MyTextField();
    }
}