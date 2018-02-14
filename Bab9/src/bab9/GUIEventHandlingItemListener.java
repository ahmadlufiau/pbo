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
public class GUIEventHandlingItemListener extends JFrame implements ItemListener
{
    private String[] listKota = {"SURABAYA","SEMARANG","BANDUNG"};
    private String[] listProp = {"JATIM","JATENG","JABAR"};
    private JFrame frame = new JFrame();
    private JLabel lKota = new JLabel("Kota :", JLabel.RIGHT);
    private JLabel lProp = new JLabel("Propinsi :", JLabel.RIGHT);
    private JComboBox cbKota = new JComboBox(listKota);
    private JTextField tProp = new JTextField();
    public GUIEventHandlingItemListener() {
	cbKota.addItemListener(this);
	tProp.setEnabled(false);
	frame.getContentPane().setLayout(new GridLayout(2,2));
	frame.getContentPane().add(lKota);
	frame.getContentPane().add(cbKota);
	frame.getContentPane().add(lProp);
	frame.getContentPane().add(tProp);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e) {
        int index = cbKota.getSelectedIndex();
	String str = listProp[index];
	tProp.setText(str);
    }
    public static void main(String[] args) {
	new GUIEventHandlingItemListener();
    }
}