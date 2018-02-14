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
public class GUIEventHandlingFocusListener extends JFrame implements FocusListener
{
    private JFrame frame = new JFrame();
    private JLabel lKota = new JLabel("Kota :", JLabel.RIGHT);
    private JLabel lProp = new JLabel("Propinsi :", JLabel.RIGHT);
    private JTextField tKota = new JTextField();
    private JTextField tProp = new JTextField();
    private JButton tbutton1 = new JButton("Submit");
    private JButton tbutton2 = new JButton("Exit");
    public GUIEventHandlingFocusListener() {
        tKota.addFocusListener(this);
        tProp.setEnabled(false);
	frame.getContentPane().setLayout(new GridLayout(2,3));
	frame.getContentPane().add(lKota);
	frame.getContentPane().add(tKota);
	frame.getContentPane().add(tbutton1);
	frame.getContentPane().add(lProp);
	frame.getContentPane().add(tProp);
	frame.getContentPane().add(tbutton2);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void focusGained(FocusEvent e){
    }
    public void focusLost(FocusEvent e) {
	String str = tKota.getText().toUpperCase();
	//if (!str.isEmpty())
	//{
	if (str.equals("JAKARTA"))
            tProp.setText("DKI");
        else if (str.equals("SEMARANG"))
            tProp.setText("JATENG");
        else if (str.equals("BANDUNG"))
            tProp.setText("JABAR");
	//}
    }
    public static void main(String[] args) {
	new GUIEventHandlingFocusListener();
    }
}