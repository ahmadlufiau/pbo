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
public class MyLabel {
    JFrame layar;
    JLabel L1, L2, L3, L4;
    public MyLabel() {
	layar = new JFrame("Label Test");
	L2 = new JLabel ("Alamat	:");
	L1 = new JLabel ("Nama		:");	
	Container c = layar.getContentPane();
	c.setLayout(new FlowLayout());
    	L3 = new JLabel ("Kota		:",SwingConstants.LEFT);
	L4 = new JLabel ("Telepon	:",SwingConstants.RIGHT);
	c.add(L1);
	c.add(L2);
	c.add(L3);
	c.add(L4);
	layar.setSize(400,200);
	layar.setVisible(true);
    }
    public static void main (String argv[]) {
	new MyLabel();
    }
}