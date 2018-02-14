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
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class GUIEventHandlingChangeListener extends JFrame implements ChangeListener
{
    private JFrame frame = new JFrame();
    private JButton tbutton = new JButton("Setuju");
    public GUIEventHandlingChangeListener(){
	tbutton.addChangeListener(this);
	frame.getContentPane().setLayout(new FlowLayout());
	frame.getContentPane().add(tbutton);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void stateChanged(ChangeEvent e) {
	if (e.getSource()==tbutton) {
            JOptionPane.showMessageDialog(null, "Terjadi perubahan state pada buton 1");
	}
    }
    public static void main(String[] args) {
	new GUIEventHandlingChangeListener();
    }
}