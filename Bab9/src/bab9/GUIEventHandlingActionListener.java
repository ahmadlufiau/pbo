/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

/**
 *
 * @author Ahmad Lufi A U
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIEventHandlingActionListener extends JFrame implements ActionListener 
{
    private JFrame frame = new JFrame();
    private JButton tbutton1 = new JButton("Submit");
    private JButton tbutton2 = new JButton("Exit");
    public GUIEventHandlingActionListener() {
	tbutton1.addActionListener(this);
	tbutton2.addActionListener(this);
	frame.getContentPane().setLayout(new FlowLayout());
	frame.getContentPane().add(tbutton1);
	frame.getContentPane().add(tbutton2);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
	Object obj = e.getSource();
	if (obj==tbutton1)
            JOptionPane.showMessageDialog(null, "Objek button 1");
        else if (obj==tbutton2)
            System.exit(0);
            //JOptionPane.showMessageDialog(null, "Objek button 2");
    }
	
    public static void main(String[] args) {
	new GUIEventHandlingActionListener();
    }
}